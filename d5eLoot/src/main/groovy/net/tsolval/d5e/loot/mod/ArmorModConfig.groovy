package net.tsolval.d5e.loot.mod

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author tsolval
 *
 */
@Configuration
class ArmorModConfig {

	@Bean ArmorModifier defensive() {
		new ArmorModifier(name: 'defensive', desc: 'This armor is more protective than other armor in its class.', effect: 'AC +1')
	}
	@Bean ArmorModifier protective() {
		new ArmorModifier(name: 'protective', desc: 'This armor is more protective than other armor in its class.', effect: 'AC +2')
	}
	@Bean ArmorModifier hasty() {
		new ArmorModifier(name: 'hasty', desc: 'This armor is fitted with reflex motivators, subtly enhancing your speed.', effect: 'Speed +5 ft.')
	}
	@Bean ArmorModifier speedy() {
		new ArmorModifier(name: 'speedy', desc: 'This armor is fitted with reflex motivators and spring loaded boots, greatly enhancing your speed.', effect: 'Speed +10 ft.')
	}
	@Bean ArmorModifier forceful() {
		new ArmorModifier(name: 'forceful', desc: 'This armor is fitted with an exoskeleton which enhances the strength of the wearer', effect: 'Strength +1')
	}
	@Bean ArmorModifier powerful() {
		new ArmorModifier(name: 'powerful', desc: 'This armor is fitted with an exoskeleton which greatly enhances the strength of the wearer', effect: 'Strength +2')
	}
	@Bean ArmorModifier adept() {
		new ArmorModifier(name: 'adept', desc: 'This armor is fitted with an exoskeleton which enhances the dexterity of the wearer', effect: 'Dexterity +1')
	}
	@Bean ArmorModifier agile() {
		new ArmorModifier(name: 'agile', desc: 'This armor is fitted with an exoskeleton which greatly enhances the dexterity of the wearer', effect: 'Dexterity +2')
	}
	@Bean ArmorModifier hardy() {
		new ArmorModifier(name: 'hardy', desc: 'This armor is fitted with an exoskeleton which enhances the constitution of the wearer', effect: 'Constitution +1')
	}
	@Bean ArmorModifier robust() {
		new ArmorModifier(name: 'robust', desc: 'This armor is fitted with an exoskeleton which greatly enhances the constitution of the wearer', effect: 'Constitution +2')
	}
	@Bean ArmorModifier clever() {
		new ArmorModifier(name: 'clever', desc: 'This armor is fitted with a neural network which enhances the intelligence of the wearer', effect: 'Intelligence +1')
	}
	@Bean ArmorModifier astute() {
		new ArmorModifier(name: 'astute', desc: 'This armor is fitted with a neural network which greatly enhances the intelligence of the wearer', effect: 'Intelligence +2')
	}
	@Bean ArmorModifier canny() {
		new ArmorModifier(name: 'canny', desc: 'This armor is fitted with a neural network which enhances the wisdom of the wearer', effect: 'Wisdom +1')
	}
	@Bean ArmorModifier insightful() {
		new ArmorModifier(name: 'insightful', desc: 'This armor is fitted with a neural network which greatly enhances the wisdom of the wearer', effect: 'Wisdom +2')
	}
	@Bean ArmorModifier appealing() {
		new ArmorModifier(name: 'appealing', desc: 'This armor is instilled with a framework of nanowires designed to lift, separate, shape, and support the body, increasing the appeal of the wearer.', effect: 'Charisma +1')
	}
	@Bean ArmorModifier captivating() {
		new ArmorModifier(name: 'captivating', desc: 'This armor is instilled with a framework of nanowires designed to lift, separate, shape, and support the body, and the helmet features a system designed to increase the resonance and expressiveness of the voice, greatly enhancing the charm of the wearer.', effect: 'Wisdom +2')
	}
	@Bean ArmorModifier discipline() {
		new ArmorModifier(name: 'discipline', desc: 'This gear helps grenades regenerate faster.', effect: '+1d6 Grenade Light Pool per round')
	}
	@Bean ArmorModifier strength() {
		new ArmorModifier(name: 'strength', desc: 'This gear helps melee attacks regenerate faster.', effect: '+1d6 Melee Light Pool per round')
	}
	@Bean ArmorModifier intelligence() {
		new ArmorModifier(name: 'intelligence', desc: 'This gear helps super ability attacks regenerate faster.', effect: '+1d6 Super Ability Light Pool per round')
	}
	@Bean ArmorModifier inverseShadow() {
		new ArmorModifier(name: 'Inverse Shadow', desc: 'This gear helps gather light from destroyed enemies.', effect: 'double light from destroyed enemies')
	}
	@Bean ArmorModifier betterAlready() {
		new ArmorModifier(name: 'Better Already', desc: 'Shields start recovery immediately after Orb pickup.', effect: 'Recovery begins immediately after Orb pickup')
	}
	@Bean ArmorModifier infusion() {
		new ArmorModifier(name: 'Infusion', desc: 'Replenishes health each time you pick up an Orb of Light', effect: 'Regain a Hit Die on Orb pickup')
	}
	@Bean ArmorModifier autoRifleLoader() {
		new ArmorModifier(name: 'Auto Rifle Loader', desc: 'Increases the reload speed of Auto Rifles.', effect: 'bonus action to reload auto rifle')
	}
	@Bean ArmorModifier pulseRifleLoader() {
		new ArmorModifier(name: 'Pulse Rifle Loader', desc: 'Increases the reload speed of Pulse Rifles.', effect: 'bonus action to reload pulse rifle')
	}
	@Bean ArmorModifier scoutRifleLoader() {
		new ArmorModifier(name: 'Scout Rifle Loader', desc: 'Increases the reload speed of Scout Rifles.', effect: 'bonus action to reload scout rifle')
	}
	@Bean ArmorModifier handCannonLoader() {
		new ArmorModifier(name: 'Hand Cannon Loader', desc: 'Increases the reload speed of Hand Cannons.', effect: 'bonus action to reload hand cannon')
	}
	@Bean ArmorModifier fusionRifleLoader() {
		new ArmorModifier(name: 'Fusion Rifle Loader', desc: 'Increases the reload speed of Fusion Rifles.', effect: 'bonus action to reload fusion rifle')
	}
	@Bean ArmorModifier sidearmLoader() {
		new ArmorModifier(name: 'Sidearm Loader', desc: 'Increases the reload speed of Sidearms.', effect: 'bonus action to reload sidearm')
	}
	@Bean ArmorModifier shotgunLoader() {
		new ArmorModifier(name: 'Shotgun Loader', desc: 'Increases the reload speed of Shotguns.', effect: 'bonus action to reload shotgun')
	}
	@Bean ArmorModifier sniperRifleLoader() {
		new ArmorModifier(name: 'Sniper Rifle Loader', desc: 'Increases the reload speed of Sniper Rifles.', effect: 'bonus action to reload sniper rifle')
	}
	@Bean ArmorModifier paramuscleArmature() {
		new ArmorModifier(name: 'Paramuscle Armature', desc: 'Increases grenade throw distance.', effect: '80 ft grenade throw distance')
	}
	@Bean ArmorModifier rainBlows() {
		new ArmorModifier(name: 'Rain Blows', desc: 'Increases melee attack speed.', effect: 'You can use your Bonus Action to strike with a melee.')
	}
	@Bean ArmorModifier autoRifleAmmo() {
		new ArmorModifier(name: 'Auto Rifle Ammo', desc: 'Increases the amount of Auto Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier pulseRifleAmmo() {
		new ArmorModifier(name: 'Pulse Rifle Ammo', desc: 'Increases the amount of Pulse Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier scoutRifleAmmo() {
		new ArmorModifier(name: 'Scout Rifle Ammo', desc: 'Increases the amount of Scout Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier handCannonAmmo() {
		new ArmorModifier(name: 'Hand Cannon Ammo', desc: 'Increases the amount of Hand Cannon ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier fusionRifleAmmo() {
		new ArmorModifier(name: 'Fusion Rifle Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier shotgunAmmo() {
		new ArmorModifier(name: 'Shotgun Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier sidearmAmmo() {
		new ArmorModifier(name: 'Sidearm Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier sniperRifleAmmo() {
		new ArmorModifier(name: 'Sniper Rifle Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier machineGunAmmo() {
		new ArmorModifier(name: 'Machine Gun Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier rocketLauncherAmmo() {
		new ArmorModifier(name: 'Rocket Launcher Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo')
	}
	@Bean ArmorModifier arcBurnDefense() {
		new ArmorModifier(name: 'Arc Burn Defense', desc: 'Grants the wearer resistance to Arc damage.', effect: '+Arc resistance')
	}
	@Bean ArmorModifier solarBurnDefense() {
		new ArmorModifier(name: 'Solar Burn Defense', desc: 'Grants the wearer resistance to Solar damage.', effect: '+Solar resistance')
	}
	@Bean ArmorModifier voidBurnDefense() {
		new ArmorModifier(name: 'Void Burn Defense', desc: 'Grants the wearer resistance to Void damage.', effect: '+Void resistance')
	}
	@Bean ArmorModifier arcArmor() {
		new ArmorModifier(name: 'Arc Armor', desc: 'Increased Armor when using an Arc-based subclass.', effect: '+2 AC for Arc subclasses')
	}
	@Bean ArmorModifier solarArmor() {
		new ArmorModifier(name: 'Solar Armor', desc: 'Increased Armor when using an Solar-based subclass.', effect: '+2 AC for Solar subclasses')
	}
	@Bean ArmorModifier voidArmor() {
		new ArmorModifier(name: 'Void Armor', desc: 'Increased Armor when using an Void-based subclass.', effect: '+2 AC for Void subclasses')
	}
}
