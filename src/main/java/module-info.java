open module io.javafx.whitewoodcity.transitfx {
  requires javafx.graphics;
  requires javafx.controls;
  requires com.fasterxml.jackson.databind;

  exports io.javafx.whitewoodcity.jvg;
  exports io.javafx.whitewoodcity.transition;
  exports io.javafx.whitewoodcity;
  exports io.javafx.whitewoodcity.jvg.svgpathcommand;
}