package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Confirmation {

    @FXML
    private Button btnl;

    public void done(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("afterlogin.fxml");
    }

}
