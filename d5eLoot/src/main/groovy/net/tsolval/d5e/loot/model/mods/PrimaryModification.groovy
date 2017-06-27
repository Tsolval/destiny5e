package net.tsolval.d5e.loot.model.mods

import org.springframework.stereotype.Component

import net.tsolval.d5e.loot.model.GearType
import net.tsolval.d5e.loot.model.Modification

/**
 * @author tsolval
 *
 */
class PrimaryModification extends Modification {

	public PrimaryModification() {
		setType(GearType.PRIMARY)
	}
}
