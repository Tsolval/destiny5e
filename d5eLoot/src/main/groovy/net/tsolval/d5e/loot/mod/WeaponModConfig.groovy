package net.tsolval.d5e.loot.mod

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author tsolval
 *
 */
@Configuration
class WeaponModConfig {

	@Bean WeaponModifier accurate() {
		new WeaponModifier(name: 'accurate', desc: 'This weapon is more accurate than its peers.', effect: '+1 to Hit')
	}
	@Bean WeaponModifier precise() {
		new WeaponModifier(name: 'precise', desc: 'This weapon is much more accurate than its peers.', effect: '+2 to Hit')
	}
	@Bean WeaponModifier baleful() {
		new WeaponModifier(name: 'baleful', desc: 'This weapon is more destructive than its peers.', effect: '+1 to Damage')
	}
	@Bean WeaponModifier destructive() {
		new WeaponModifier(name: 'destructive', desc: 'This weapon is much more destructive than its peers.', effect: '+2 to Damage')
	}
	@Bean WeaponModifier sheltering() {
		new WeaponModifier(name: 'sheltering', desc: 'This weapon allows you to shelter more easily than its peers.', effect: '+2 to AC while in cover')
	}
	@Bean WeaponModifier sprayAndPlay() {
		new WeaponModifier(name: 'Spray and Play', desc: 'Increases the reload speed of this weapon when its mag is empty.', effect: 'Bonus action to reload if mag is empty.')
	}
	@Bean WeaponModifier crowdControl() {
		new WeaponModifier(name: 'Crowd Control', desc: 'Kills with this weapon grant bonus damage for a short time.', effect: 'Weapon deals +1d6 damage until the end of your next turn.')
	}
	@Bean WeaponModifier lightweight() {
		new WeaponModifier(name: 'Lightweight', desc: 'This weapon makes you feel faster, and so you are faster.', effect: '+5 ft Movement')
	}
	@Bean WeaponModifier extendedMag() {
		new WeaponModifier(name: 'Extended Mag', desc: 'A larger magazine.', effect: '+30% more ammo in the clip.')
	}
	@Bean WeaponModifier armorPiercingRounds() {
		new WeaponModifier(name: 'Armor Piercing Rounds', desc: 'These rounds are useful to penetrate cover and find targets.', effect: 'Ignore 3/4 cover. Disadvantage to hit targets in full cover.')
	}
	@Bean WeaponModifier penetratingRounds() {
		new WeaponModifier(name: 'Penetrating Rounds', desc: 'These iridium-core rounds overpenetrate targets.', effect: 'Can hit up to two targets in line of fire.  Roll a separate attack for each.')
	}
	@Bean WeaponModifier highCaliberRounds() {
		new WeaponModifier(name: 'Hight Caliber Rounds', desc: 'Oversize rounds built to stagger targets and leave them reeling.', effect: 'Target must make a Strength save or be knocked prone.')
	}
	@Bean WeaponModifier flaredMagwell() {
		new WeaponModifier(name: 'Flared Magwell', desc: 'Reload this weapon quickly.', effect: 'Reload is a bonus action.')
	}
	@Bean WeaponModifier scoped() {
		new WeaponModifier(name: 'scoped', desc: 'The scope or sight on this weapon is extremely accurate.', effect: 'double critical range')
	}
	@Bean WeaponModifier hammerForged() {
		new WeaponModifier(name: 'Hammer Forged', desc: 'This weapon has improved range and accuracy.', effect: '+30 ft range')
	}
	@Bean WeaponModifier hairTrigger() {
		new WeaponModifier(name: 'hair trigger', desc: 'This weapon has a hair trigger, which allows you to fire more shots than normal.', effect: 'Bonus action to attack again with this weapon.')
	}
	@Bean WeaponModifier arcDamage() {
		new WeaponModifier(name: 'Arc Damage', desc: 'This weapon causes Arc Damage.', effect: 'Deals arc damage.')
	}
	@Bean WeaponModifier solarDamage() {
		new WeaponModifier(name: 'Solar Damage', desc: 'This weapon causes Solar Damage.', effect: 'Deals solar damage.')
	}
	@Bean WeaponModifier voidDamage() {
		new WeaponModifier(name: 'Void Damage', desc: 'This weapon causes Void Damage.', effect: 'Deals void damage.')
	}
	@Bean WeaponModifier discipline() {
		new WeaponModifier(name: 'discipline', desc: 'This gear helps grenades regenerate faster.', effect: '+1d4 Grenade Light Pool per round')
	}
	@Bean WeaponModifier strength() {
		new WeaponModifier(name: 'strength', desc: 'This gear helps melee attacks regenerate faster.', effect: '+1d4 Melee Light Pool per round')
	}
	@Bean WeaponModifier intelligence() {
		new WeaponModifier(name: 'intelligence', desc: 'This gear helps super ability attacks regenerate faster.', effect: '+1d4 Super Ability Light Pool per round')
	}
	@Bean WeaponModifier inverseShadow() {
		new WeaponModifier(name: 'Inverse Shadow', desc: 'This gear helps gather light from destroyed enemies.', effect: 'double light dice from destroyed enemies')
	}
}
