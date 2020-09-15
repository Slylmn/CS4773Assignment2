package cs4743.Assign2.Controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class GameController implements Initializable{

	//play game
	
	    @FXML
	    private TextArea gameOutput;

	    @FXML
	    private Button playWar;

	   // private War war;  john needs to code this class

	   /* public GameController(War war) {
	        this.war = war;
	    }
	    */

	    @FXML
	    void playWar(ActionEvent event) {
	        // TODO: play a game of War (i.e., until someone wins or there is a tie)
	    }
	
	
	
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}

}
