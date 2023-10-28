module com.example.taller {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taller to javafx.fxml;
    exports com.example.taller;
}