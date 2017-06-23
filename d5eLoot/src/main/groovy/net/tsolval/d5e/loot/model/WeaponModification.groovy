package net.tsolval.d5e.loot.model

import org.springframework.stereotype.Component

/**
 * @author tsolval
 *
 */
class WeaponModification extends Modification {

	public WeaponModification() {
		setType(GearType.WEAPON)
	}
}
