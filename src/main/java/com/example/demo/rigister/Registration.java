package com.example.demo.rigister;

import com.example.demo.login.Account;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Registration {

    @FXML
    private Button Registration;

    @FXML
    private TextField loginName;

    @FXML
    private TextField loginName1;

    @FXML
    private TextField  loginEmail;

    @FXML
    private TextField  loginEmail1;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField password1;

    public Button getRegistration() {
        return Registration;
    }

    @FXML
    private Text registration;

    @FXML
    void initialize() {
        getRegistration().setOnAction(actionEvent -> {
            Account account = new Account();
            String login = loginName.getText();
            String login1 = loginName1.getText();
            String email = loginEmail.getText();
            String email1 = loginEmail1.getText();
            String pas = password.getText();
            String pas1 = password1.getText();

            if (pas.equals(pas1)){
                account.setLoginNam(login);
                account.setPassword(pas);
                String message = account.getNotifications();
                account.SaveLogin();
                message = "Регистрация завершина, войдите в систему";
                ((Stage) (((Button) actionEvent.getSource()).getScene().getWindow())).close();
            }
            else registration.setText("не правельно повторили логин, почту или пароль");

        });
    }

}

