package com.example.demo.mainMenu;


import com.example.demo.HelloApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class systema extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoaderTwo = new FXMLLoader(HelloApplication.class.getResource("mainWindow.fxml"));
        Scene sceneTwo = new Scene(fxmlLoaderTwo.load());
        stage.setTitle("Binance");
        stage.setScene(sceneTwo);
        stage.show();


    }



    }

