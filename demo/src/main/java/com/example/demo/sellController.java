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

public class sellController implements Initializable {

    @FXML
    private TableView<sales> satable;

    @FXML
    private TableColumn<sales, String> cid;

    @FXML
    private TableColumn<sales, String> name;

    @FXML
    private TableColumn<sales, String> prc;

    @FXML
    private TableColumn<sales, String> qun;

    @FXML
    private TableColumn<sales, String> sid;

    @FXML
    private TableColumn<sales, String> sr;

    @FXML
    private TableColumn<sales, String> tam;

    ObservableList<sales> list = FXCollections.observableArrayList(
            new sales("Parafast Tablet ","4534","34","67","1","300","565"),
            new sales("Paracip 500 Mg Tablet","862","22","20","2","330","654"),
            new sales("Doliza Tab","4522","66","82","3","930","745"),
            new sales("Cipflam Tablet 15s","342","87","62","4","310","434"),
            new sales("Calpol 500mg Tab 15s","72","43","87","5","1130","765"),
            new sales("Dolo 500mg Tablet 15s","327","35","150","6","22","676")
    );

    public void initialize(URL location, ResourceBundle resources) {
        sr.setCellValueFactory(new PropertyValueFactory<sales, String>("sr"));
        name.setCellValueFactory(new PropertyValueFactory<sales, String>("name"));
        qun.setCellValueFactory(new PropertyValueFactory<sales, String>("qun"));
        sid.setCellValueFactory(new PropertyValueFactory<sales, String>("sid"));
        cid.setCellValueFactory(new PropertyValueFactory<sales, String>("cid"));
        prc.setCellValueFactory(new PropertyValueFactory<sales, String>("prc"));
        tam.setCellValueFactory(new PropertyValueFactory<sales, String>("tam"));

        satable.setItems(list);
    }
    public void backk(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("afterlogin.fxml");
    }







}
