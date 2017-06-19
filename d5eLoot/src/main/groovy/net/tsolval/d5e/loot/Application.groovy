package net.tsolval.d5e.loot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

/**
 * Main starting point for the application.
 * @author tsolval
 *
 */
@EnableAutoConfiguration
@ComponentScan("net.tsolval.d5e.loot")
class Application {

	static main(args) {
		SpringApplication.run(Application.class, args)
	}
}
