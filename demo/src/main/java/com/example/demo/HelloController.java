package com.example.demo;

import javafx.scene.*;
import javax.swing.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {

    public HelloController(){

    }

    @FXML
    private Label login;

    @FXML
    private Button btnlog;

    @FXML
    private TextField txtpass;

    @FXML
    private TextField txtuname;

    public void userLogin(ActionEvent event) throws IOException{
        checkLogin();
    }




    public void checkLogin() throws IOException{
        HelloApplication m = new HelloApplication();
        if(txtuname.getText().toString().equals("user") && txtpass.getText().toString().equals("user")){
            login.setText("Success");
            m.changeScene("afterlogin.fxml");
        }

        else if (txtuname.getText().toString().isEmpty() && txtpass.getText().toString().isEmpty()){
            login.setText("Enter your Data");
        }

        else {
            login.setText("Wrong Data");
        }
    }

}