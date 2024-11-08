module org.crudsyslocacar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    //requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.crudsyslocacar to javafx.fxml;
    exports org.crudsyslocacar;
    exports org.crudsyslocacar.controller;
    opens org.crudsyslocacar.controller to javafx.fxml;
}