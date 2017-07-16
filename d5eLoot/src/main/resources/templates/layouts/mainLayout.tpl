yieldUnescaped '<!DOCTYPE html>'
html {
   head {
      title(pageTitle)
      meta(charset: 'utf-8')
      meta(name: 'viewport', content: 'width=device-width, initial-scale=1')
      link(rel: 'stylesheet', href: 'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css')
      link(rel: 'stylesheet', href: 'https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/cyborg/bootstrap.min.css')
      link(rel: 'stylesheet', href: '/css/destiny.css')
      script(src: 'https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js', '')
      script(src: 'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js', '')
      script(src: '/js/active.js', type: 'text/javascript', '')
      otherScripts()
   }
   body {
      nav(class: 'navbar navbar-inverse') {
         div(class: 'container-fluid') {
            div(class: 'navbar-header') {
               button(type: 'button', class: 'navbar-toggle', 'data-toggle': 'collapse', 'data-target': '#navigation', ) {
                  span(class: 'icon-bar', '')
                  span(class: 'icon-bar', '')
                  span(class: 'icon-bar', '')
               }
               a(class: 'navbar-brand', href: '/', 'Destiny &amp; Desirables')
            }
            div(class: 'collapse navbar-collapse', id: 'navigation') {
               ul(class: 'nav navbar-nav') {
                  li { a(href: '/', 'Cryptarch') }
               }
            }
         }
      }
      section(id: 'content'){ mainContents() }
      footer(class: 'navbar-inverse navbar-fixed-bottom') {
         div(class: 'text-center text-muted', 'Your Destiny RPG loot resource since sometime in the future.')
      }
   }
}
