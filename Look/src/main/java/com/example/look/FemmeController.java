package com.example.look;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class FemmeController {
    @FXML
    private Label prixTextField;

    @FXML
    private Label prixPantalon1;

    @FXML
    private Label prixPantalon2;

    @FXML
    private Label prixPantalon3;

    @FXML
    private Label prixPantalon4;

    @FXML
    private Label prixPantalon5;

    @FXML
    private Label prixPantalon6;

    @FXML
    private Button acheterButton1;

    @FXML
    private Button acheterButton2;

    @FXML
    private Button acheterButton3;

    @FXML
    private Button acheterButton4;

    @FXML
    private Button acheterButton5;

    @FXML
    private Button acheterButton6;
    @FXML
    private Button CommanderButton;
    @FXML
    private Label SuccesTextFIeld;
    @FXML
    void acheterButtonOnAction(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            Button button = (Button) event.getSource();
            int prixPantalon = 0;

            // Récupérer le prix du pantalon correspondant
            if (button == acheterButton1) {
                prixPantalon = Integer.parseInt(prixPantalon1.getText());
            } else if (button == acheterButton2) {
                prixPantalon = Integer.parseInt(prixPantalon2.getText());
            } else if (button == acheterButton3) {
                prixPantalon = Integer.parseInt(prixPantalon3.getText());
            } else if (button == acheterButton4) {
                prixPantalon = Integer.parseInt(prixPantalon4.getText());
            } else if (button == acheterButton5) {
                prixPantalon = Integer.parseInt(prixPantalon5.getText());
            } else if (button == acheterButton6) {
                prixPantalon = Integer.parseInt(prixPantalon6.getText());
            }

            // Ajouter le prix du pantalon au prixTextField
            int prixActuel = Integer.parseInt(prixTextField.getText());
            int nouveauPrix = prixActuel + prixPantalon;
            prixTextField.setText(String.valueOf(nouveauPrix));
        }
    }

    @FXML
    void CommanderButtonOnAction(ActionEvent event)
    {
        int prixActuel = Integer.parseInt(prixTextField.getText());
        if (prixActuel != 0 )
        {
            SuccesTextFIeld.setText("commande validee avec success ! ");
        }
        else
        {
            SuccesTextFIeld.setText("Veuillez choisir au moins un produit ! ");

        }
    }
    public void switchtohomme(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("homme.fxml"));
        Stage newStage = new Stage();
        Scene newScene = new Scene(root);
        newStage.setScene(newScene);
        newStage.show();
        // Close the current stage if needed
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }
    public void switchtoapropos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Apropos.fxml"));
        Stage newStage = new Stage();
        Scene newScene = new Scene(root);
        newStage.setScene(newScene);
        newStage.show();
        // Close the current stage if needed
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }
    public void switchtologin(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage newStage = new Stage();
        Scene newScene = new Scene(root);
        newStage.setScene(newScene);
        newStage.show();
        // Close the current stage if needed
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }
}
