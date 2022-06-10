package br.com.consoletech.application;

import br.com.consoletech.gui.Login;
import javafx.application.Application;
import javafx.stage.Stage;

public class Program extends Application{

    @Override
    public void start(Stage stage)  {
        try {

            stage = new Login();
            
        } catch (Exception e) {
           System.out.println("Error: "+e.getMessage());
        }
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
