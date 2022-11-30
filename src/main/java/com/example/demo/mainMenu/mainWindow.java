package com.example.demo.mainMenu;

import com.example.demo.URL.UrlLinks;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static com.example.demo.URL.URLconect.getUrlContent;

public class mainWindow {

    public MenuItem getBTC() {
        return BTC;
    }

    public void setBTC(MenuItem BTC) {
        this.BTC = BTC;
    }

    public MenuItem getETH() {
        return ETH;
    }

    public void setETH(MenuItem ETH) {
        this.ETH = ETH;
    }

    public MenuItem getEUR() {
        return EUR;
    }

    public void setEUR(MenuItem EUR) {
        this.EUR = EUR;
    }

    public MenuItem getRUB() {
        return RUB;
    }

    public void setRUB(MenuItem RUB) {
        this.RUB = RUB;
    }

    public MenuItem getUSD() {
        return USD;
    }

    public void setUSD(MenuItem USD) {
        this.USD = USD;
    }

    public Button getCap() {
        return cap;
    }

    public void setCap(Button cap) {
        this.cap = cap;
    }

    public Text getCapText() {
        return capText;
    }

    public void setCapText(Text capText) {
        this.capText = capText;
    }

    public Button getChange1ch() {
        return change1ch;
    }

    public void setChange1ch(Button change1ch) {
        this.change1ch = change1ch;
    }

    public Text getChange1chText() {
        return change1chText;
    }

    public void setChange1chText(Text change1chText) {
        this.change1chText = change1chText;
    }

    public Button getChange24ch() {
        return change24ch;
    }

    public void setChange24ch(Button change24ch) {
        this.change24ch = change24ch;
    }

    public Button getChange7D() {
        return change7D;
    }

    public void setChange7D(Button change7D) {
        this.change7D = change7D;
    }

    public Text getChange7DText() {
        return change7DText;
    }

    public void setChange7DText(Text change7DText) {
        this.change7DText = change7DText;
    }

    public Text getChnge24chText() {
        return chnge24chText;
    }

    public void setChnge24chText(Text chnge24chText) {
        this.chnge24chText = chnge24chText;
    }

    public Button getEight() {
        return eight;
    }

    public void setEight(Button eight) {
        this.eight = eight;
    }

    public Button getFive() {
        return five;
    }

    public void setFive(Button five) {
        this.five = five;
    }

    public Button getFour() {
        return four;
    }

    public void setFour(Button four) {
        this.four = four;
    }

    public Button getId() {
        return id;
    }

    public void setId(Button id) {
        this.id = id;
    }

    public Text getIdText() {
        return idText;
    }

    public void setIdText(Text idText) {
        this.idText = idText;
    }

    public MenuButton getMenuCrypto() {
        return menuCrypto;
    }

    public void setMenuCrypto(MenuButton menuCrypto) {
        this.menuCrypto = menuCrypto;
    }

    public Button getNameCrypto() {
        return nameCrypto;
    }

    public void setNameCrypto(Button nameCrypto) {
        this.nameCrypto = nameCrypto;
    }

    public Text getNameCryptoText() {
        return nameCryptoText;
    }

    public void setNameCryptoText(Text nameCryptoText) {
        this.nameCryptoText = nameCryptoText;
    }

    public Button getOne() {
        return one;
    }

    public void setOne(Button one) {
        this.one = one;
    }

    public Button getPrice() {
        return price;
    }

    public void setPrice(Button price) {
        this.price = price;
    }

    public Text getPriceText() {
        return priceText;
    }

    public void setPriceText(Text priceText) {
        this.priceText = priceText;
    }

    public Button getSeven() {
        return seven;
    }

    public void setSeven(Button seven) {
        this.seven = seven;
    }

    public Button getSix() {
        return six;
    }

    public void setSix(Button six) {
        this.six = six;
    }

    public Button getTher() {
        return ther;
    }

    public void setTher(Button ther) {
        this.ther = ther;
    }

    public Button getTwo() {
        return two;
    }

    public void setTwo(Button two) {
        this.two = two;
    }

    public Button getVolume24() {
        return volume24;
    }

    public void setVolume24(Button volume24) {
        this.volume24 = volume24;
    }

    public Text getVolume24Text() {
        return volume24Text;
    }

    public void setVolume24Text(Text volume24Text) {
        this.volume24Text = volume24Text;
    }

    public Font getX3() {
        return x3;
    }

    public void setX3(Font x3) {
        this.x3 = x3;
    }

    public Color getX4() {
        return x4;
    }

    public void setX4(Color x4) {
        this.x4 = x4;
    }

    @FXML
    private MenuItem BTC;

    @FXML
    private MenuItem ETH;

    @FXML
    private MenuItem EUR;

    @FXML
    private MenuItem RUB;

    @FXML
    private MenuItem USD;

    @FXML
    private Button cap;

    @FXML
    private Text capText;

    @FXML
    private Button change1ch;

    @FXML
    private Text change1chText;

    @FXML
    private Button change24ch;

    @FXML
    private Button change7D;

    @FXML
    private Text change7DText;

    @FXML
    private Text chnge24chText;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button id;

