package net.tsolval.d5e.loot.generator;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration

import net.tsolval.d5e.loot.Application
import net.tsolval.d5e.loot.model.Rarity
import net.tsolval.d5e.loot.model.mods.ArmorModification
import spock.lang.Specification
/**
 * @author tsolval
 *
 */
@ContextConfiguration(classes=[Application.class])
class CryptarchSpec extends Specification {

	@Autowired List<ArmorModification> armorMods
	@Autowired Cryptarch cryptarch

	def "test that decrypting an engram generates random gear"() {
		when: "you decrypt an engram of a specific rarity"
		def gear = cryptarch.decrypt(rarity)

		then: "you get an item which has no fewer than the base number of mods"
		assert gear.mods.size() >= modCount

		and: "the generated gear has the appropriate number of mods for the new rarity"
		if (gear.mods.rarity == Rarity.COMMON    ) {
			assert gear.mods.size() == 0
		}
		if (gear.mods.rarity == Rarity.UNCOMMON  ) {
			assert gear.mods.size() == 1
		}
		if (gear.mods.rarity == Rarity.RARE      ) {
			assert gear.mods.size() == 2
		}
		if (gear.mods.rarity == Rarity.LEGENDARY ) {
			assert gear.mods.size() == 3
		}
		if (gear.mods.rarity == Rarity.EXOTIC    ) {
			assert gear.mods.size() == 4
		}

		and: "there are no duplicate mods"
		assert gear.mods.clone().unique().size() == gear.mods.size()

		where: "these values are used for testing"
		rarity | modCount
		Rarity.COMMON | 0
		Rarity.UNCOMMON | 1
		Rarity.RARE | 2
		Rarity.LEGENDARY | 3
		Rarity.EXOTIC | 3
	}

	def "test modification list filter"() {
		when: "you filter the modifications list by UNCOMMON rarity"
		def modList = armorMods.findAll {it -> it.rarity <= Rarity.UNCOMMON}

		then: "the new list includes 'defensive'"
		assert modList.find{ it.name =~ 'defensive' }

		and: "the new list does not include 'protective'"
		assert !modList.find{ it.name =~ 'protective' }
	}
}
