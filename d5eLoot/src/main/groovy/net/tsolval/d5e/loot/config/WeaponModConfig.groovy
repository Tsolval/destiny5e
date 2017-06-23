package net.tsolval.d5e.loot.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import net.tsolval.d5e.loot.model.Rarity
import net.tsolval.d5e.loot.model.WeaponModification

/**
 * @author tsolval
 *
 */
@Configuration
class WeaponModConfig {

	@Bean WeaponModification accurate() {
		new WeaponModification(name: 'accurate', desc: 'This weapon is more accurate than its peers.', effect: '+1 to Hit', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification precise() {
		new WeaponModification(name: 'precise', desc: 'This weapon is much more accurate than its peers.', effect: '+2 to Hit', rarity: Rarity.RARE)
	}
	@Bean WeaponModification exacting() {
		new WeaponModification(name: 'precise', desc: 'This weapon is much more accurate than its peers.', effect: '+3 to Hit', rarity :Rarity.LEGENDARY)
	}
	@Bean WeaponModification baleful() {
		new WeaponModification(name: 'baleful', desc: 'This weapon is more destructive than its peers.', effect: '+1 to Damage', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification brutal() {
		new WeaponModification(name: 'destructive', desc: 'This weapon is much more destructive than its peers.', effect: '+2 to Damage', rarity: Rarity.RARE)
	}
	@Bean WeaponModification savage() {
		new WeaponModification(name: 'destructive', desc: 'This weapon is much more destructive than its peers.', effect: '+3 to Damage', rarity: Rarity.LEGENDARY)
	}
	@Bean WeaponModification sheltering() {
		new WeaponModification(name: 'sheltering', desc: 'This weapon helps you to gain more advantage while under cover.', effect: '+2 to AC while in cover', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification sprayAndPlay() {
		new WeaponModification(name: 'Spray and Play', desc: 'Increases the reload speed of this weapon when its mag is empty.', effect: 'Bonus action to reload if mag is empty.', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification crowdControl() {
		new WeaponModification(name: 'Crowd Control', desc: 'Kills with this weapon grant bonus damage for a short time.', effect: 'Weapon deals +1d6 damage until the end of your next turn.', rarity: Rarity.RARE)
	}
	@Bean WeaponModification lightweight() {
		new WeaponModification(name: 'Lightweight', desc: 'This weapon makes you feel faster, and so you are faster.', effect: '+5 ft Movement', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification extendedMag() {
		new WeaponModification(name: 'Extended Mag', desc: 'A larger magazine.', effect: '+30% more ammo in the clip.', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification armorPiercingRounds() {
		new WeaponModification(name: 'Armor Piercing Rounds', desc: 'These rounds are useful to penetrate cover and find targets.', effect: 'Ignore 3/4 cover. Disadvantage to hit targets in full cover.', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification penetratingRounds() {
		new WeaponModification(name: 'Penetrating Rounds', desc: 'These iridium-core rounds overpenetrate targets.', effect: 'Can hit up to two creatures in line of fire.  Roll a separate attack for each target.', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification highCaliberRounds() {
		new WeaponModification(name: 'Hight Caliber Rounds', desc: 'Oversize rounds built to stagger targets and leave them reeling.', effect: 'Target must make a Strength save or be knocked prone.', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification flaredMagwell() {
		new WeaponModification(name: 'Flared Magwell', desc: 'Reload this weapon quickly.', effect: 'Reload is a bonus action.', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification scoped() {
		new WeaponModification(name: 'scoped', desc: 'The scope or sight on this weapon is extremely accurate.', effect: 'double critical range', rarity: Rarity.RARE)
	}
	@Bean WeaponModification hammerForged() {
		new WeaponModification(name: 'Hammer Forged', desc: 'This weapon has improved range and accuracy.', effect: '+30 ft range', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification hairTrigger() {
		new WeaponModification(name: 'hair trigger', desc: 'This weapon has a hair trigger, which allows you to fire more shots than normal.', effect: 'Bonus action to attack again with this weapon.', rarity: Rarity.RARE)
	}
	@Bean WeaponModification arcDamage() {
		new WeaponModification(name: 'Arc Damage', desc: 'This weapon causes Arc Damage.', effect: 'Deals arc damage.',rarity:  Rarity.LEGENDARY)
	}
	@Bean WeaponModification solarDamage() {
		new WeaponModification(name: 'Solar Damage', desc: 'This weapon causes Solar Damage.', effect: 'Deals solar damage.', rarity: Rarity.LEGENDARY)
	}
	@Bean WeaponModification voidDamage() {
		new WeaponModification(name: 'Void Damage', desc: 'This weapon causes Void Damage.', effect: 'Deals void damage.', rarity: Rarity.LEGENDARY)
	}
	@Bean WeaponModification discipline() {
		new WeaponModification(name: 'discipline', desc: 'This gear helps grenades regenerate faster.', effect: '+1d4 Grenade Light Pool per round', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification strength() {
		new WeaponModification(name: 'strength', desc: 'This gear helps melee attacks regenerate faster.', effect: '+1d4 Melee Light Pool per round', rarity:  Rarity.UNCOMMON)
	}
	@Bean WeaponModification intelligence() {
		new WeaponModification(name: 'intelligence', desc: 'This gear helps super ability attacks regenerate faster.', effect: '+1d4 Super Ability Light Pool per round', rarity: Rarity.UNCOMMON)
	}
	@Bean WeaponModification inverseShadow() {
		new WeaponModification(name: 'Inverse Shadow', desc: 'This gear helps gather light from destroyed enemies.', effect: 'double light dice from destroyed enemies', rarity: Rarity.UNCOMMON)
	}
}
