import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        stage = new Login();
        stage.setTitle("Sistema de Entregas");
        stage.show();

        Login.hplink.setOnAction( e -> {
            getHostServices().showDocument("https://github.com/flinraider/Sistema_de_entregas_javafx");
            
         });
        
    }


    public static void main(String[] args) throws Exception {
        launch(args);
    }

}
