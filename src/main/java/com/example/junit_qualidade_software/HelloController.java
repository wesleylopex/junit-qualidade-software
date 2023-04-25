package com.example.junit_qualidade_software;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private TextField tfNome;
    @FXML
    void initialize() {
        tfNome.requestFocus();
        ObservableList<String> items = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");
        comboBox.setItems(items);
    }
}