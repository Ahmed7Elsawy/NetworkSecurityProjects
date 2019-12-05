package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.Algoritms.CaesarCipher;
import sample.Algoritms.PlayFairCipher;

public class CaesarController {

    public Button decryptButton;
    public Button encryptButton;
    public TextField textField;
    public Label encryptedLabel;
    public Label headerLabel;

    private CaesarCipher caesarCipher ;

    public CaesarController() {
        caesarCipher = new CaesarCipher();
    }

    @FXML
    private void initialize() {
        encryptButton.setOnMouseClicked(mouseEvent -> handleEncryptButton());
        decryptButton.setOnMouseClicked(mouseEvent -> handleDecryptedButton());
    }
    
    private void handleEncryptButton() {
        String message = textField.getText();
        String encryptedMessage;
        encryptedMessage = caesarCipher.encrypt(message);
        showEncryptedMessage(encryptedMessage);
    }

    private void handleDecryptedButton() {
        String encryptedMessage = encryptedLabel.getText();
        String decryptedMessage;
        decryptedMessage = caesarCipher.decrypt(encryptedMessage);
        showDecryptedMessage(decryptedMessage);
    }

    private void showEncryptedMessage(String encryptedMessage) {
        headerLabel.setVisible(true);
        encryptedLabel.setText(encryptedMessage);
        textField.clear();
    }

    private void showDecryptedMessage(String decryptedMessage) {
        headerLabel.setVisible(false);
        textField.setText(decryptedMessage);
        encryptedLabel.setText("");
    }

}