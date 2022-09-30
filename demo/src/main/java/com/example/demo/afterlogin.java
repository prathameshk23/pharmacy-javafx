package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

public class afterlogin {

    @FXML
    private Button buy;

    @FXML
    private Button sell;

    @FXML
    private Button stock;

    @FXML
    private Button userinfo;


    @FXML
    private Button hello;



    public void user(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("userinfo.fxml");
}
    public void buy(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("buy.fxml");
    }

    public void stocks(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("stocklist.fxml");
    }

    public void sales(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("sell.fxml");
    }



}