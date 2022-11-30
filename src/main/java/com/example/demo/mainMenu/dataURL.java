package com.example.demo.mainMenu;

public class dataURL{
    public dataURL(String id, String nameCrypto, String priceCrypto, String exchein24,String volume24,String cap) {
        this.id = id;
        this.nameCrypto = nameCrypto;
        this.priceCrypto = priceCrypto;
        this.exchein24 = exchein24;
        this.volume24 = volume24;
        this.cap = cap;
    }

    public String getId() {
        return id;
    }

    public String getNameCrypto() {
        return nameCrypto;
    }

    public String getPriceCrypto() {
        return priceCrypto;
    }

    public String getExchein24() {
        return exchein24;
    }
    public String getVolume24() {return volume24;}

    public String getCapText() {return cap;}


    public void setId(String id) {
        this.id = id;
    }

    public void setNameCrypto(String nameCrypto) {
        this.nameCrypto = nameCrypto;
    }

    public void setPriceCrypto(String priceCrypto) {
        this.priceCrypto = priceCrypto;
    }

    public void setExchein24(String exchein24) {
        this.exchein24 = exchein24;
    }
    public void setVolume24(String volume24) {this.volume24 = volume24;}

    public void setCapText(String capText) {this.cap = capText;}

    private String id;
    private String nameCrypto;
    private String priceCrypto;
    private String exchein24;

    private String volume24;


    private String cap;


}
