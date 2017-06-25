package net.tsolval.d5e.loot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Controls the front page, login page, and controls functions related to login.
 *
 * @author tsolval
 */
@Controller
class LoginController {
	/**
	 * Show the Front Page.  This is the page that everyone will see when they 
	 * reach out to the application.  Any anonymous functions will be rooted 
	 * here, but the main point of this page would be to provide a login for 
	 * the user and forward them to their dashboard.
	 * 
	 * @return
	 */
	@RequestMapping("/")
	def showFrontPage(){
		return 'index'
	}
}
