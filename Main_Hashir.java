package p.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main_Hashir extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main_Hashir.class.getResource("place_order1.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);  // Set window size to 500x500
            stage.setTitle("Grocery List Selection");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}