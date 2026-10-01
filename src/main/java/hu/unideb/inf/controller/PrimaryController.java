package hu.unideb.inf.controller;

import java.io.IOException;

import hu.unideb.inf.App;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
