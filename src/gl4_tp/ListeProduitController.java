/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl4_tp;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.util.logging.Level;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Legion
 */
public class ListeProduitController implements Initializable {


    @FXML
    private TableColumn<Produit, String> colonneNom;

    @FXML
    private TableColumn<Produit, String> colonneTitre;
    
    @FXML
    private TableColumn<Produit, Double> colonnePrix;

    @FXML
    private TableColumn<Produit, Integer> colonneId;

    @FXML
    private TableView<Produit> tableReclamation;

    @FXML
    private TableColumn<Produit, String> colonneDescription;
    


    @FXML
    private TextField tfIdReclamation;

    @FXML
    private Button btnTraiter;

    @FXML
    private Button btnSupprimer;
    
    private  ArrayList<Produit> dataArray = new ArrayList<>(
    		Arrays.asList(
    				new Produit(1,"Balea Crème à Mains","Santé & Beauté","Urea - 100ml - Une Achetée La 2ème Gratuite",10.0),
    				new Produit(2,"Cable hdmi","Électroniques","Cable hdmi - Ultra HD 4k 3m",13.00),
    				new Produit(3,"Brosse cheveux Pneumatique Bois","Santé & Beauté","Brosse cheveux Pneumatique - Coiffage Facile",19.00),
    				new Produit(4,"Telefunken Televiseur ","Électroniques","Telefunken Televiseur -TLF - F3663 - TV - 40 - FULL HD - Garantie 3 ans",5.0),
    				new Produit(5,"Kisonli Haut-parleur portable KK02 ","Électroniques","Kisonli Haut-parleur portable KK02 - Bluetooth - Noir - Garantie 1 An",29.00))
    		);


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        colonneId.setCellValueFactory(new PropertyValueFactory<>("id"));

        colonneNom.setCellValueFactory(new PropertyValueFactory<>("offre"));

        colonneTitre.setCellValueFactory(new PropertyValueFactory<>("categorie"));

        colonneDescription.setCellValueFactory(new PropertyValueFactory<>("Description"));
        
        colonnePrix.setCellValueFactory(new PropertyValueFactory<>("Prix"));
        System.out.println(colonnePrix);
        System.out.println(colonneDescription);
        
        ObservableList<Produit> data = FXCollections.observableArrayList(dataArray);
        System.out.println(data);

        
        
        ;
        tableReclamation.setItems(data);

    }

    @FXML
    void traiterReclamation(ActionEvent event) throws IOException {

        String idTexte = tfIdReclamation.getText();
        int i = Integer.parseInt(idTexte);
        Produit data = dataArray.get(i-1);
        
         FXMLLoader loader = new FXMLLoader(getClass().getResource("viewDetail.fxml"));
         Parent root = loader.load();
         DetailController controller2 = loader.getController();
         controller2.setData(data.getId(),data.getCategorie(),data.getDescription(), data.getOffre(), data.getPrix());
         tfIdReclamation.getScene().setRoot(root);
           


    }


}
