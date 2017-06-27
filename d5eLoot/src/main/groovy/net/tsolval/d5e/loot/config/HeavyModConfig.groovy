package net.tsolval.d5e.loot.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import net.tsolval.d5e.loot.model.Rarity
import net.tsolval.d5e.loot.model.mods.HeavyModification

/**
 * @author tsolval
 *
 */
@Configuration
class HeavyModConfig {

	@Bean HeavyModification accurateHeavy() {
		new HeavyModification(name: 'accurate', desc: 'This weapon is more accurate than its peers.', effect: '+1 to Hit', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification preciseHeavy() {
		new HeavyModification(name: 'precise', desc: 'This weapon is much more accurate than its peers.', effect: '+2 to Hit', rarity: Rarity.RARE)
	}
	@Bean HeavyModification exactingHeavy() {
		new HeavyModification(name: 'precise', desc: 'This weapon is much more accurate than its peers.', effect: '+3 to Hit', rarity :Rarity.LEGENDARY)
	}
	@Bean HeavyModification balefulHeavy() {
		new HeavyModification(name: 'baleful', desc: 'This weapon is more destructive than its peers.', effect: '+1 to Damage', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification brutalHeavy() {
		new HeavyModification(name: 'destructive', desc: 'This weapon is much more destructive than its peers.', effect: '+2 to Damage', rarity: Rarity.RARE)
	}
	@Bean HeavyModification savageHeavy() {
		new HeavyModification(name: 'destructive', desc: 'This weapon is much more destructive than its peers.', effect: '+3 to Damage', rarity: Rarity.LEGENDARY)
	}
	@Bean HeavyModification shelteringHeavy() {
		new HeavyModification(name: 'sheltering', desc: 'This weapon helps you to gain more advantage while under cover.', effect: '+2 to AC while in cover', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification sprayAndPlayHeavy() {
		new HeavyModification(name: 'Spray and Play', desc: 'Increases the reload speed of this weapon when its mag is empty.', effect: 'Bonus action to reload if mag is empty.', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification crowdControlHeavy() {
		new HeavyModification(name: 'Crowd Control', desc: 'Kills with this weapon grant bonus damage for a short time.', effect: 'Weapon deals +1d6 damage until the end of your next turn.', rarity: Rarity.RARE)
	}
	@Bean HeavyModification lightweightHeavy() {
		new HeavyModification(name: 'Lightweight', desc: 'This weapon makes you feel faster, and so you are faster.', effect: '+5 ft Movement', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification extendedMagHeavy() {
		new HeavyModification(name: 'Extended Mag', desc: 'A larger magazine.', effect: '+30% more ammo in the clip.', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification armorPiercingRoundsHeavy() {
		new HeavyModification(name: 'Armor Piercing Rounds', desc: 'These rounds are useful to penetrate cover and find targets.', effect: 'Ignore 3/4 cover. Disadvantage to hit targets in full cover.', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification penetratingRoundsHeavy() {
		new HeavyModification(name: 'Penetrating Rounds', desc: 'These iridium-core rounds overpenetrate targets.', effect: 'Can hit up to two creatures in line of fire.  Roll a separate attack for each target.', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification highCaliberRoundsHeavy() {
		new HeavyModification(name: 'Hight Caliber Rounds', desc: 'Oversize rounds built to stagger targets and leave them reeling.', effect: 'Target must make a Strength save or be knocked prone.', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification flaredMagwellHeavy() {
		new HeavyModification(name: 'Flared Magwell', desc: 'Reload this weapon quickly.', effect: 'Reload is a bonus action.', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification scopedHeavy() {
		new HeavyModification(name: 'scoped', desc: 'The scope or sight on this weapon is extremely accurate.', effect: 'double critical range', rarity: Rarity.RARE)
	}
	@Bean HeavyModification hammerForgedHeavy() {
		new HeavyModification(name: 'Hammer Forged', desc: 'This weapon has improved range and accuracy.', effect: '+30 ft range', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification hairTriggerHeavy() {
		new HeavyModification(name: 'hair trigger', desc: 'This weapon has a hair trigger, which allows you to fire more shots than normal.', effect: 'Bonus action to attack again with this weapon.', rarity: Rarity.RARE)
	}
	@Bean HeavyModification arcDamageHeavy() {
		new HeavyModification(name: 'Arc Damage', desc: 'This weapon causes Arc Damage.', effect: 'Deals arc damage.',rarity:  Rarity.LEGENDARY)
	}
	@Bean HeavyModification solarDamageHeavy() {
		new HeavyModification(name: 'Solar Damage', desc: 'This weapon causes Solar Damage.', effect: 'Deals solar damage.', rarity: Rarity.LEGENDARY)
	}
	@Bean HeavyModification voidDamageHeavy() {
		new HeavyModification(name: 'Void Damage', desc: 'This weapon causes Void Damage.', effect: 'Deals void damage.', rarity: Rarity.LEGENDARY)
	}
	@Bean HeavyModification disciplineHeavy() {
		new HeavyModification(name: 'discipline', desc: 'This gear helps grenades regenerate faster.', effect: '+1d4 Grenade Light Pool per round', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification strengthHeavy() {
		new HeavyModification(name: 'strength', desc: 'This gear helps melee attacks regenerate faster.', effect: '+1d4 Melee Light Pool per round', rarity:  Rarity.UNCOMMON)
	}
	@Bean HeavyModification intelligenceHeavy() {
		new HeavyModification(name: 'intelligence', desc: 'This gear helps super ability attacks regenerate faster.', effect: '+1d4 Super Ability Light Pool per round', rarity: Rarity.UNCOMMON)
	}
	@Bean HeavyModification inverseShadowHeavy() {
		new HeavyModification(name: 'Inverse Shadow', desc: 'This gear helps gather light from destroyed enemies.', effect: 'double light dice from destroyed enemies', rarity: Rarity.UNCOMMON)
	}
}
