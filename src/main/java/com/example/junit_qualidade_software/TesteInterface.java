package com.example.junit_qualidade_software;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import junit.framework.TestCase;

public class TesteInterface extends TestCase {

    public static void main() {}

    public static void assertTextEquals(String expected, String actual) {
        assertEquals(expected, actual);
    }
    public static void buttonIsOnScreen (Button actionButton) {
        assertNotNull(actionButton);
    }

    public static void textFieldIsOnScreen (TextField textField) {
        assertNotNull(textField);
    }
}