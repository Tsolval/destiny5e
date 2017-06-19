package net.tsolval.d5e.loot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

/**
 * Main starting point for the application.
 * @author tsolval
 *
 */
@EnableAutoConfiguration
class Application {

	static main(args) {
		SpringApplication.run(Application.class, args)
	}
}
