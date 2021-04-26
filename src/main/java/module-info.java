module org.trayNotification {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.trayNotification.notification to javafx.fxml;
    exports org.trayNotification.animations;
    exports org.trayNotification.models;
    exports org.trayNotification.notification;
}