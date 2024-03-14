module com.example.testsonar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testsonar to javafx.fxml;
    exports com.example.testsonar;
}