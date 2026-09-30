
package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ComboBox<String> subscriptionBox;

    public void handleRegister() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String subscription = subscriptionBox.getValue();
        // Registration logic
        System.out.println("Registering: " + username + " with " + subscription);
    }
}
