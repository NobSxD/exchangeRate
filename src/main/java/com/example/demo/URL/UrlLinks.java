package com.example.demo.URL;


public class UrlLinks {


    public String urlCoinGeco(String currency, int perPage, int page){
       String urlAdrees = "https://api.coingecko.com/api/v3/coins/markets?vs_currency="+currency+"&order=market_cap_desc&per_page="+perPage+"&page="+page+"&sparkline=false";
        return urlAdrees;
    }


}


