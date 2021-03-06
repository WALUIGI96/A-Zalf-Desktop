/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktop;

import FX.OverzichtController;
import collection.Administratie;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ramon
 */
public class Desktop extends Application {

    private String fxml = "/FX/Overzicht.fxml";

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(fxml));
        Parent root = FXMLLoader.load(getClass().getResource("/FX/Overzicht.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setTitle("A-Zalf Desktop");
        primaryStage.setScene(scene);
        primaryStage.show();
        OverzichtController controller = new OverzichtController();
        //Administratie administratie = new Administratie();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
