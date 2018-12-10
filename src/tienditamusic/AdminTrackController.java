/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienditamusic;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author rojas
 */
public class AdminTrackController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private TextField name;
    
    @FXML
    private TextField length;
    
    @FXML
    private TextField id;
    
    @FXML
    private TextField genero;
    
    @FXML
    private TableView<Track> table;
    
    @FXML
    private TableColumn<Track, String> names;
    
    @FXML
    private TableColumn<Track, Integer> largo;
    
    @FXML
    private TableColumn<Track, Integer> idColumn;
    
    @FXML
    private TableColumn<Track, String> generos;
    
    Track tom = new Track(12, "Tom", "yea", 103);
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        names.setCellValueFactory(new PropertyValueFactory<>("names"));
        largo.setCellValueFactory(new PropertyValueFactory<>("largo"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("idColumn"));
        generos.setCellValueFactory(new PropertyValueFactory<>("generos"));
        
        table.getItems().setAll(tom);
    }    
    
    public void agregar(){
        try{
            ObservableList<Track> data = table.getItems();
            Track track = new Track();
            track.setName(name.getText());
            track.setTiempo(length.getText());
            track.setTimeProp(Integer.parseInt(length.getText()));
            track.setGeneroProp(genero.getText());
            track.setId(id.getText());
            track.setIdProp(track.getId());
            data.add(track);
            clear();
        }
        catch(IOException ex){
            clear();
            Alert alert = new Alert(Alert.AlertType.WARNING, "Por favor ingrese datos correctos", ButtonType.OK);
            alert.showAndWait();
        }
    }
    
    public void terminar(){
        
    }
    
    private void clear(){
        name.clear();
        length.clear();
        id.clear();
        genero.clear();
    }
}
