package com.example.demo.mainMenu;

import com.example.demo.URL.UrlLinks;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.concurrent.atomic.AtomicInteger;

import static com.example.demo.URL.URLconect.getUrlContent;

public class mainWindow {

    UrlLinks urlLinks = new UrlLinks();

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public void setPage(int page) {
        this.page = page;
    }

    private String currency ="USD";
    private int perPage = 100;
    private int page = 1;


    public Button getGo() {
        return go;
    }

    @FXML
    private Button go;
    @FXML
    private Text mb;

    public Button getOne() {
        return one;
    }

    public Button getTwo() {
        return two;
    }

    public Button getTher() {
        return ther;
    }

    public Button getFour() {
        return four;
    }

    public Button getFive() {
        return five;
    }

    public Button getSix() {
        return six;
    }

    public Button getSeven() {
        return seven;
    }

    public Button getEight() {
        return eight;
    }

    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button ther;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;

    @FXML
    private Button eight;
    @FXML
    private Text nameCrypto;

    @FXML
    private Text priceCrypto;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    private Text change;
    @FXML
    private Text idRank;


    public void data() {
        String url = urlLinks.urlCoinGeco(currency, perPage, page);                       //параметры для отображение курс валют на главное страницы
        String content = getUrlContent(url);

        JSONArray object = new JSONArray(content);
        String name = "";
        String price = "";
        String idR = "";
        String volotilnost ="";
        for (int i = 0; i < object.length(); i++) {
            String data = object.get(i).toString();
            JSONObject jsonObject = new JSONObject(data);
            name = name + "\n" + jsonObject.get("symbol").toString();
            price = price + "\n" + jsonObject.get("current_price");
            idR = idR +"\n" + jsonObject.get("market_cap_rank").toString();
            volotilnost += "\n" + jsonObject.get("market_cap_change_percentage_24h") +"%";
            nameCrypto.setText(name);
            priceCrypto.setText(price);
            idRank.setText(idR);
            change.setText(volotilnost);
        }
    }

    @FXML
    void initialize() {
        AtomicInteger i = new AtomicInteger();
        getGo().setOnAction(actionEvent -> {
            setCurrency("USD");
            setPage(1);
            data();
        });
        getOne().setOnAction(event -> {
            setCurrency("USD");
            setPage(1);
            data();
        });
        getTwo().setOnAction(event -> {
            setCurrency("USD");
            setPage(2);
            data();
        });
        getTher().setOnAction(event -> {
            setCurrency("USD");
            setPage(3);
            data();
        });
        getFour().setOnAction(event -> {
            setCurrency("USD");
            setPage(4);
            data();
        });
        getFive().setOnAction(event -> {
            setCurrency("USD");
            setPage(5);
            data();
        });
        getSix().setOnAction(event -> {
            setCurrency("USD");
            setPage(6);
            data();
        });
        getSeven().setOnAction(event -> {
            setCurrency("USD");
            setPage(7);
            data();
        });
        getEight().setOnAction(event -> {
            i.getAndAdd(1);
            setCurrency("USD");
            setPage(8+i.get());
            data();
            eight.setText(String.valueOf(8+i.get()));

        });
    }

}
