package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {


    public Button getButtonOk() {
        return buttonOk;
    }

    public void setButtonOk(Button buttonOk) {
        this.buttonOk = buttonOk;
    }

    @FXML
    private Button buttonOk;

    @FXML
    private TextField currencyOne;

    @FXML
    private TextField currencyTwo;

    @FXML
    private Text height;

    @FXML
    private Text maxPrice;

    @FXML
    private Text minPrice;

    @FXML
    private Text price;


    @FXML
    void initialize() {
        getButtonOk().setOnAction(event1 -> {
            String getUserCurrencyOne = currencyOne.getText().trim();
            String getUserCurrencyTwo = currencyTwo.getText().trim();
            Launch launch = new Launch(getUserCurrencyOne, getUserCurrencyTwo);

            price.setText(launch.getPrice());
            maxPrice.setText(launch.getMaxPrice());
            minPrice.setText(launch.getMinPrice());
            height.setText(launch.getHeightFall());

        });

    }


}



