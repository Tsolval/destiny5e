package net.tsolval.d5e.loot.generator;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration

import net.tsolval.d5e.loot.Application
import net.tsolval.d5e.loot.model.EngramRarity
import net.tsolval.d5e.loot.model.Equipment
import net.tsolval.d5e.loot.model.GearType
import spock.lang.Specification
/**
 * @author tsolval
 *
 */
@ContextConfiguration(classes=[Application.class])
class CryptarchSpec extends Specification {

	@Autowired Cryptarch cryptarch
	def "test cryptarch class"() {

		expect:
		for( i in 1..10) {
			println(cryptarch.decrypt(EngramRarity.UNCOMMON))
		}

		def item = new Equipment(rarity: EngramRarity.RARE, type: GearType.ARMOR)
		cryptarch.altGetItemMods(item)
	}
}
