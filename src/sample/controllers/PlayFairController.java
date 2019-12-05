package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.Algoritms.PlayFairCipher;

public class PlayFairController {

    public Button decryptButton;
    public Button encryptButton;
    public TextField textField;
    public Label encryptedLabel;
    public Label headerLabel;

    private PlayFairCipher playFairCipher ;

    public PlayFairController() {
        playFairCipher = new PlayFairCipher();
    }

    @FXML
    private void initialize() {
        encryptButton.setOnMouseClicked(mouseEvent -> handleEncryptButton());
        decryptButton.setOnMouseClicked(mouseEvent -> handleDecryptedButton());
    }
    
    private void handleEncryptButton() {
        String message = textField.getText();
        String encryptedMessage;
        encryptedMessage = playFairCipher.encrypt(message);
        showEncryptedMessage(encryptedMessage);
    }

    private void handleDecryptedButton() {
        String encryptedMessage = encryptedLabel.getText();
        String decryptedMessage;
        decryptedMessage = playFairCipher.decrypt(encryptedMessage);
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