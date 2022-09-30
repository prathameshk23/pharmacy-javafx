package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;
import Models.Drug;

import java.io.IOException;

import static Models.DrugList.getPainEeze;
import static Models.DrugList.getNuroFen;
import static Models.DrugList.getAmoxy;

public class BuyComtroller {
    @FXML
    ListView<Drug> itemsList;
    private static Drug boughtDrug;

    public static Drug getBoughtDrug(){return boughtDrug;}

    @FXML
    public void initialize(){

        itemsList.getItems().addAll(getPainEeze(),getNuroFen(),getAmoxy());
    }

    public void goback(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("afterlogin.fxml");
    }

    public void proc(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("trans_0.fxml");
    }


}
