package net.tsolval.d5e.loot.model

import groovy.transform.ToString

/**
 * Represents a Modifier on a piece of gear.  A modifier changes the attributes of gear and can make them better at what they do.  They can also make the item worse, or curse the item. 
 * @author tsolval
 *
 */
@ToString(includes= ["name"], includePackage=false )
abstract class Modification {
	String name
	String desc
	String effect
	GearType type
	Rarity rarity
}
