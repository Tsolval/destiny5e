package net.tsolval.d5e.loot.model

import groovy.transform.ToString

/**
 * @author tsolval
 *
 */
@ToString(includePackage=false, includeNames=true )
class Gear {
	def rarity
	def type
	def mods
}
