package application;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class MainFrameController {
	@FXML
	private Button btn;
	@FXML
	private Label mLabel;

	// Event Listener on Button[#btn].onAction
	@FXML
	public void onButtonClick(ActionEvent event) {
		System.out.println("click");
		mLabel.setText("click");
	}
}
