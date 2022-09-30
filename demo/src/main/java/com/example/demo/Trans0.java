package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Trans0 {

    @FXML
    private Button btacc;

    @FXML
    private Button btnba;

    public void backup(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("afterlogin.fxml");
    }
    public void next(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("confirmation.fxml");
    }

}
