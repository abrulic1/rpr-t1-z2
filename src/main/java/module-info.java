module com.example.rprt1z2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rprt1z2 to javafx.fxml;
    exports com.example.rprt1z2;
}