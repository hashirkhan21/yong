package p.project;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OnlinePaymentController {

    @FXML
    private TextField cardNumberField;
    @FXML
    private TextField expiryDateField;
    @FXML
    private TextField cvvField;

    @FXML
    private void confirmPayment() {
        // Validate payment details and proceed
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("place_order.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}