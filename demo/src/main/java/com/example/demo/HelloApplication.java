package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class HelloApplication extends Application {
    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {
        stg = stage;
        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pharmacy Management");
        Image icon = new Image("C:\\Users\\prath\\Downloads\\icon.png");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}