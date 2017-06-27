/**
 * Load the generated engram into a new section of the page.
 */
$(function() {
   $("#decryptButton").click(function() {
      var rarity = $("#raritySelect").val();
      var urlName = "/loot/engram/" + rarity;
      $("#item").load(urlName);
   });
});