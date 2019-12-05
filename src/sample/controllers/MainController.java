package sample.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MainController {
    public Label AlgorithmName;
    public Pane contentArea;

    public JFXButton CaesarButton;
    public JFXButton PlayFairButton;
    public JFXButton FeistelButton;
    public JFXButton DESButton;
    public JFXButton RC4Button;
    public JFXButton RCaButton;

    Parent fxml;

    @FXML
    private void initialize() {

        putContentArea("/sample/views/caesar_view.fxml", "Caesar Algorithm");

        CaesarButton.setOnMouseClicked(mouseEvent -> putContentArea("/sample/views/caesar_view.fxml", "Caesar Algorithm"));
        PlayFairButton.setOnMouseClicked(mouseEvent -> putContentArea("/sample/views/play_fair_view.fxml", "PlayFair Algorithm"));
        FeistelButton.setOnMouseClicked(mouseEvent -> putContentArea("/sample/views/feistel_view.fxml", "Feistel Algorithm"));
        DESButton.setOnMouseClicked(mouseEvent -> putContentArea("/sample/views/des_view.fxml", "DES Algorithm"));
        RC4Button.setOnMouseClicked(mouseEvent -> putContentArea("/sample/views/rc4_view.fxml", "RC4 Algorithm"));
        RCaButton.setOnMouseClicked(mouseEvent -> putContentArea("/sample/views/des_view.fxml", "DES Algorithm"));

    }

    private void putContentArea(String URL, String algorithmName) {
        try {
            fxml = FXMLLoader.load(getClass().getResource(URL));
            contentArea.getChildren().removeAll();
            contentArea.getChildren().setAll(fxml);
            AlgorithmName.setText(algorithmName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}