package com.example.junit_qualidade_software;
import junit.framework.TestCase;
import com.example.junit_qualidade_software.HelloController;


public class TesteInterface extends TestCase {
    public static void main(HelloController hello) {
        assertEquals("Alisson", hello.read_name());
        System.out.println();
    }

}
