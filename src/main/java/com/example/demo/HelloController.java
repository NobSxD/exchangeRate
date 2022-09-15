package com.example.demo;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.webcerebrium.binance.api.BinanceApi;
import com.webcerebrium.binance.api.BinanceApiException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONString;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;

public class HelloController {



    @FXML
    private TextField city;

    @FXML
    private TextField city1;

    @FXML
    private Text cyrs;

    @FXML
    private Button getData;

    @FXML
    private Text maxCyrs;

    @FXML
    private Text minCyrs;

    @FXML
    private Text rost;

    @FXML
    private MenuButton vbibor1;

    @FXML
    private MenuButton vbibor2;

    @FXML
    void initialize() {

        getData.setOnAction(actionEvent -> {
            String getUserCity = city.getText().trim();
            String getUserCity1 = city1.getText().trim();
            if (!getUserCity.equals("")) {
                try {
                    String outyt = getUrlContent("https://api.binance.com/api/v3/ticker?symbol="+ getUserCity + getUserCity1);
                    JSONObject obj  = new JSONObject(outyt);
                    String Kyrs = (String) obj.get("lastPrice");
                    String maxKyrs = (String) obj.get("highPrice");
                    String mixKyrs = (String) obj.get("lowPrice");
                    String procent = (String) obj.get("openPrice");

                    float format1 = new Float(Kyrs);
                    float format2 = new Float(maxKyrs);
                    float format3 = new Float(mixKyrs);
                    float format4 = new Float(procent);
                    float a = (format1 - format4)/format4*100;

                    String formattedDouble = String.format("%.3f", format1);
                    String formattedDouble1 = String.format("%.3f", format2);
                    String formattedDouble2 = String.format("%.3f", format3);
                    String formattrdDouble3 = String.format("%.1f", a);





                    cyrs.setText("Курс: " + formattedDouble + " " + getUserCity1);
                    maxCyrs.setText("Макс курс за 24ч: " + formattedDouble1 + " " + getUserCity1);
                    minCyrs.setText("Мин курс за 24ч: " + formattedDouble2 + " " + getUserCity1);

                    if(a >= 0) {
                        rost.setText("Рост курса за 24ч: " + formattrdDouble3 + " %");

                    }
                    else {rost.setText("Подение курса за 24ч: " + formattrdDouble3 + " %");

                    }

                } catch (Exception e) {
                    cyrs.setText("ERROR: Выбирите другую валюту");
                }



            }

        });

    }


    private static String getUrlContent(String urlAdress) {
        StringBuffer contentt = new StringBuffer();
        try {

            URL url = new URL(urlAdress);
            URLConnection urlConn = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                contentt.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {

        }
        return contentt.toString();

    }

}
