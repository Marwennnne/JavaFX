/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl4_tp;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alia
 */
public class DetailController implements Initializable {
	
    @FXML
    private Label description;
    
    @FXML
    private Label offre;
    
    @FXML
    private Button btn;
    
    @FXML
    private Button btnAch;
    
    @FXML
    private Label prix;
    
    @FXML
    private Label categorie;
    
 

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	
    	EventHandler<ActionEvent> btnHandler = new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event) {
    			System.out.println("works");
    	         FXMLLoader loader = new FXMLLoader(getClass().getResource("ListeProduit.fxml"));
    	         try {
					Parent root = loader.load();
					description.getScene().setRoot(root);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	};
    	EventHandler<ActionEvent> btnHandler_ = new EventHandler<ActionEvent>() {
    		public void handle(ActionEvent event) {
    	         FXMLLoader loader = new FXMLLoader(getClass().getResource("AjoutLivre.fxml"));
    	         try {
					Parent root = loader.load();
					offre.getScene().setRoot(root);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	};
    	
    	btnAch.setOnAction(btnHandler_);
    	btn.setOnAction(btnHandler);
    } 

    
   public void setData(Integer id, String cate,String descri , String off, Double p) {
	   description.setText("Description: "+descri);
	   offre.setText("Offre: "+off);
	   categorie.setText("Categorie: "+ cate);
	   prix.setText("Prix: "+p.toString());
   }
    
}
