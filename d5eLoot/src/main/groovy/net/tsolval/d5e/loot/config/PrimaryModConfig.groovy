package net.tsolval.d5e.loot.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import net.tsolval.d5e.loot.model.Rarity
import net.tsolval.d5e.loot.model.mods.PrimaryModification
/**
 * @author tsolval
 *
 */
@Configuration
class PrimaryModConfig {

	@Bean PrimaryModification accuratePrimary() {
		new PrimaryModification(name: 'accurate', desc: 'This weapon is more accurate than its peers.', effect: '+1 to Hit', rarity: Rarity.UNCOMMON)
	}
	@Bean PrimaryModification precisePrimary() {
	 new PrimaryModification(name: 'precise', desc: 'This weapon is much more accurate than its peers.', effect: '+2 to Hit', rarity: Rarity.RARE)
	 }
	 @Bean PrimaryModification exactingPrimary() {
	 new PrimaryModification(name: 'precise', desc: 'This weapon is much more accurate than its peers.', effect: '+3 to Hit', rarity :Rarity.LEGENDARY)
	 }
	 @Bean PrimaryModification balefulPrimary() {
	 new PrimaryModification(name: 'baleful', desc: 'This weapon is more destructive than its peers.', effect: '+1 to Damage', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification brutalPrimary() {
	 new PrimaryModification(name: 'destructive', desc: 'This weapon is much more destructive than its peers.', effect: '+2 to Damage', rarity: Rarity.RARE)
	 }
	 @Bean PrimaryModification savagePrimary() {
	 new PrimaryModification(name: 'destructive', desc: 'This weapon is much more destructive than its peers.', effect: '+3 to Damage', rarity: Rarity.LEGENDARY)
	 }
	 @Bean PrimaryModification shelteringPrimary() {
	 new PrimaryModification(name: 'sheltering', desc: 'This weapon helps you to gain more advantage while under cover.', effect: '+2 to AC while in cover', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification sprayAndPlayPrimary() {
	 new PrimaryModification(name: 'Spray and Play', desc: 'Increases the reload speed of this weapon when its mag is empty.', effect: 'Bonus action to reload if mag is empty.', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification crowdControlPrimary() {
	 new PrimaryModification(name: 'Crowd Control', desc: 'Kills with this weapon grant bonus damage for a short time.', effect: 'Weapon deals +1d6 damage until the end of your next turn.', rarity: Rarity.RARE)
	 }
	 @Bean PrimaryModification lightweightPrimary() {
	 new PrimaryModification(name: 'Lightweight', desc: 'This weapon makes you feel faster, and so you are faster.', effect: '+5 ft Movement', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification extendedMagPrimary() {
	 new PrimaryModification(name: 'Extended Mag', desc: 'A larger magazine.', effect: '+30% more ammo in the clip.', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification armorPiercingRoundsPrimary() {
	 new PrimaryModification(name: 'Armor Piercing Rounds', desc: 'These rounds are useful to penetrate cover and find targets.', effect: 'Ignore 3/4 cover. Disadvantage to hit targets in full cover.', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification penetratingRoundsPrimary() {
	 new PrimaryModification(name: 'Penetrating Rounds', desc: 'These iridium-core rounds overpenetrate targets.', effect: 'Can hit up to two creatures in line of fire.  Roll a separate attack for each target.', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification highCaliberRoundsPrimary() {
	 new PrimaryModification(name: 'Hight Caliber Rounds', desc: 'Oversize rounds built to stagger targets and leave them reeling.', effect: 'Target must make a Strength save or be knocked prone.', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification flaredMagwellPrimary() {
	 new PrimaryModification(name: 'Flared Magwell', desc: 'Reload this weapon quickly.', effect: 'Reload is a bonus action.', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification scopedPrimary() {
	 new PrimaryModification(name: 'scoped', desc: 'The scope or sight on this weapon is extremely accurate.', effect: 'double critical range', rarity: Rarity.RARE)
	 }
	 @Bean PrimaryModification hammerForgedPrimary() {
	 new PrimaryModification(name: 'Hammer Forged', desc: 'This weapon has improved range and accuracy.', effect: '+30 ft range', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification hairTriggerPrimary() {
	 new PrimaryModification(name: 'hair trigger', desc: 'This weapon has a hair trigger, which allows you to fire more shots than normal.', effect: 'Bonus action to attack again with this weapon.', rarity: Rarity.RARE)
	 }
	 @Bean PrimaryModification arcDamagePrimary() {
	 new PrimaryModification(name: 'Arc Damage', desc: 'This weapon causes Arc Damage.', effect: 'Deals arc damage.',rarity:  Rarity.LEGENDARY)
	 }
	 @Bean PrimaryModification solarDamagePrimary() {
	 new PrimaryModification(name: 'Solar Damage', desc: 'This weapon causes Solar Damage.', effect: 'Deals solar damage.', rarity: Rarity.LEGENDARY)
	 }
	 @Bean PrimaryModification voidDamagePrimary() {
	 new PrimaryModification(name: 'Void Damage', desc: 'This weapon causes Void Damage.', effect: 'Deals void damage.', rarity: Rarity.LEGENDARY)
	 }
	 @Bean PrimaryModification disciplinePrimary() {
	 new PrimaryModification(name: 'discipline', desc: 'This gear helps grenades regenerate faster.', effect: '+1d4 Grenade Light Pool per round', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification strengthPrimary() {
	 new PrimaryModification(name: 'strength', desc: 'This gear helps melee attacks regenerate faster.', effect: '+1d4 Melee Light Pool per round', rarity:  Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification intelligencePrimary() {
	 new PrimaryModification(name: 'intelligence', desc: 'This gear helps super ability attacks regenerate faster.', effect: '+1d4 Super Ability Light Pool per round', rarity: Rarity.UNCOMMON)
	 }
	 @Bean PrimaryModification inverseShadowPrimary() {
	 new PrimaryModification(name: 'Inverse Shadow', desc: 'This gear helps gather light from destroyed enemies.', effect: 'double light dice from destroyed enemies', rarity: Rarity.UNCOMMON)
	 } 
}
