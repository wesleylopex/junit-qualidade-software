package com.example.junit_qualidade_software;
import javafx.scene.control.TextField;
import junit.framework.TestCase;
import javafx.scene.Scene;

public class TesteInterface extends TestCase {

    public static void main(HelloController controller) {

        // disponivel?


        assertEquals("Nome", controller.getNome());
        assertEquals("12345678910", controller.getCpf_cnpj());
        assertEquals("Item 1", controller.getGenero());
        assertEquals("01/01/1111", controller.getData());
        assertEquals("email@gmail.com", controller.getEmail());
        assertEquals("senha123", controller.getSenha());
        assertEquals("senha123", controller.getConfir_senha());
        assertEquals(true, controller.isTermos());

        if(controller.isCnpj()) {
            assertEquals("", controller.getData());
        }
    }
}