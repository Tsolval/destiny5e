import net.tsolval.d5e.loot.model.Rarity

layout 'layouts/mainLayout.tpl',
pageTitle: 'Cryptarch',
otherScripts: {
   script(src: '/js/cryptarch.js', type: 'text/javascript', '')
},
mainContents: {
   div(class: 'container text-center') {
      h2 {
         yield 'test'
         yield 'Cryptarch'
         br()
         small('A Cryptarch for your RPG experience.')
      }
   }
   form (class: 'container') {
      div(class: 'form-group') {
         label(for: 'rarity', 'Select the Engram\'s Rarity:')
         select(id: 'raritySelect', name: 'rarity') {
            Rarity.values().each {
               option(value: it, it)
            }
         }
      }
      button(id: 'decryptButton', type: 'button', 'Submit')
   }
   div(class: 'container') {
      section(id: 'item') {
      }
   }
}