package net.tsolval.d5e.loot.model;

import static org.junit.Assert.*

import org.junit.Test

import groovy.util.logging.Commons

class RarityTest extends GroovyTestCase {

	@Test
	public void testCreate() throws Exception {
		assert Rarity.COMMON.toString() == "COMMON"
		assert Rarity.create("0")==Rarity.COMMON
		assert Rarity.create("UNCOMMON") == Rarity.UNCOMMON
		assert Rarity.create("legendary") == Rarity.LEGENDARY
		shouldFail(ArrayIndexOutOfBoundsException){ Rarity.create("12")  }
		shouldFail(IllegalArgumentException) { Rarity.create("does not exist") }
	}
}
