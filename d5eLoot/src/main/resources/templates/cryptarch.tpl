import net.tsolval.d5e.loot.model.Rarity

layout 'layouts/mainLayout.tpl',
pageTitle: 'Cryptarch',
otherScripts: {
   script(src: '/js/cryptarch.js', type: 'text/javascript', '')
},
mainContents: {
   div(class: 'container text-center') {
      h2 {
         yield 'Cryptarch'
         br()
         small('An engram decryption service for your RPG experience.')
      }
   }
   form (class: 'container') {
      div(class: 'row') {
         div(class: 'col-sm-5 col-centered'){
            div(class: 'btn-group') {
               button(class: 'btn COMMON',    id: 'encodedButton',    type: 'button', 'Encoded') 
               button(class: 'btn UNCOMMON',  id: 'encryptedButton',  type: 'button', 'Encrypted') 
               button(class: 'btn RARE',      id: 'decoherentButton', type: 'button', 'Decoherent') 
               button(class: 'btn LEGENDARY', id: 'legendaryButton',  type: 'button', 'Legendary') 
               button(class: 'btn EXOTIC',    id: 'exoticButton',     type: 'button', 'Exotic') 
            }
         }
      }
   }
   div(class: 'container') {
      section(id: 'item') {
      }
   }
}
