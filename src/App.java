import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class App extends Application {

    private Stage stage;
    private Scene scene, scene2;
    private Pane pane;
    private ImageView img;
    private HBox hbox, hbox2;
    private VBox vbox;
    private Label label1, label2;
    private Button button;
    private TextField login;
    private PasswordField pass;
    private CheckBox checkBox;
    private Hyperlink hplink;



    @Override
    public void start(Stage stage) throws Exception {
       
       
        stage.setTitle("Sistema de Entregas");
        setHierarchy();
        drawWidgets();
        stage.setScene( scene );
        stage.setResizable( false );
        stage.show();
        
    }

    private void setHierarchy(){

        pane = new Pane();
        vbox = new VBox();
        hbox = new HBox();
        hbox2 = new HBox();
        img = new ImageView(getClass().getResource("logo.png").toString());

        hplink = new Hyperlink("Projeto no GitHub");

        hplink.setOnAction( e -> {
            getHostServices().showDocument("https://github.com/flinraider");
        });

        label1 = new Label("Usuario ");
        label2 = new Label("Senha ");
        login = new TextField();
        pass = new PasswordField();
        checkBox = new CheckBox("Lembrar Senha");

        button = new Button("Entrar");
        button.setOnAction( e -> {
            
        });

                // exemplo de funcao
        //button2.setOnAction(e -> {  System.exit(0); });

        vbox.getChildren().addAll( label1, login, label2, pass, hbox, hbox2 );
        hbox.getChildren().addAll( button, checkBox );
        hbox2.getChildren().add( hplink );
        pane.getChildren().addAll(  img, vbox );
        
        //css
        String pathCss = getClass().getResource("app.css").toExternalForm();
        scene = new Scene( pane, 600, 440 );
        //add css in scene
        scene.getStylesheets().add(pathCss);

    }

    private void drawWidgets(){

        pane.getStyleClass().add("pane");

        img.setX(200);
        img.setFitHeight(220);
        img.setFitWidth(220);

        vbox.setAlignment(Pos.CENTER_LEFT);
        vbox.setSpacing( 5 );
        vbox.setLayoutX( 100 );
        vbox.setLayoutY( 180 );

        hbox.setAlignment(Pos.CENTER_LEFT);
        hbox.setSpacing( 10 );
        hbox.setLayoutX( 200 );
        hbox.setLayoutY( 250 );

        hbox2.setAlignment(Pos.CENTER);

        label1.setLayoutX( 75 );
        label1.setLayoutY( 150 );
        label1.getStyleClass().add("label");
    
        login.setLayoutX( 130 );
        login.setLayoutY( 150 );
        login.setPrefSize( 400, 30 );
        login.getStyleClass().add("textfield");

        label2.setLayoutX( 85 );
        label2.setLayoutY( 190 );
        label2.getStyleClass().add("label");

        pass.setLayoutX( 130 );
        pass.setLayoutY( 190 );
        pass.setPrefSize( 400, 30 );
        pass.getStyleClass().add("textfield");

        button.setLayoutX( 130 );
        button.setLayoutY( 240 );
        button.setPrefSize( 90, 50 );
        button.getStyleClass().add("button");

        checkBox.setPrefSize(150, 70);
        checkBox.getStyleClass().add("checkbox");

        hplink.getStyleClass().add("link");

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
