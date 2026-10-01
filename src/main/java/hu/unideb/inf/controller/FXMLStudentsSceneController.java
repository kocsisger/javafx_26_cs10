package hu.unideb.inf.controller;

import hu.unideb.inf.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLStudentsSceneController {

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    @FXML
    private Label seasonsLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label dateOfBirthLabel;

    @FXML
    private Label nameLabel;

    @FXML
    void handleLoadButtonPressed(ActionEvent event) {
        nameLabel.setText(model.getStudent().getName());
        creditsLabel.setText(""+model.getStudent().getCredts());
        dateOfBirthLabel.setText(model.getStudent().getDateOfBirth().toString());
    }

    @FXML
    void handleButtonPressed(ActionEvent event) {
        //System.out.println("It works!!!");
        if (seasonsLabel.getText().equals("Winter"))
            seasonsLabel.setText("Summer");
        else
            seasonsLabel.setText("Winter");
    }
}
