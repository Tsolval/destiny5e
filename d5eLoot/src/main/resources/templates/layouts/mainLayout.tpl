yieldUnescaped '<!DOCTYPE html>'
html {
   head {
      title(pageTitle)
      meta(charset: 'utf-8')
      meta(name: 'viewport', content: 'width=device-width, initial-scale=1')
      link(rel:'stylesheet', href:'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css')
      script(src:'https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js', '')
      script(src:'https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js', '')
      script(src:'../../../js/active.js', type: 'text/javascript', '') 
   }
   body {
      nav(class:'navbar navbar-inverse') {
         div(class:'container-fluid') {
            div(class:'navbar-header') {
               a(class:'navbar-brand', href:'/', 'Destiny &amp; Desirables')
            }
            ul(class:'nav navbar-nav') {
               li { a(href: "/", 'Home') }
               li { a(href: "/loot", 'Cryptarch') }
            }
            ul(class: 'nav navbar-nav navbar-right'){
               li { a(href:"#", '<span class="glyphicon glyphicon-user"></span> Sign Up') }
               li { a(href:"#", '<span class="glyphicon glyphicon-log-in"></span> Login') }
            }
         } 
      }
      section(id: 'content'){
         mainContents()
      }
      footer(class:'navbar-inverse navbar-fixed-bottom') {
         div(class:'text-center text-muted', 'Your Destiny RPG loot resource since sometime in the future.')
      }
   }
}
