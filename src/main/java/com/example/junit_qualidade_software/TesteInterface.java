package com.example.junit_qualidade_software;
import junit.framework.TestCase;


public class TesteInterface extends TestCase {
    public static void main(HelloController controller) {
        //HelloController controller = HelloController.getInstance();

        // TODO: testar se existe/está aparecendo

        assertEquals("Alisson", controller.getNome());
        assertEquals("12345678910", controller.getCpf_cnpj());
        assertEquals("email@gmail.com", controller.getEmail());
        assertEquals("senha123", controller.getSenha());
        assertEquals("senha123", controller.getConfir_senha());
        System.out.println();
    }

}
