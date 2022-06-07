import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginDemo  extends Application {
    private static Scene mainScenne;

    public static Scene getMainScenne() {
        return mainScenne;
    }

    public static void main(String[] args) {
        launch(args);


    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        mainScenne=new Scene(new FXMLLoader(getClass().getResource("login.fxml")).load());
        primaryStage.setScene(mainScenne);
        primaryStage.show();
//
    }
}


