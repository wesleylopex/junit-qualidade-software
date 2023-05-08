package com.example.junit_qualidade_software;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    public HelloController() {}

    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private TextField tfNome, tfCpf, tfEmail, tfSenha, tfConfirm_senha, tfData;
    @FXML
    private RadioButton rbCpf, rbCnpj;
    @FXML
    private CheckBox cbTermos;

    @FXML
    private Button btPronto;
    @FXML
    void initialize() {
        ObservableList<String> items = FXCollections.observableArrayList("Masculino", "Feminino", "Outro");
        comboBox.setItems(items);

        ToggleGroup group = new ToggleGroup();
        rbCpf.setSelected(true);
        rbCpf.setToggleGroup(group);
        rbCnpj.setToggleGroup(group);

        rbCpf.setOnMouseClicked(mouseEvent -> {
            tfData.setDisable(false);
        });

        rbCnpj.setOnMouseClicked(mouseEvent -> {
            tfData.clear();
            tfData.setDisable(true);
        });

        this.checkElementsOnScreen();

        tfCpf.setText("12345678910");
        tfEmail.setText("email@gmail.com");
        tfSenha.setText("senha123");
        tfConfirm_senha.setText("senha123");
        tfData.setText("01/01/1111");
    }

    private void checkElementsOnScreen () {
        TesteInterface.buttonIsOnScreen(btPronto);
        TesteInterface.textFieldIsOnScreen(tfNome);
        TesteInterface.textFieldIsOnScreen(tfCpf);
        TesteInterface.textFieldIsOnScreen(tfEmail);
        TesteInterface.textFieldIsOnScreen(tfSenha);
        TesteInterface.textFieldIsOnScreen(tfConfirm_senha);
        TesteInterface.textFieldIsOnScreen(tfData);
    }

    private void checkTexts() {
        TesteInterface.assertEquals("Nome", tfNome.getText());
        TesteInterface.assertEquals("12345678910", tfCpf.getText());
        TesteInterface.assertEquals("Masculino", comboBox.getValue());
        TesteInterface.assertEquals("01/01/1111",tfData.getText());
        TesteInterface.assertEquals("email@gmail.com", tfEmail.getText());
        TesteInterface.assertEquals("senha123", tfSenha.getText());
        TesteInterface.assertEquals("senha123", tfConfirm_senha.getText());
        TesteInterface.assertEquals(true, cbTermos.isSelected());

        if(rbCnpj.isSelected()) {
            TesteInterface.assertEquals("", tfData.getText());
        }
    }

    @FXML
    protected void onProntoButtonClick() {
        this.checkTexts();
    }
}