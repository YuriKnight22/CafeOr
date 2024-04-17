module com.example.cafeo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.cafeo to javafx.fxml;
    exports com.example.cafeo;
}