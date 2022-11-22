module com {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.apache.poi.ooxml;
    requires javafx.web;
    requires java.json;


    opens com.project1.Case1 to javafx.fxml;
    exports com.project1.Case1;

    opens com.project1.Main to javafx.graphics;
    exports com.project1.Main;
}