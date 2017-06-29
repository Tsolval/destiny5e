/**
 * These functions load the generated engram into a new section of the page.
 */
$(function() {
   $("#encodedButton").click(function() {
      var urlName = "/loot/engram/COMMON";
      $("#item").load(urlName);
   });
});

$(function() {
   $("#encryptedButton").click(function() {
      var urlName = "/loot/engram/UNCOMMON";
      $("#item").load(urlName);
   });
});

$(function() {
   $("#decoherentButton").click(function() {
      var urlName = "/loot/engram/RARE";
      $("#item").load(urlName);
   });
});

$(function() {
   $("#legendaryButton").click(function() {
      var urlName = "/loot/engram/LEGENDARY";
      $("#item").load(urlName);
   });
});

$(function() {
   $("#exoticButton").click(function() {
      var urlName = "/loot/engram/EXOTIC";
      $("#item").load(urlName);
   });
});

