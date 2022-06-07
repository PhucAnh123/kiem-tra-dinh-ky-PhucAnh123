import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Shop {

    @FXML
    private Label password;

    @FXML
    private TextField description;

    @FXML
    private TextField price;

    @FXML
    private TextField quanlity;

    @FXML
    private TextField select;

    @FXML
    private TextField fib1;

    @FXML
    private TextField fin1;

    @FXML
    private TextField fit1;

    @FXML
    private TextField fib2;

    @FXML
    private TextField fin2;

    @FXML
    private TextField fit2;

    @FXML
    private TextField fib3;

    @FXML
    private TextField fin3;

    @FXML
    private TextField fit3;

    @FXML
    private TextField fib4;

    @FXML
    private TextField fin4;

    @FXML
    private TextField fit4;

    @FXML
    private Button search;

    @FXML
    private Button checkout;

    @FXML
    void onField(ActionEvent event)  throws IOException{
        Scene scene=ShopDemo.getMainScenne();
        scene.setRoot(new FXMLLoader(getClass().getResource("bill.fxml")).load());
    }

    @FXML
    void onPress(ActionEvent event)  {


    }

}
