/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Griya Salbini
 */
public class ComboController implements Initializable {

    @FXML
    public Label myLabel;
            
    @FXML 
    public ComboBox<String> combobox;
    
    ObservableList<String> list = FXCollections.observableArrayList("Dhimas", "Sangat", "Ganteng", "Banget");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        combobox.setItems(list);
    }

    public void comboChanged(ActionEvent event){
        combobox.getItems().addAll("Kangen", "Kamu", "Sayang");
        myLabel.setText(combobox.getValue());
    }
    
}
