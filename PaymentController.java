package p.project;

import javafx.fxml.FXML;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PaymentController {

    @FXML
    private void onlinePayment() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("online_payment.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) root.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}