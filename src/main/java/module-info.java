module com.example.junit_qualidade_software {
    requires javafx.controls;
    requires javafx.fxml;
    //requires junit4;
    requires junit;


    opens com.example.junit_qualidade_software to javafx.fxml;
    exports com.example.junit_qualidade_software;
}