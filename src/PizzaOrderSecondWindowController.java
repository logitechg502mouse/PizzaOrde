import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class PizzaOrderSecondWindowController implements Initializable{

    @FXML
    private Label pizzaOrder;

    //I literally don't know what happen, it was broken before and all i did was change the label from ordFinal to pizzaOrder

    public void setLabelText(String pizzaOrder){
        this.pizzaOrder.setText(pizzaOrder);
      
    }

    public void add(int i, int x){
        System.out.println(i + x);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // System.out.println(pizzaOrder.getText());  
        // pizzaOrder.setText("testing");
        // System.out.println(pizzaOrder.getText()); 
        
    }

   

}
