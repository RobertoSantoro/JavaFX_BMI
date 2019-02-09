/**
 * Sample Skeleton for 'BodyMassIndex.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BodyMassIndexController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtPeso"
    private TextField txtPeso; // Value injected by FXMLLoader

    @FXML // fx:id="descrizioneBMI"
    private Label descrizioneBMI; // Value injected by FXMLLoader

    @FXML // fx:id="txtAltezza"
    private TextField txtAltezza; // Value injected by FXMLLoader

    @FXML // fx:id="risultatoNumerico"
    private Label risultatoNumerico; // Value injected by FXMLLoader

    @FXML // fx:id="BMI"
    private Button BMI; // Value injected by FXMLLoader
    
	private BodyMassIndexModel model;

	public void setModel(BodyMassIndexModel model) {
		this.model = model;
	}

	   @FXML
	    void calcolaBMI(ActionEvent event) {
		    double weight =Double.parseDouble(txtPeso.getText());
	    	double height =Double.parseDouble(txtAltezza.getText());
	    	double myDouble = model.getBMI(height/100, weight);
	    	Integer integer = Integer.valueOf((int) Math.round(myDouble));
	       	risultatoNumerico.setText(Integer.toString(integer));
	       	descrizioneBMI.setText(model.getBMIDes(integer));
	    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtPeso != null : "fx:id=\"txtPeso\" was not injected: check your FXML file 'BodyMassIndex.fxml'.";
        assert descrizioneBMI != null : "fx:id=\"descrizioneBMI\" was not injected: check your FXML file 'BodyMassIndex.fxml'.";
        assert txtAltezza != null : "fx:id=\"txtAltezza\" was not injected: check your FXML file 'BodyMassIndex.fxml'.";
        assert risultatoNumerico != null : "fx:id=\"risultatoNumerico\" was not injected: check your FXML file 'BodyMassIndex.fxml'.";
        assert BMI != null : "fx:id=\"BMI\" was not injected: check your FXML file 'BodyMassIndex.fxml'.";

    }
}
