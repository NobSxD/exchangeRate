package com.example.demo.login;

import com.example.demo.mainMenu.mainWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloController {


    public Button getLogin() {
        return Login;
    }

    public void setLogin(Button login) {
        Login = login;
    }

    public Button getRegistration() {
        return Registration;
    }

    public void setRegistration(Button registration) {
        Registration = registration;
    }

    @FXML
    private Button Login;

    @FXML
    private Button Registration;

    @FXML
    private TextField loginName;

    @FXML
    private Text notifications;

    @FXML
    private PasswordField password;


    @FXML
    void initialize() {
        Account account = new Account();
        mainWindow mainWindow = new mainWindow();
        getLogin().setOnAction(event1 -> {

            account.setLoginNam(loginName.getText().toString());
            account.setPassword(password.getText().toString());
            account.Log();
            notifications.setText(account.getNotifications());
            String message = account.getNotifications();
            if (message.equals("Пароль неверный, ведите другой пароль") || message.equals("Выполните регестрацию") || message.equals(" такой логин уже занят")) {

            } else ((Stage)(((Button) event1.getSource()).getScene().getWindow())).close();


        });
        getRegistration().setOnAction(event1 -> {
            account.setLoginNam(loginName.getText().toString());
            account.setPassword(password.getText().toString());
            account.SaveLogin();
            notifications.setText(account.getNotifications());
        });
    }

}






