package net.tsolval.d5e.loot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

/**
 * Controls loot pages.
 *
 * @author tsolval
 */
@Controller
class LootController {
	@RequestMapping("/loot")
	def showMain(){
		return 'cryptarch'
	}
}
