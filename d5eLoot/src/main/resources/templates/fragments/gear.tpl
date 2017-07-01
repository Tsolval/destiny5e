div(class: "panel ${item?.rarity}") {
   div(class: 'panel-heading text-center') {
      yield(class: 'lead', "${item?.rarity?.description} ${item?.type?.description}")
   }
   table(class: 'table table-default') {
      item?.mods?.each { mod ->
         tr(class: "${mod.rarity}" ) {
            td(mod.name)
            td(mod.desc)
            td(mod.effect)
         }
      }
   }
   div(class: 'panel-footer')
}
