package net.tsolval.d5e.loot.model

import org.springframework.stereotype.Component

import com.fasterxml.jackson.annotation.JsonCreator

import groovy.transform.ToString

/**
 * @author tsolval
 *
 */
enum Rarity {
	COMMON, UNCOMMON, RARE, LEGENDARY, EXOTIC

	@JsonCreator
	public static Rarity create(String value) {
		def rarity
		if(((CharSequence)value).isInteger()){
			rarity = Rarity.values()[value as Integer]
		} else {
			rarity = value.toUpperCase() as Rarity
		}

		return rarity
	}
}
