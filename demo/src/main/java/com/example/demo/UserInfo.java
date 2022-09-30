package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class UserInfo {

    @FXML
    private Button back;

    @FXML
    private Button logo;

    public void back(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("afterlogin.fxml");
    }

    public void logout(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("hello-view.fxml");
    }



}
