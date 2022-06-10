package br.com.consoletech.gui;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Principal extends Stage {

    private VBox vbox = new VBox();
    private Scene scene = new Scene( vbox, 1920, 1080 );
    private ImageView wall = new ImageView(getClass().getResource("wallpaper.png").toString());
    private MenuBar menuBar = new MenuBar();
    private Menu menu = new Menu("Arquivo");
    private MenuItem menuItem = new MenuItem("Usuarios");
    private MenuItem menuItem2 = new MenuItem("Sair");

    
    public Principal(){
        setTitle("Entregas");
        String pathCss = getClass().getResource("principal.css").toExternalForm();
        scene.getStylesheets().add(pathCss);

        menuItem2.setOnAction( e -> {
            System.exit(0);
        });

        setHierarchy();
        setResizable( true );
        setScene( scene );
        show();
    }

    private void setHierarchy(){

        vbox.getChildren().addAll( menuBar, wall );

        menuBar.getStyleClass().add("menubar");
        menuBar.getMenus().add( menu );
        menuBar.setPrefSize( 100, 40);

        menu.getItems().addAll( menuItem, menuItem2 );
        menu.getStyleClass().add("menu");
        

        menuItem.getStyleClass().add("menuitem");
        menuItem2.getStyleClass().add("menuitem");

        wall.setFitWidth(1920);
        wall.setFitHeight( 1000);
        
    }
    
}