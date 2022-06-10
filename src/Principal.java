import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Principal extends Stage {

    private AnchorPane anchorPane = new AnchorPane();
    private Scene scene = new Scene( anchorPane, 1920, 1080 );
    
    
    public Principal(){
        setTitle("Entregas");
        setResizable( true );
        setScene( scene );
        show();
    }
    
}
