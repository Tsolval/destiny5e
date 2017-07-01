package net.tsolval.d5e.loot.model

import org.springframework.stereotype.Component

import com.fasterxml.jackson.annotation.JsonCreator

import groovy.transform.ToString

/**
 * @author tsolval
 *
 */
enum Rarity {
   COMMON('Common'), UNCOMMON('Uncommon'), RARE('Rare'), LEGENDARY('Legendary'), EXOTIC('Exotic')

   def description

   def Rarity(def desc) {
      this.description = desc
   }
}
