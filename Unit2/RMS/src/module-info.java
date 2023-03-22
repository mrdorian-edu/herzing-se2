module rms {
    requires javafx.controls;
    requires javafx.fxml;

    opens rms to javafx.graphics, javafx.fxml;
    exports rms;
}
