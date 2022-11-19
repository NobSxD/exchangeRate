package com.example.demo.login;

import com.example.demo.mainMenu.systema;
import com.example.demo.rigister.startOfRegistration;
import javafx.stage.Stage;

import java.io.*;
import java.util.HashMap;

public class Account {

    public String getNotifications() {
        return notifications;
    }

    public void setLoginNam(String loginNam) {
        this.loginNam = loginNam;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    private String loginNam;
   private String password;
   private String notifications;
   HashMap<String,String> loginPassword = new HashMap<>();

   systema systema = new systema();

   startOfRegistration startOfRegistration = new startOfRegistration();

    public  void saveHashMap() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\chesn\\App\\Project Esc\\src\\main\\resources\\com\\example\\demo\\save.ser");  //сереализация логина пороля
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(loginPassword);
        objectOutputStream.close();
    }

    public void deserialization() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\chesn\\App\\Project Esc\\src\\main\\resources\\com\\example\\demo\\save.ser");  //десереализация логина пороля
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            loginPassword = (HashMap<String, String>) objectInputStream.readObject();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        objectInputStream.close();
    }

    public void Log(){
        try {
            deserialization();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (loginPassword.containsKey(loginNam) == true){
            if (loginPassword.containsValue(password) == true){
                try {
                    systema.start(new Stage());
                    notifications = ("Успешный вход");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else notifications = ("Пароль неверный, ведите другой пароль");
        }
        else {
            notifications = ("Выполните регестрацию");
        }
    }
    public void SaveLogin(){
        if (loginPassword.containsKey(loginNam) == true){
            notifications = (" такой логин уже занят");
        }
        else {
            loginPassword.put(loginNam,password);
            notifications = ("Регестрация завершина, Войдите в систему");
                try {
                    saveHashMap();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
