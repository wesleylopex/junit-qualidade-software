module com.example.junit_qualidade_software {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.junit_qualidade_software to javafx.fxml;
    exports com.example.junit_qualidade_software;
}