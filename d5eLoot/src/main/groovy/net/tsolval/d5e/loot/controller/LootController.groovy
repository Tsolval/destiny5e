package net.tsolval.d5e.loot.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

import net.tsolval.d5e.loot.generator.Cryptarch
import net.tsolval.d5e.loot.model.Rarity

/**
 * Controls loot pages.
 *
 * @author tsolval
 */
@Controller
class LootController {
   @Autowired Cryptarch cryptarch

   @RequestMapping("/")
   def showMain(){
      return 'cryptarch'
   }

   @GetMapping("/engram/{rarity}")
   def decryptEngram(@PathVariable Rarity rarity, Model model) {
      def item = cryptarch.decrypt(rarity)
      model.addAttribute('item', item)
      return 'fragments/gear'
   }
}
