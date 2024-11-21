package p.project;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;

import java.io.IOException;

public class CustomListController {

    @FXML
    private ComboBox<String> shopComboBox;

    @FXML
    private void addItemsToList() {
        // Logic to add selected items from the shop to the list
        System.out.println("Items added to the list");
    }

    @FXML
    private void proceedToPayment(javafx.event.ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("payment.fxml"));
            Parent root = loader.load();

            // Create a new scene with the loaded FXML and apply CSS
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

            // Get the current stage from the event and set the new scene
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error loading payment.fxml.");
        }
    }
}
