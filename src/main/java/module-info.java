module com.javaoop.projekbesarpbo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires java.sql;

    opens com.javaoop.projekbesarpbo to javafx.fxml;
    exports com.javaoop.projekbesarpbo;
}