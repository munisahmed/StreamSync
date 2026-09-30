
package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        // Authentication logic
        System.out.println("Logging in: " + username);
    }

    public void handleRegisterRedirect() {
        System.out.println("Redirecting to Register Page...");
    }
}
