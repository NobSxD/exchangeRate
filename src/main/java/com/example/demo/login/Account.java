package com.example.demo.login;

import com.example.demo.mainMenu.systema;
import com.example.demo.rigister.startOfRegistration;
import javafx.stage.Stage;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Account {

    public String getLoginNam() {
        return loginNam;
    }

    public String getPassword() {
        return password;
    }

    public String getNotifications() {
        return notifications;
    }

    public void setLoginNam(String loginNam) {
        this.loginNam = loginNam;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    private String loginNam;
   private String password;
   private String notifications;
   HashMap<String,String> loginPassword = new HashMap<>();
   systema systema = new systema();
   startOfRegistration startOfRegistration = new startOfRegistration();

    public  void saveHashMap(){
        try {
            YamlConfiguration cfg = new YamlConfiguration();
            for (String key : loginPassword.keySet()){
                cfg.set(key,  loginPassword.get(key));
            }
            File f = new File (getLoginNam()+ File.separator+"hashmap.yml");
            if (f.exists()) f.delete();
            cfg.save(f);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Log(){
        if (loginPassword.containsKey(loginNam) == true){
            if (loginPassword.containsValue(password) == true){
                try {
                    systema.start(new Stage());
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
            try {
                startOfRegistration.start(new Stage());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            if (loginPassword.containsKey(loginNam) == true){
            notifications = (" такой логин уже занят");
        }
        else {
            loginPassword.put(loginNam,password);
            notifications = ("Регестрация завершина, Войдите в систему");

        }
    }
}
