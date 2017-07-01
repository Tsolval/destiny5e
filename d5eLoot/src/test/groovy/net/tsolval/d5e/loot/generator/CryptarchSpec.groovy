package net.tsolval.d5e.loot.generator;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration

import net.tsolval.d5e.loot.Application
import net.tsolval.d5e.loot.model.Gear
import net.tsolval.d5e.loot.model.GearType
import net.tsolval.d5e.loot.model.Modification
import net.tsolval.d5e.loot.model.Rarity
import spock.lang.Specification
/**
 * @author tsolval
 *
 */
@ContextConfiguration(classes=[Application.class])
class CryptarchSpec extends Specification {

   @Autowired Cryptarch cryptarch

   def "test that decrypting an engram generates random gear"() {
      when: "you decrypt an engram of a specific rarity"
      Gear gear = cryptarch.decrypt(rarity)

      then: "you get an item which has no fewer than the base number of mods"
      assert gear.mods.size() >= modCount

      and: "the generated gear has the appropriate number of mods for the new rarity"
      assert gear.mods.size() == gear.rarity.ordinal()

      and: "there are no duplicate mods"
      assert gear.mods.clone().unique().size() == gear.mods.size()

      where: "these values are used for testing"
      rarity | modCount
      Rarity.COMMON | 0
      Rarity.UNCOMMON | 1
      Rarity.RARE | 2
      Rarity.LEGENDARY | 3
      Rarity.EXOTIC | 4
   }

   def "test get random item mods" () {
      given: "an item with a known rarity and type"
      Gear gear = new Gear(rarity: Rarity.RARE, type: GearType.PULSE_RIFLE)

      when: "we get random modifications for the item"
      Modification[] mods = cryptarch.getRandomItemMods(gear)

      then: "the appropriate number of mods are selected"
      assert mods.size() == Rarity.RARE.ordinal()

      and: "included mods are the appropriate type and rarity"
      mods.each { mod ->
         assert mod.rarity<=Rarity.RARE
         assert mod.type.contains(GearType.PULSE_RIFLE)
      }
   }
}
