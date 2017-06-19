package net.tsolval.d5e.loot.generator;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration

import net.tsolval.d5e.loot.Application
import net.tsolval.d5e.loot.model.EngramRarity
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
	}
}
