package net.tsolval.d5e.loot.generator

import static  net.tsolval.d5e.loot.model.EngramRarity.*
import static  net.tsolval.d5e.loot.model.GearType.*

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import net.tsolval.d5e.loot.mod.ArmorModifier
import net.tsolval.d5e.loot.mod.WeaponModifier
import net.tsolval.d5e.loot.model.EngramRarity
import net.tsolval.d5e.loot.model.Equipment
import net.tsolval.d5e.loot.model.GearType

/**
 * @author tsolval
 *
 */
@Component
class Cryptarch {

	@Autowired Random random
	@Autowired List<ArmorModifier> armorMods
	@Autowired List<WeaponModifier> weaponMods

	/**
	 * Decrypt a given engram.
	 * @return
	 */
	def decrypt(EngramRarity rarity) {
		def item = new Equipment()
		item.rarity = getFinalRarity(rarity)
		item.type = getItemType()
		item.mods = altGetItemMods(item)
		return item
	}

	/** alternative method to get available mods for the item. */
	def altGetItemMods(def item) {
		def mods = [].toSet()
		EngramRarity.values().each { r ->
			if(r < item.rarity) {
				def modList = item.type.toString().toLowerCase()+"Mods"
				mods.add(this."${modList}"[random.nextInt(this."${modList}".size())])
			}
		}
		return mods
	}

	/** Pick from available mods for the item. **/
	def getItemMods(def item) {
		def modCount = 0
		def mods = [].toSet()

		switch (item.rarity) {
			case EXOTIC:
				modCount++
			case LEGENDARY:
				modCount++
			case RARE:
				modCount++
			case UNCOMMON:
				modCount++
		}
		switch (item.type) {
			case ARMOR:
				while (mods.size() < modCount) {
					mods.add(armorMods[random.nextInt(armorMods.size())])
				}
				break
			case WEAPON:
				while (mods.size() < modCount) {
					mods.add(weaponMods[random.nextInt(weaponMods.size())])
				}
				break
		}
		return mods
	}

	/** Determine the final rarity of the item.  If we're lucky it could be better than we think.  If we're really lucky, it could be much better! */
	def getFinalRarity(EngramRarity rarity) {
		def rarityMod = random.nextInt(100)
		return rarity == EXOTIC ? EXOTIC : rarity == LEGENDARY && rarityMod <= 10 ? EXOTIC : rarityMod == 0 ? rarity.next().next() : rarityMod <= 10 ? rarity.next() : rarity
	}

	/** Determine what type of item we are decrypting **/
	def GearType getItemType() {
		return GearType.values()[random.nextInt(2)]
	}
}
