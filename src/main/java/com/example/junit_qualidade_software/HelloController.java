package com.example.junit_qualidade_software;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    //private static HelloController instance;
    public HelloController() {}

    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private TextField tfNome, tfCpf, tfEmail, tfSenha, tfConfirm_senha, tfData;
    @FXML
    private RadioButton rbCpf, rbCnpj;
    @FXML
    private CheckBox cbTermos;

    private String nome, cpf_cnpj, genero,email, senha, confir_senha, data;

    private boolean cpf, cnpj, termos;

    @FXML
    void initialize() {
        ObservableList<String> items = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");
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
    }

    @FXML
    protected void onProntoButtonClick() {
        this.nome = tfNome.getText();
        this.cpf_cnpj = tfCpf.getText();
        this.genero = comboBox.getValue();
        this.email = tfEmail.getText();
        this.senha = tfSenha.getText();
        this.confir_senha = tfConfirm_senha.getText();
        this.data = tfData.getText();
        this.cpf = rbCpf.isSelected();
        this.cnpj = rbCnpj.isSelected();
        this.termos = cbTermos.isSelected();
        TesteInterface.main(this);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getConfir_senha() {
        return confir_senha;
    }

    public String getData() {
        return data;
    }

    public boolean isCpf() {
        return cpf;
    }

    public boolean isCnpj() {
        return cnpj;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isTermos() {
        return termos;
    }
}