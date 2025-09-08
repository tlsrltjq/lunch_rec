module com.example.lunch_rec {
    requires javafx.controls;
    requires javafx.fxml;
    requires javax.servlet.api;


    opens com.example.lunch_rec to javafx.fxml;
    exports com.example.lunch_rec;
}