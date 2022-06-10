import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {

     private Login viewLogin;
     private Principal principal;
     private Scene scene;



    @Override
    public void start(Stage stage) throws Exception {
       
        viewLogin = new Login();
        viewLogin.setTitle("Sistema de Entregas");
        viewLogin.show();
        
    }


    public static void main(String[] args) throws Exception {
        launch(args);
    }

}
