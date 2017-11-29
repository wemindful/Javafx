package application;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(this.getClass().getResource("MainFrame.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			/*
			 * 这里注意加上 #字
			 * 这种方式的优先级>在fxml 或者说其他地方写控制器的方式的
			 */
			Label lab =(Label) root.lookup("#lab");
			Button btn =(Button) root.lookup("#btn");
			btn.setOnAction((e)->{
				lab.setText("click");
			});

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
