import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginDemo  extends Application {
    public static void main(String[] args) {
        launch(args);


    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Login.class.getResource("login.fxml"));
        Login  hello = new Login();
        loader.setController(hello);
        Pane pane = loader.load();
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


