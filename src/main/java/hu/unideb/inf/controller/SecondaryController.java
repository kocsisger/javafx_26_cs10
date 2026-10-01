package hu.unideb.inf.controller;

import java.io.IOException;

import hu.unideb.inf.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}