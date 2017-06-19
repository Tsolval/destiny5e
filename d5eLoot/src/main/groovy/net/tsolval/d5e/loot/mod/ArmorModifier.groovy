package net.tsolval.d5e.loot.mod

import org.springframework.stereotype.Component

import net.tsolval.d5e.loot.model.GearType

/**
 * @author tsolval
 *
 */
class ArmorModifier extends Modifier {

	public ArmorModifier() {
		setType(GearType.ARMOR)
	}
}
