module com.axel {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.axel to javafx.fxml;
    exports com.axel;
}
