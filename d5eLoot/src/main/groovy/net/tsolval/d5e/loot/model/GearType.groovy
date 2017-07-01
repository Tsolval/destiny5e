package net.tsolval.d5e.loot.model

import org.springframework.stereotype.Component

/**
 * The types of Gear that can be decrypted from an Engram
 * 
 * @author tsolval
 */
enum GearType {
   TITAN_HELM('Titan Helm'),
   TITAN_GAUNTLETS('Titan Gauntlets'),
   TITAN_PLATE('Titan Plate'),
   TITAN_GREAVES('Titan Greaves'),
   HUNTER_MASK('Hunter Mask'),
   HUNTER_GRIPS('Hunter Grips'),
   HUNTER_VEST('Hunter Vest'),
   HUNTER_BOOTS('Hunter Boots'),
   WARLOCK_HOOD('Warlock Hood'),
   WARLOCK_GLOVES('Warlock Gloves'),
   WARLOCK_ROBES('Warlock Robes'),
   WARLOCK_STEPS('Warlock Boots'),
   HAND_CANNON('Hand Cannon'),
   SCOUT_RIFLE('Scout Rifle'),
   AUTO_RIFLE('Auto Rifle'),
   PULSE_RIFLE('Pulse Rifle'),
   SHOTGUN('Shotgun'),
   SNIPER_RIFLE('Sniper Rifle'),
   FUSION_RIFLE('Fusion Rifle'),
   SIDEARM('Sidearm'),
   ROCKET_LAUNCHER('Rocket Launcher'),
   MACHINE_GUN('Machine Gun'),
   HEAVY_SWORD('Heavy Sword'),
   HEAVY_AXE('Heavy Axe')

   def description

   def GearType(def desc) {
      this.description = desc
   }
}
