package gl4_tp;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Legion
 */
public class bancaireController implements Initializable {

	@FXML
	private Button valider;
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	EventHandler<ActionEvent> btnHandler = new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event) {
    	         FXMLLoader loader = new FXMLLoader(getClass().getResource("SuccesReclamation.fxml"));
    	         try {
					Parent root = loader.load();
					valider.getScene().setRoot(root);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	};
    	valider.setOnAction(btnHandler);
    }    
    
    
}
