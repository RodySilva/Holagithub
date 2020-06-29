module com.mycompany.primertrabajodegithub {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.primertrabajodegithub to javafx.fxml;
    exports com.mycompany.primertrabajodegithub;
}