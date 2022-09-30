package com.example.demo;

import javafx.event.ActionEvent;
import com.example.demo.Stock;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class addstocks{

    public void add(ActionEvent event) throws IOException{
        Stock s = new Stock("ddd","sss","222","333","222");
        StockList ss = new StockList();
        ss.stable.getItems().add(s);
    }
    public void backk(ActionEvent event) throws IOException{
        HelloApplication m = new HelloApplication();
        m.changeScene("stocklist.fxml");
    }

}
