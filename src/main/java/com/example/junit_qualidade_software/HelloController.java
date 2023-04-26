package com.example.junit_qualidade_software;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class HelloController {

    //private static HelloController instance;
    public HelloController() {}

    /*
    * TODO: achar onde o controller é instanciado.
    * Aparentemente, tem uma chamada interna (new HelloController()) em algum lugar,
    * então, ao usar o singleton, essa chamada é impedidda, pois deveria ser: HelloController.getInstance();.
    */

    /*public static synchronized HelloController getInstance() {
        if (instance == null) {
            instance = new HelloController();
        }
        return instance;
    }*/

    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private TextField tfNome, tfCpf, tfEmail, tfSenha, tfConfirm_senha;
    private String nome, cpf_cnpj, email, senha, confir_senha;

    @FXML
    void initialize() {
        tfNome.requestFocus();
        ObservableList<String> items = FXCollections.observableArrayList("Item 1", "Item 2", "Item 3");
        comboBox.setItems(items);
    }

    @FXML
    protected void onProntoButtonClick() {
        this.nome = tfNome.getText();
        this.cpf_cnpj = tfCpf.getText();
        this.email = tfEmail.getText();
        this.senha = tfSenha.getText();
        this.confir_senha = tfConfirm_senha.getText();
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
}