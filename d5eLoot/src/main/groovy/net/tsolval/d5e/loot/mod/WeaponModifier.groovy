package net.tsolval.d5e.loot.mod

import org.springframework.stereotype.Component

import net.tsolval.d5e.loot.model.GearType

/**
 * @author tsolval
 *
 */
class WeaponModifier extends Modifier {

	public WeaponModifier() {
		setType(GearType.WEAPON)
	}
}
