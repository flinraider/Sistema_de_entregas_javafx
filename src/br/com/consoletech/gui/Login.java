package br.com.consoletech.gui;

import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
import javafx.geometry.Pos;

public class Login extends Stage {
    
    private Pane pane;
    private Scene scene;
    private ImageView img;
    private HBox hbox, hbox2;
    private VBox vbox;
    private Label label1, label2;
    private Button button, sair;
    private TextField login;
    private PasswordField pass;
    private CheckBox checkBox;
    public static Hyperlink hplink = new Hyperlink("Projeto no GitHub");


    public Login(){
        setTitle("Entregas");
        initStyle(StageStyle.UNDECORATED);
        setHierarchy();
        drawWidgets();
        setScene( scene );
        setResizable( false );
        show();

    }

    private void setHierarchy(){

        pane = new Pane();
        sair =  new Button("X");

        sair.setOnAction( e -> {
            System.exit(0);
        });

        vbox = new VBox();
        hbox = new HBox();
        hbox2 = new HBox();
        img = new ImageView(getClass().getResource("logo_ent.png").toString());



        label1 = new Label("Usuario ");
        label2 = new Label("Senha ");
        login = new TextField();
        pass = new PasswordField();
        checkBox = new CheckBox("Lembrar Senha");
        button = new Button("Entrar");
        
        button.setOnAction( e -> {
               close();
               Principal principal = new Principal();
        });

        vbox.getChildren().addAll( label1, login, label2, pass, hbox, hbox2 );
        hbox.getChildren().addAll( button, checkBox );
        hbox2.getChildren().add( hplink );
        pane.getChildren().addAll(  sair, img, vbox );
        
        //css
        String pathCss = getClass().getResource("login.css").toExternalForm();
        scene = new Scene( pane, 600, 440 );
        //add css in scene
        scene.getStylesheets().add(pathCss);

    }

    private void drawWidgets(){

        pane.getStyleClass().add("pane");

        img.setX(130);
        img.setY(-70);
        img.setFitHeight(350);
        img.setFitWidth(350);

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
        login.setPrefSize( 400, 40 );
        login.getStyleClass().add("textfield");

        label2.setLayoutX( 85 );
        label2.setLayoutY( 190 );
        label2.getStyleClass().add("label");

        pass.setLayoutX( 130 );
        pass.setLayoutY( 190 );
        pass.setPrefSize( 400, 40 );
        pass.getStyleClass().add("textfield");

        button.setLayoutX( 130 );
        button.setLayoutY( 240 );
        button.setPrefSize( 90, 50 );
        button.getStyleClass().add("button");

        sair.setLayoutX( 540 );
        sair.setLayoutY( 20 );

        checkBox.setPrefSize(150, 70);
        checkBox.getStyleClass().add("checkbox");

        hplink.getStyleClass().add("link");

    }

}
