package com.example.demo.URL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLconect {
    public static String getUrlContent(String urlAdress) {
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
