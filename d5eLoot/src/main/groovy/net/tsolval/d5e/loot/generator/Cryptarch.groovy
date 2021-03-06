package net.tsolval.d5e.loot.generator

import static  net.tsolval.d5e.loot.model.GearType.*
import static  net.tsolval.d5e.loot.model.Rarity.*

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import net.tsolval.d5e.loot.model.Gear
import net.tsolval.d5e.loot.model.GearType
import net.tsolval.d5e.loot.model.Modification
import net.tsolval.d5e.loot.model.Rarity

/**
 * In Destiny The Game, the Cryptarch is responsible for decrypting an Engram and turning it into a piece of Gear.
 * 
 * @author tsolval
 */
@Component
class Cryptarch {

   @Autowired Random random
   @Autowired List<Modification> allMods

   /**
    * Decrypt a given Engram into a randomly generated piece of gear.
    * @param rarity the starting rarity of the Engram to be decoded
    * @return the randomly generated item
    */
   def decrypt(Rarity rarity) {
      def item = new Gear()
      item.rarity = getFinalRarity(rarity)
      item.type = getItemType()
      item.mods = getRandomItemMods(item)
      return item
   }

   /** This method picks random available modifications for the item. 
    * @param item The gear will get Modified
    * @return the modifications on the item
    */
   def getRandomItemMods(Gear item) {
      def mods = []
      (Rarity.COMMON..item.rarity).each{ rarity ->
         def modList = allMods.findAll { mod -> mod.rarity <= rarity && mod.type.contains(item.type) && !mods.contains(mod) }
         if (modList) {
            mods.add(modList[random.nextInt(modList.size())])
         }
      }
      return mods
   }

   /** Determine the final rarity of the item.  If we're lucky it could be better than we think.  If we're really lucky, it could be much better! 
    * @param rarity the starting rarity of the Engram
    * @return the final rarity of the decoded gear, which will be at least the Engram's rarity, possibly better
    */
   def getFinalRarity(Rarity rarity) {
      def rarityMod = random.nextInt(100)
      return rarity == EXOTIC ? EXOTIC : rarity == LEGENDARY && rarityMod <= 10 ? EXOTIC : rarityMod == 0 ? rarity.next().next() : rarityMod <= 10 ? rarity.next() : rarity
   }

   /** Determine the GearType of the gear encapsulated by this Engram. The type is either Weapon or Armor. 
    * @return the GearType of the decoded Engram
    */
   def GearType getItemType() {
      return GearType.values()[random.nextInt(GearType.values().size())]
   }
}
