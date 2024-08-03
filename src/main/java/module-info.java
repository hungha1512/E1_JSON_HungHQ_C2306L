module com.example.e1.e1_json_hunghq_2306l {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;
    requires java.desktop;

    opens com.example.e1.e1_json_hunghq_2306l to javafx.fxml;
    exports com.example.e1.e1_json_hunghq_2306l;
    opens com.aptech.Controller to javafx.fxml;
    exports com.aptech.Controller;
}