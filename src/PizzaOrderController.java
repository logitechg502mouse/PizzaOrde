import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class PizzaOrderController implements Initializable {

    private String[] pizzaSize = {"Small", "Medium", "Large"};
    private String[] pizzaAmount = {"1", "2", "3"};

    @FXML
    private CheckBox pepperoni, cheese, onion, olive, pineapple;

    @FXML
    private RadioButton thin, regular, thick;

    @FXML
    private Label ordr;

    @FXML
    private Button finOrder;

    @FXML
    private ChoiceBox<String> pizzaOrderChoice, pizzaSizeChoice;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pizzaSizeChoice.getItems().addAll(pizzaSize);
        pizzaSizeChoice.setOnAction(this::orderListing);
        pizzaOrderChoice.getItems().addAll(pizzaAmount);
        pizzaOrderChoice.setValue(pizzaAmount[0]);
        pizzaOrderChoice.setOnAction(this::orderListing);
        
    }

    private String toppingsListing(){
        String toppings = "";
        if(pepperoni.isSelected()){
            toppings += pepperoni.getText() + "\n";
        }

        if(cheese.isSelected()){
            toppings += cheese.getText() + "\n";
        }

        if(onion.isSelected()){
            toppings += onion.getText() + "\n";
        }

        if(olive.isSelected()){
            toppings += olive.getText() + "\n";
        }

        if(pineapple.isSelected()){
            toppings += pineapple.getText() + "\n";
        }


        return toppings;
    }
    

    public void orderListing(ActionEvent event){
        String size = pizzaSizeChoice.getValue();
        String orderings = pizzaOrderChoice.getValue();
        String crust = "";
        if(thin.isSelected())
        {
            crust = thin.getText();
        }
        else if(regular.isSelected())
        {
            crust = regular.getText();
        }
        else if (thick.isSelected()){
            crust = thick.getText();
        }
        else{
            crust = "please choose a crust";
        }

        

        
        ordr.setText(
            String.format("Size of Pizza: %s\nCrust Type: %s\nToppings:\n%s\nNumber of Pizza: %s", size,crust,toppingsListing(), orderings)
        );

    }

    public void orderPizza(){

    }

}

//vscode://vscode.github-authentication/did-authenticate?windowid=1&code=6784e20069803ed742df&state=9fb38e2d-e6e1-4d74-a50e-04cf9d85eef3