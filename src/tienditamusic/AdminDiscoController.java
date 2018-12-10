/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rojas
 */
public class AdminDiscoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void salir(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("AdminMenu.fxml"));
        Scene escenaMenu = new Scene(parent);
        Stage menuStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menuStage.setScene(escenaMenu);
        menuStage.show();
    }
    
    public void agrega(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("AdminTrack.fxml"));
        Scene escenaMenu = new Scene(parent);
        Stage menuStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        menuStage.setScene(escenaMenu);
        menuStage.show();
    }
}