    @FXML
    private Text idText;

    @FXML
    private MenuButton menuCrypto;

    @FXML
    private Button nameCrypto;

    @FXML
    private Text nameCryptoText;

    @FXML
    private Button one;

    @FXML
    private Button price;

    @FXML
    private Text priceText;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button ther;

    @FXML
    private Button two;

    @FXML
    private Button volume24;

    @FXML
    private Text volume24Text;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    public Label getLabelName() {
        return labelName;
    }

    public void setLabelName(Label labelName) {
        this.labelName = labelName;
    }

    @FXML
    private Label labelName;



    UrlLinks urlLinks = new UrlLinks();
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    private String currency;
    private int perPage = 100;
    private int page;
    public void data() {

        String url = urlLinks.urlCoinGeco(currency, perPage, page);
        String content = getUrlContent(url);
        JSONArray object = new JSONArray(content);
        String id ="";
        String namCrypto ="";
        String priceCrypto = "";
        String change1ch = "";
        String change24ch ="";
        String change7D ="";
        String valume24 ="";
        String cap ="";

        for (int i = 0; i < object.length(); i++) {
            String data = object.get(i).toString();
            JSONObject jsonObject = new JSONObject(data);
            id = id + jsonObject.get("market_cap_rank") + "\n";
            namCrypto = namCrypto + jsonObject.get("name") + "\n";
            priceCrypto = priceCrypto + jsonObject.get("current_price") + "*" + "\n";
            change24ch = change24ch + jsonObject.get("market_cap_change_percentage_24h") + "%" + "\n";
            valume24 = valume24 + jsonObject.get("total_volume") + "\n";
            cap = cap + jsonObject.get("market_cap") + "\n";
        }
            idText.setText(id);
            nameCryptoText.setText(namCrypto);
            priceText.setText(priceCrypto);
            chnge24chText.setText(change24ch);
            volume24Text.setText(valume24);
            capText.setText(cap);

    }
    ArrayList<dataURL> map = new ArrayList<>();
    public void data2() {

        String url = urlLinks.urlCoinGeco(currency, perPage, page);
        String content = getUrlContent(url);
        JSONArray object = new JSONArray(content);


        for (int i = 0; i < object.length(); i++) {
            String data = object.get(i).toString();
            JSONObject jsonObject = new JSONObject(data);

                map.add(new dataURL(jsonObject.get("market_cap_rank").toString(), jsonObject.get("symbol").toString(),
                        jsonObject.get("current_price").toString(), jsonObject.get("market_cap_change_percentage_24h").toString(), jsonObject.get("total_volume").toString(), jsonObject.get("market_cap").toString()));


        }

    }



    @FXML
    void initialize() {
        getId().setOnAction(actionEvent -> {
            data2();
            Collections.sort(map, new Comparator<dataURL>() {
            @Override
            public int compare(dataURL o1, dataURL o2) {

                    return (int) -(Double.parseDouble(o1.getId()) - Double.parseDouble(o2.getId()));
            }});
            String id ="";
            String namCrypto ="";
            String priceCrypto = "";
            String change24ch ="";
            String valume24 ="";
            String cap ="";
            for (dataURL u:map) {

               id = id + u.getId() + "\n";
               namCrypto = namCrypto + u.getNameCrypto() +"\n";
               priceCrypto = priceCrypto + u.getPriceCrypto() + "\n";
               change24ch = change24ch + u.getExchein24() + "\n";
               valume24 = valume24 + u.getVolume24() + "\n";
               cap = cap + u.getCapText() + "\n";
            }
            idText.setText(id);
            nameCryptoText.setText(namCrypto);
            priceText.setText(priceCrypto);
            chnge24chText.setText(change24ch);
            volume24Text.setText(valume24);
            capText.setText(cap);
        });

        getUSD().setOnAction(actionEvent -> {
            labelName.setText("USD");
        });
        getRUB().setOnAction(actionEvent -> {
            labelName.setText("RUB");
        });
        getEUR().setOnAction(actionEvent -> {
            labelName.setText("EUR");
        });
        getBTC().setOnAction(actionEvent -> {
            labelName.setText("BTC");
        });
        getETH().setOnAction(actionEvent -> {
            labelName.setText("ETH");
        });


        getOne().setOnAction(event -> {
            setCurrency(labelName.getText());
            setPage(1);
            data();
        });
        getTwo().setOnAction(event -> {
            setCurrency(labelName.getText());
            setPage(2);
            data();
        });
        getTher().setOnAction(event -> {
            setCurrency(labelName.getText());
            setPage(3);
            data();
        });
        getFour().setOnAction(event -> {
            setCurrency(labelName.getText());
            setPage(4);
            data();
        });
        getFive().setOnAction(event -> {
            setCurrency(labelName.getText());
            setPage(5);
            data();
        });
        getSix().setOnAction(event -> {
            setCurrency(labelName.getText());
            setPage(6);
            data();
        });
        getSeven().setOnAction(event -> {
            setCurrency(labelName.getText());
            setPage(7);
            data();
        });
        getEight().setOnAction(event -> {
            setCurrency(labelName.getText());
            setPage(8);
            data();
        });
    }

}
