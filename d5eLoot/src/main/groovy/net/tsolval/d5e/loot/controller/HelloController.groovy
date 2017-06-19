package net.tsolval.d5e.loot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * @author tsolval
 *
 */
@Controller
class HelloController {
	@RequestMapping("/")
	@ResponseBody
	def sayHello(){
		return "hello"
	}
}
