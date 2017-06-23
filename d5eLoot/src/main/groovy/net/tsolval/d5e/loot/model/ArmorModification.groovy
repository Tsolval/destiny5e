package net.tsolval.d5e.loot.model

import org.springframework.stereotype.Component

/**
 * @author tsolval
 *
 */
class ArmorModification extends Modification {

	public ArmorModification() {
		setType(GearType.ARMOR)
	}
}
