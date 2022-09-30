package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StockList<qu, num1> implements Initializable {




        @FXML
        private TableColumn<Stock, String> cname;

        @FXML
        private TableColumn<Stock, String> date;

        @FXML
        private TableColumn<Stock, String> name;

        @FXML
        private TableColumn<Stock, String> price;

        @FXML
        private TableColumn<Stock, String> qunt;



        @FXML
        public TableView<Stock> stable;





        ObservableList<Stock> list = FXCollections.observableArrayList(
                new Stock("Algina Tablet 10s","Geno Pharma","5-10-2022","30","99"),
                new Stock("Cipmol 500 Mg Tablet","Cipla","16-5-2023","90","430"),
                new Stock("Malidens 500mg Tab","Abbott India","6-2-2024","100","30"),
                new Stock("Parafast Tablet ","Cipla","23-10-2023","67","300"),
                new Stock("Paracip 500 Mg Tablet","Cipla","1-3-2024","20","330"),
                new Stock("Doliza Tab","Ranbaxy","21-1-2023","82","930"),
                new Stock("Cipflam Tablet 15s"," Cipla","21-3-2024","62","310"),
                new Stock("Calpol 500mg Tab 15s","Glaxosmithkline","9-7-2024","87","1130"),
                new Stock("Dolo 500mg Tablet 15s","Micro Labs","12-8-2024","150","22"),
                new Stock("C 37 500mg Tablet 10s","Navil Laboratories","3-10-2024","10","220"),
                new Stock("Actiflu Tablet 10s","Cipla","4-12-2024","88","760"),
                new Stock("Pacimol XP 500mg Tab","Ipca Labs","25-6-2024","190","870")
        );

        public void initialize(URL location, ResourceBundle resources) {
                name.setCellValueFactory(new PropertyValueFactory<Stock, String>("name"));
                qunt.setCellValueFactory(new PropertyValueFactory<Stock, String>("qunt"));
                date.setCellValueFactory(new PropertyValueFactory<Stock, String>("date"));
                cname.setCellValueFactory(new PropertyValueFactory<Stock, String>("cname"));
                price.setCellValueFactory(new PropertyValueFactory<Stock, String>("price"));

                stable.setItems(list);
        }

        public void backitup(ActionEvent event) throws IOException {
                HelloApplication m = new HelloApplication();
                m.changeScene("afterlogin.fxml");
        }

        public void additup(ActionEvent event) throws IOException{
                Stock s = new Stock("ddd","sss","222","333","222");

                stable.getItems().add(s);
        }

}


