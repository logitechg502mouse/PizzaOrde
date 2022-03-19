import java.io.IOException;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PizzaOrder extends Application {
    public static void main(String[] args){
      launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException{
        primaryStage.setTitle("Demo JavaFX application");
        Parent root = FXMLLoader.load(getClass().getResource("PizzaOrder.fxml"));
        primaryStage.setScene(new Scene(root, 700, 700)); 

        primaryStage.show();      
    }
}

//this is a test