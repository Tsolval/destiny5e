package net.tsolval.d5e.loot.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import net.tsolval.d5e.loot.model.GearType
import net.tsolval.d5e.loot.model.Modification
import net.tsolval.d5e.loot.model.Rarity

/**
 * Modifications for weapons and armor.
 * @author tsolval
 *
 */
@Configuration
class ModificationConfig {
   @Bean Modification defensive() {
      new Modification(
            name: 'Defensive',
            desc: 'This armor is more protective than other armor in its class.',
            effect: 'AC +1',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES,
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS
            ])
   }
   @Bean Modification protective() {
      new Modification(
            name: 'Protective',
            desc: 'This armor is more protective than other armor in its class.',
            effect: 'AC +2',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification shielding() {
      new Modification(
            name: 'Shielding',
            desc: 'This armor is more protective than other armor in its class.',
            effect: 'AC +3',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification hasty() {
      new Modification(
            name: 'Hasty',
            desc: 'This armor is fitted with reflex motivators, subtly enhancing your speed.',
            effect: 'Speed +5 ft.',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS
            ])
   }
   @Bean Modification speedy() {
      new Modification(
            name: 'Speedy',
            desc: 'This armor is fitted with reflex motivators and spring loaded boots, greatly enhancing your speed.',
            effect: 'Speed +10 ft.',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS
            ])
   }
   @Bean Modification bolstering() {
      new Modification(
            name: 'Bolstering',
            desc: 'This armor is fitted with an exoskeleton which enhances the strength of the wearer',
            effect: 'Strength +1',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES,
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification adept() {
      new Modification(
            name: 'Adept',
            desc: 'This armor is fitted with an exoskeleton which enhances the dexterity of the wearer',
            effect: 'Dexterity +1',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES,
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS
            ])
   }
   @Bean Modification agile() {
      new Modification(
            name: 'Agile',
            desc: 'This armor is fitted with an exoskeleton which greatly enhances the dexterity of the wearer',
            effect: 'Dexterity +2',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification hardy() {
      new Modification(
            name: 'Hardy',
            desc: 'This armor is fitted with an exoskeleton which enhances the constitution of the wearer',
            effect: 'Constitution +1',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification robust() {
      new Modification(
            name: 'Robust',
            desc: 'This armor is fitted with an exoskeleton which greatly enhances the constitution of the wearer',
            effect: 'Constitution +2',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification brawny() {
      new Modification(
            name: 'Brawny',
            desc: 'This armor is fitted with an exoskeleton which greatly enhances the constitution of the wearer',
            effect: 'Constitution +3',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification clever() {
      new Modification(
            name: 'Clever',
            desc: 'This armor is fitted with a neural network which enhances the intelligence of the wearer',
            effect: 'Intelligence +1',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD
            ])
   }
   @Bean Modification astute() {
      new Modification(
            name: 'Astute',
            desc: 'This armor is fitted with a neural network which greatly enhances the intelligence of the wearer',
            effect: 'Intelligence +2',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD
            ])
   }
   @Bean Modification smart() {
      new Modification(
            name: 'Smart',
            desc: 'This armor is fitted with a neural network which greatly enhances the intelligence of the wearer',
            effect: 'Intelligence +3',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD
            ])
   }
   @Bean Modification canny() {
      new Modification(
            name: 'Canny',
            desc: 'This armor is fitted with a neural network which enhances the wisdom of the wearer',
            effect: 'Wisdom +1',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification insightful() {
      new Modification(
            name: 'Insightful',
            desc: 'This armor is fitted with a neural network which greatly enhances the wisdom of the wearer',
            effect: 'Wisdom +2',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD
            ])
   }
   @Bean Modification appealing() {
      new Modification(
            name: 'Appealing',
            desc: 'This armor is instilled with a framework of nanowires designed to lift, separate, shape, and support the body, increasing the appeal of the wearer.',
            effect: 'Charisma +1',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES,
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification captivating() {
      new Modification(
            name: 'Captivating',
            desc: "This helmet features a system designed to increase the resonance and expressiveness of the voice, greatly enhancing the charm of the wearer.",
            effect: 'Wisdom +2',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD
            ])
   }
   @Bean Modification betterAlready() {
      new Modification(
            name: 'Better Already',
            desc: 'Shields start recovery immediately after Orb pickup.',
            effect: 'Recovery begins immediately after Orb pickup',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD
            ])
   }
   @Bean Modification infusion() {
      new Modification(
            name: 'Infusion',
            desc: 'Replenishes health each time you pick up an Orb of Light',
            effect: 'Regain a Hit Die on Orb pickup',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification autoRifleLoader() {
      new Modification(
            name: 'Auto Rifle Loader',
            desc: 'Increases the reload speed of Auto Rifles.',
            effect: 'bonus action to reload auto rifle',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification pulseRifleLoader() {
      new Modification(
            name: 'Pulse Rifle Loader',
            desc: 'Increases the reload speed of Pulse Rifles.',
            effect: 'bonus action to reload pulse rifle',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification scoutRifleLoader() {
      new Modification(
            name: 'Scout Rifle Loader',
            desc: 'Increases the reload speed of Scout Rifles.',
            effect: 'bonus action to reload scout rifle',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification handCannonLoader() {
      new Modification(
            name: 'Hand Cannon Loader',
            desc: 'Increases the reload speed of Hand Cannons.',
            effect: 'bonus action to reload hand cannon',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification fusionRifleLoader() {
      new Modification(
            name: 'Fusion Rifle Loader',
            desc: 'Increases the reload speed of Fusion Rifles.',
            effect: 'bonus action to reload fusion rifle',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification sidearmLoader() {
      new Modification(
            name: 'Sidearm Loader',
            desc: 'Increases the reload speed of Sidearms.',
            effect: 'bonus action to reload sidearm',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification shotgunLoader() {
      new Modification(
            name: 'Shotgun Loader',
            desc: 'Increases the reload speed of Shotguns.',
            effect: 'bonus action to reload shotgun',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification sniperRifleLoader() {
      new Modification(
            name: 'Sniper Rifle Loader',
            desc: 'Increases the reload speed of Sniper Rifles.',
            effect: 'bonus action to reload sniper rifle',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification paramuscleArmature() {
      new Modification(
            name: 'Paramuscle Armature',
            desc: 'Increases grenade throw distance.',
            effect: '80 ft grenade throw distance',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification rainBlows() {
      new Modification(
            name: 'Rain Blows',
            desc: 'Increases melee attack speed.',
            effect: 'bonus action to strike with a melee.',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES
            ])
   }
   @Bean Modification autoRifleAmmo() {
      new Modification(
            name: 'Auto Rifle Ammo',
            desc: 'Increases the amount of Auto Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification pulseRifleAmmo() {
      new Modification(
            name: 'Pulse Rifle Ammo',
            desc: 'Increases the amount of Pulse Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification scoutRifleAmmo() {
      new Modification(
            name: 'Scout Rifle Ammo',
            desc: 'Increases the amount of Scout Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification handCannonAmmo() {
      new Modification(
            name: 'Hand Cannon Ammo',
            desc: 'Increases the amount of Hand Cannon ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification fusionRifleAmmo() {
      new Modification(
            name: 'Fusion Rifle Ammo',
            desc: 'Increases the amount of Fusion Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification shotgunAmmo() {
      new Modification(
            name: 'Shotgun Ammo',
            desc: 'Increases the amount of Fusion Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification sidearmAmmo() {
      new Modification(
            name: 'Sidearm Ammo',
            desc: 'Increases the amount of Fusion Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification sniperRifleAmmo() {
      new Modification(
            name: 'Sniper Rifle Ammo',
            desc: 'Increases the amount of Fusion Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification machineGunAmmo() {
      new Modification(
            name: 'Machine Gun Ammo',
            desc: 'Increases the amount of Fusion Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification rocketLauncherAmmo() {
      new Modification(
            name: 'Rocket Launcher Ammo',
            desc: 'Increases the amount of Fusion Rifle ammunition you can carry.',
            effect: '+50% max ammo',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification arcBurnDefense() {
      new Modification(
            name: 'Arc Burn Defense',
            desc: 'Grants the wearer resistance to Arc damage.',
            effect: '+Arc resistance',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification solarBurnDefense() {
      new Modification(
            name: 'Solar Burn Defense',
            desc: 'Grants the wearer resistance to Solar damage.',
            effect: '+Solar resistance',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification voidBurnDefense() {
      new Modification(
            name: 'Void Burn Defense',
            desc: 'Grants the wearer resistance to Void damage.',
            effect: '+Void resistance',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification arcArmor() {
      new Modification(
            name: 'Arc Armor',
            desc: 'Increased Armor when using an Arc-based subclass.',
            effect: '+2 AC for Arc subclasses',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification solarArmor() {
      new Modification(
            name: 'Solar Armor',
            desc: 'Increased Armor when using an Solar-based subclass.',
            effect: '+2 AC for Solar subclasses',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification voidArmor() {
      new Modification(
            name: 'Void Armor',
            desc: 'Increased Armor when using an Void-based subclass.',
            effect: '+2 AC for Void subclasses',
            rarity: Rarity.RARE,
            type: [
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification accurate() {
      new Modification(
            name: 'Accurate',
            desc: 'This weapon is more accurate than its peers.',
            effect: '+1 to Hit',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification precise() {
      new Modification(
            name: 'Precise',
            desc: 'This weapon is much more accurate than its peers.',
            effect: '+2 to Hit',
            rarity: Rarity.RARE,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification exacting() {
      new Modification(
            name: 'Exacting',
            desc: 'This weapon is much more accurate than its peers.',
            effect: '+3 to Hit',
            rarity :Rarity.LEGENDARY,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification baleful() {
      new Modification(
            name: 'Baleful',
            desc: 'This weapon is more destructive than its peers.',
            effect: '+1 to Damage',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification brutal() {
      new Modification(
            name: 'Brutal',
            desc: 'This weapon is much more destructive than its peers.',
            effect: '+2 to Damage',
            rarity: Rarity.RARE,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification savage() {
      new Modification(
            name: 'Savage',
            desc: 'This weapon is much more destructive than its peers.',
            effect: '+3 to Damage',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification sheltering() {
      new Modification(
            name: 'Sheltering',
            desc: 'This weapon helps you to gain more advantage while under cover.',
            effect: '+2 to AC while in cover',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SNIPER_RIFLE
            ])
   }
   @Bean Modification sprayAndPlay() {
      new Modification(
            name: 'Spray and Play',
            desc: 'Increases the reload speed of this weapon when its mag is empty.',
            effect: 'Bonus action to reload if mag is empty.',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER
            ])
   }
   @Bean Modification crowdControl() {
      new Modification(
            name: 'Crowd Control',
            desc: 'Kills with this weapon grant bonus damage for a short time.',
            effect: 'Weapon deals +1d6 damage until the end of your next turn.',
            rarity: Rarity.RARE,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification lightweight() {
      new Modification(
            name: 'Lightweight',
            desc: 'This weapon makes you feel faster.',
            effect: '+5 ft Movement',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification extendedMag() {
      new Modification(
            name: 'Extended Mag',
            desc: 'A larger magazine means more shots before you need to reload.',
            effect: '+30% more ammo in the clip.',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification armorPiercingRounds() {
      new Modification(
            name: 'Armor Piercing Rounds',
            desc: 'These rounds are useful to penetrate cover and find targets.',
            effect: 'Ignore 3/4 cover. Disadvantage to hit targets in full cover.',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE
            ])
   }
   @Bean Modification penetratingRounds() {
      new Modification(
            name: 'Penetrating Rounds',
            desc: 'These iridium-core rounds overpenetrate targets.',
            effect: 'Can hit up to two creatures in line of fire.  Roll a separate attack for each target.',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN
            ])
   }
   @Bean Modification highCaliberRounds() {
      new Modification(
            name: 'Hight Caliber Rounds',
            desc: 'Oversize rounds built to stagger targets and leave them reeling.',
            effect: 'Target must make a Strength save or be knocked prone.',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN
            ])
   }
   @Bean Modification flaredMagwell() {
      new Modification(
            name: 'Flared Magwell',
            desc: 'Reload this weapon quickly.',
            effect: 'Reload is a bonus action.',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER
            ])
   }
   @Bean Modification scoped() {
      new Modification(
            name: 'Scoped',
            desc: 'The scope or sight on this weapon is extremely accurate.',
            effect: 'double critical range',
            rarity: Rarity.RARE,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER
            ])
   }
   @Bean Modification hammerForged() {
      new Modification(
            name: 'Hammer Forged',
            desc: 'This weapon has improved range and accuracy.',
            effect: '+30 ft range',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER
            ])
   }
   @Bean Modification hairTrigger() {
      new Modification(
            name: 'Hair Trigger',
            desc: 'This weapon has a hair trigger, which allows you to fire more shots than normal.',
            effect: 'Bonus action to attack again with this weapon.',
            rarity: Rarity.RARE,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON,
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification arcDamageNonPrimary() {
      new Modification(
            name: 'Arc Damage',
            desc: 'This weapon deals Arc Damage.',
            effect: 'Arc',
            rarity:  Rarity.UNCOMMON,
            type: [
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification arcDamagePrimary() {
      new Modification(
            name: 'Arc Damage',
            desc: 'This weapon deals Arc Damage.',
            effect: 'Arc',
            rarity:  Rarity.LEGENDARY,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON
            ])
   }
   @Bean Modification solarDamageNonPrimary() {
      new Modification(
            name: 'Solar Damage',
            desc: 'This weapon deals Solar Damage.',
            effect: 'Solar',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification solarDamagePrimary() {
      new Modification(
            name: 'Solar Damage',
            desc: 'This weapon deals Solar Damage.',
            effect: 'Solar',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON
            ])
   }
   @Bean Modification voidDamageNonPrimary() {
      new Modification(
            name: 'Void Damage',
            desc: 'This weapon deals Void Damage.',
            effect: 'Void',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.SHOTGUN,
               GearType.SIDEARM,
               GearType.SNIPER_RIFLE,
               GearType.FUSION_RIFLE,
               GearType.MACHINE_GUN,
               GearType.ROCKET_LAUNCHER,
               GearType.HEAVY_SWORD,
               GearType.HEAVY_AXE
            ])
   }
   @Bean Modification voidDamagePrimary() {
      new Modification(
            name: 'Void Damage',
            desc: 'This weapon deals Void Damage.',
            effect: 'Void',
            rarity: Rarity.LEGENDARY,
            type: [
               GearType.AUTO_RIFLE,
               GearType.PULSE_RIFLE,
               GearType.SCOUT_RIFLE,
               GearType.HAND_CANNON
            ])
   }
   @Bean Modification discipline() {
      new Modification(
            name: 'Discipline',
            desc: 'This gear helps grenades regenerate faster.',
            effect: '+1d4 Grenade Light Pool per round',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD,
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES,
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification strength() {
      new Modification(
            name: 'Strength',
            desc: 'This gear helps melee attacks regenerate faster.',
            effect: '+1d6 Melee Light Pool per round',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD,
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES,
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification intelligence() {
      new Modification(
            name: 'Intelligence',
            desc: 'This gear helps super ability attacks regenerate faster.',
            effect: '+1d6 Super Ability Light Pool per round',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD,
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES,
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
   @Bean Modification inverseShadow() {
      new Modification(
            name: 'Inverse Shadow',
            desc: 'This gear helps gather light from destroyed enemies.',
            effect: 'double light from destroyed enemies',
            rarity: Rarity.UNCOMMON,
            type: [
               GearType.TITAN_HELM,
               GearType.HUNTER_MASK,
               GearType.WARLOCK_HOOD,
               GearType.TITAN_GAUNTLETS,
               GearType.HUNTER_GRIPS,
               GearType.WARLOCK_GLOVES,
               GearType.TITAN_GREAVES,
               GearType.HUNTER_BOOTS,
               GearType.WARLOCK_STEPS,
               GearType.TITAN_PLATE,
               GearType.HUNTER_VEST,
               GearType.WARLOCK_ROBES
            ])
   }
}
