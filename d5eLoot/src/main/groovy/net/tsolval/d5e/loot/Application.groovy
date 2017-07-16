package net.tsolval.d5e.loot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.support.SpringBootServletInitializer

/**
 * Main starting point for the application.
 * @author tsolval
 *
 */
@SpringBootApplication
class Application extends SpringBootServletInitializer {

   @Override
   protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
      return application.sources(Application.class)
   }

   static main(args) {
      SpringApplication.run(Application.class, args)
   }
}
