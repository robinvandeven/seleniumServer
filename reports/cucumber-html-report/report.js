$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/navigateToSMOnline.feature");
formatter.feature({
  "name": "Navigate to storeMate Online",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "name": "Navigate to storeMate online",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "I open chrome and navigate to storeMate Online",
  "keyword": "Given "
});
formatter.match({
  "location": "navigateToSMOnline.i_open_chrome_and_navigate_to_storeMate_Online()"
});
formatter.result({
  "status": "passed"
});
});