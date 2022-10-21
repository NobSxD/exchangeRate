package com.example.demo;

import org.json.JSONObject;

import java.text.DecimalFormat;

public class Launch {


    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    private String price;

    public String getMaxPrice() {
        return maxPrice;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }

    public String getHeightFall() {
        return heightFall;
    }

    public void setHeightFall(String heightFall) {
        this.heightFall = heightFall;
    }

    private String maxPrice;
    private String minPrice;

    private String heightFall;


    public Launch(String getUserCurrencyOne, String getUserCurrencyTwo) {
        if (!getUserCurrencyOne.equals("") || !getUserCurrencyTwo.equals("")) {
            try {
                String outyt = URLconect.getUrlContent("https://api.binance.com/api/v3/ticker?symbol=" + getUserCurrencyOne + getUserCurrencyTwo);
                JSONObject obj = new JSONObject(outyt);
                String lastPrice = (String) obj.get("lastPrice");
                String highPrice = (String) obj.get("highPrice");
                String lowPrice = (String) obj.get("lowPrice");
                String openPrice = (String) obj.get("openPrice");

                DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
                DecimalFormat percentFormat = new DecimalFormat("###,##0.00%");
                float priceLast = Float.parseFloat(lastPrice);
                float priceHight = Float.parseFloat(highPrice);
                float priceOpen = Float.parseFloat(openPrice);
                float priceLow = Float.parseFloat(lowPrice);
                float percent = (priceLast - priceOpen) / priceOpen;

                setPrice("Курс: " + moneyFormat.format((priceLast)));
                setMaxPrice("Макс курс за 24ч: " + moneyFormat.format(priceHight));
                setMinPrice("Мин курс за 24ч: " + moneyFormat.format(priceLow));

                if (percent >= 0) {
                    setHeightFall("Рост курса за 24ч: " + percentFormat.format(percent));

                } else {
                    setHeightFall("Подение курса за 24ч: " + percentFormat.format(percent));

                }

            } catch (Exception e) {
                System.out.println("ERROR: Выбирите другую валюту");
            }

        }
    }
}




