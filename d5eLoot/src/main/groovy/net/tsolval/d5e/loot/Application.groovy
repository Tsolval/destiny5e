package net.tsolval.d5e.loot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

/**
 * Main starting point for the application.
 * @author tsolval
 *
 */
@SpringBootApplication
class Application {
   static main(args) {
      SpringApplication.run(Application.class, args)
   }
}
