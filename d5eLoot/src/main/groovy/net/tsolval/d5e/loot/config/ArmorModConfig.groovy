package net.tsolval.d5e.loot.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import net.tsolval.d5e.loot.model.ArmorModification
import net.tsolval.d5e.loot.model.Rarity

/**
 * @author tsolval
 *
 */
@Configuration
class ArmorModConfig {

	@Bean ArmorModification protective() {
		new ArmorModification(name: 'defensive', desc: 'This armor is more protective than other armor in its class.', effect: 'AC +1', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification covering() {
		new ArmorModification(name: 'protective', desc: 'This armor is more protective than other armor in its class.', effect: 'AC +2', rarity: Rarity.RARE)
	}
	@Bean ArmorModification shielding() {
		new ArmorModification(name: 'protective', desc: 'This armor is more protective than other armor in its class.', effect: 'AC +3', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification hasty() {
		new ArmorModification(name: 'hasty', desc: 'This armor is fitted with reflex motivators, subtly enhancing your speed.', effect: 'Speed +5 ft.', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification speedy() {
		new ArmorModification(name: 'speedy', desc: 'This armor is fitted with reflex motivators and spring loaded boots, greatly enhancing your speed.', effect: 'Speed +10 ft.', rarity: Rarity.RARE)
	}
	@Bean ArmorModification bolstering() {
		new ArmorModification(name: 'forceful', desc: 'This armor is fitted with an exoskeleton which enhances the strength of the wearer', effect: 'Strength +1', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification empowering() {
		new ArmorModification(name: 'powerful', desc: 'This armor is fitted with an exoskeleton which greatly enhances the strength of the wearer', effect: 'Strength +2', rarity: Rarity.RARE)
	}
	@Bean ArmorModification strengthening() {
		new ArmorModification(name: 'powerful', desc: 'This armor is fitted with an exoskeleton which greatly enhances the strength of the wearer', effect: 'Strength +3', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification adept() {
		new ArmorModification(name: 'adept', desc: 'This armor is fitted with an exoskeleton which enhances the dexterity of the wearer', effect: 'Dexterity +1', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification agile() {
		new ArmorModification(name: 'agile', desc: 'This armor is fitted with an exoskeleton which greatly enhances the dexterity of the wearer', effect: 'Dexterity +2', rarity: Rarity.RARE)
	}
	@Bean ArmorModification dexterous() {
		new ArmorModification(name: 'agile', desc: 'This armor is fitted with an exoskeleton which greatly enhances the dexterity of the wearer', effect: 'Dexterity +3', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification hardy() {
		new ArmorModification(name: 'hardy', desc: 'This armor is fitted with an exoskeleton which enhances the constitution of the wearer', effect: 'Constitution +1', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification robust() {
		new ArmorModification(name: 'robust', desc: 'This armor is fitted with an exoskeleton which greatly enhances the constitution of the wearer', effect: 'Constitution +2', rarity: Rarity.RARE)
	}
	@Bean ArmorModification brawny() {
		new ArmorModification(name: 'robust', desc: 'This armor is fitted with an exoskeleton which greatly enhances the constitution of the wearer', effect: 'Constitution +3', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification clever() {
		new ArmorModification(name: 'clever', desc: 'This armor is fitted with a neural network which enhances the intelligence of the wearer', effect: 'Intelligence +1', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification astute() {
		new ArmorModification(name: 'astute', desc: 'This armor is fitted with a neural network which greatly enhances the intelligence of the wearer', effect: 'Intelligence +2', rarity: Rarity.RARE)
	}
	@Bean ArmorModification smart() {
		new ArmorModification(name: 'astute', desc: 'This armor is fitted with a neural network which greatly enhances the intelligence of the wearer', effect: 'Intelligence +3', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification canny() {
		new ArmorModification(name: 'canny', desc: 'This armor is fitted with a neural network which enhances the wisdom of the wearer', effect: 'Wisdom +1', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification shrewd() {
		new ArmorModification(name: 'insightful', desc: 'This armor is fitted with a neural network which greatly enhances the wisdom of the wearer', effect: 'Wisdom +2', rarity: Rarity.RARE)
	}
	@Bean ArmorModification insightful() {
		new ArmorModification(name: 'insightful', desc: 'This armor is fitted with a neural network which greatly enhances the wisdom of the wearer', effect: 'Wisdom +3', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification appealing() {
		new ArmorModification(name: 'appealing', desc: 'This armor is instilled with a framework of nanowires designed to lift, separate, shape, and support the body, increasing the appeal of the wearer.', effect: 'Charisma +1', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification captivating() {
		new ArmorModification(name: 'captivating',
		desc: """This armor is instilled with a framework of nanowires designed to lift, separate, shape, and support the body, 
                	and the helmet features a system designed to increase the resonance and expressiveness of the voice,
					greatly enhancing the charm of the wearer.""",
		effect: 'Wisdom +2', rarity: Rarity.RARE)
	}
	@Bean ArmorModification alluring() {
		new ArmorModification(name: 'captivating',
		desc: """This armor is instilled with a framework of nanowires designed to lift, separate, shape, and support the body, 
			 		the helmet features a system designed to increase the resonance and expressiveness of the voice,
			        and the material from which the armor is constructed lends the user an almost otherworldy quality,
			        greatly enhancing the charm of the wearer.""",
		effect: 'Wisdom +2', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification discipline() {
		new ArmorModification(name: 'discipline', desc: 'This gear helps grenades regenerate faster.', effect: '+1d6 Grenade Light Pool per round', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification strength() {
		new ArmorModification(name: 'strength', desc: 'This gear helps melee attacks regenerate faster.', effect: '+1d6 Melee Light Pool per round', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification intelligence() {
		new ArmorModification(name: 'intelligence', desc: 'This gear helps super ability attacks regenerate faster.', effect: '+1d6 Super Ability Light Pool per round', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification inverseShadow() {
		new ArmorModification(name: 'Inverse Shadow', desc: 'This gear helps gather light from destroyed enemies.', effect: 'double light from destroyed enemies', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification betterAlready() {
		new ArmorModification(name: 'Better Already', desc: 'Shields start recovery immediately after Orb pickup.', effect: 'Recovery begins immediately after Orb pickup', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification infusion() {
		new ArmorModification(name: 'Infusion', desc: 'Replenishes health each time you pick up an Orb of Light', effect: 'Regain a Hit Die on Orb pickup', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification autoRifleLoader() {
		new ArmorModification(name: 'Auto Rifle Loader', desc: 'Increases the reload speed of Auto Rifles.', effect: 'bonus action to reload auto rifle', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification pulseRifleLoader() {
		new ArmorModification(name: 'Pulse Rifle Loader', desc: 'Increases the reload speed of Pulse Rifles.', effect: 'bonus action to reload pulse rifle', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification scoutRifleLoader() {
		new ArmorModification(name: 'Scout Rifle Loader', desc: 'Increases the reload speed of Scout Rifles.', effect: 'bonus action to reload scout rifle', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification handCannonLoader() {
		new ArmorModification(name: 'Hand Cannon Loader', desc: 'Increases the reload speed of Hand Cannons.', effect: 'bonus action to reload hand cannon', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification fusionRifleLoader() {
		new ArmorModification(name: 'Fusion Rifle Loader', desc: 'Increases the reload speed of Fusion Rifles.', effect: 'bonus action to reload fusion rifle', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification sidearmLoader() {
		new ArmorModification(name: 'Sidearm Loader', desc: 'Increases the reload speed of Sidearms.', effect: 'bonus action to reload sidearm', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification shotgunLoader() {
		new ArmorModification(name: 'Shotgun Loader', desc: 'Increases the reload speed of Shotguns.', effect: 'bonus action to reload shotgun', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification sniperRifleLoader() {
		new ArmorModification(name: 'Sniper Rifle Loader', desc: 'Increases the reload speed of Sniper Rifles.', effect: 'bonus action to reload sniper rifle', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification paramuscleArmature() {
		new ArmorModification(name: 'Paramuscle Armature', desc: 'Increases grenade throw distance.', effect: '80 ft grenade throw distance', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification rainBlows() {
		new ArmorModification(name: 'Rain Blows', desc: 'Increases melee attack speed.', effect: 'bonus action to strike with a melee.', rarity: Rarity.RARE)
	}
	@Bean ArmorModification autoRifleAmmo() {
		new ArmorModification(name: 'Auto Rifle Ammo', desc: 'Increases the amount of Auto Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification pulseRifleAmmo() {
		new ArmorModification(name: 'Pulse Rifle Ammo', desc: 'Increases the amount of Pulse Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification scoutRifleAmmo() {
		new ArmorModification(name: 'Scout Rifle Ammo', desc: 'Increases the amount of Scout Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification handCannonAmmo() {
		new ArmorModification(name: 'Hand Cannon Ammo', desc: 'Increases the amount of Hand Cannon ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification fusionRifleAmmo() {
		new ArmorModification(name: 'Fusion Rifle Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification shotgunAmmo() {
		new ArmorModification(name: 'Shotgun Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification sidearmAmmo() {
		new ArmorModification(name: 'Sidearm Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification sniperRifleAmmo() {
		new ArmorModification(name: 'Sniper Rifle Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification machineGunAmmo() {
		new ArmorModification(name: 'Machine Gun Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification rocketLauncherAmmo() {
		new ArmorModification(name: 'Rocket Launcher Ammo', desc: 'Increases the amount of Fusion Rifle ammunition you can carry.', effect: '+50% max ammo', rarity: Rarity.UNCOMMON)
	}
	@Bean ArmorModification arcBurnDefense() {
		new ArmorModification(name: 'Arc Burn Defense', desc: 'Grants the wearer resistance to Arc damage.', effect: '+Arc resistance', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification solarBurnDefense() {
		new ArmorModification(name: 'Solar Burn Defense', desc: 'Grants the wearer resistance to Solar damage.', effect: '+Solar resistance', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification voidBurnDefense() {
		new ArmorModification(name: 'Void Burn Defense', desc: 'Grants the wearer resistance to Void damage.', effect: '+Void resistance', rarity: Rarity.LEGENDARY)
	}
	@Bean ArmorModification arcArmor() {
		new ArmorModification(name: 'Arc Armor', desc: 'Increased Armor when using an Arc-based subclass.', effect: '+2 AC for Arc subclasses', rarity: Rarity.RARE)
	}
	@Bean ArmorModification solarArmor() {
		new ArmorModification(name: 'Solar Armor', desc: 'Increased Armor when using an Solar-based subclass.', effect: '+2 AC for Solar subclasses', rarity: Rarity.RARE)
	}
	@Bean ArmorModification voidArmor() {
		new ArmorModification(name: 'Void Armor', desc: 'Increased Armor when using an Void-based subclass.', effect: '+2 AC for Void subclasses', rarity: Rarity.RARE)
	}
}
