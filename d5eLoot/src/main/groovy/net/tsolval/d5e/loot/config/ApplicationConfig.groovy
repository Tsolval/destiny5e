package net.tsolval.d5e.loot.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author tsolval
 *
 */
@Configuration
class ApplicationConfig {
	def Random random

	@Bean
	def Random getRandom() {
		if (!random) {
			random = new Random()
		}
		
		return random
	}
}
