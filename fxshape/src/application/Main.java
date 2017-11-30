package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class Main extends Application {

	private BorderPane root;

	@Override
	public void start(Stage primaryStage) {
		try {
			root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//initDrawLine();
			//initDrawRectangle();
			initdarwfont();
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * font
	 */
	private void initdarwfont() {
		Text text = new Text();
		text.setX(150);
		text.setY(200);
		text.setFont(new Font(20));
		text.setWrappingWidth(200);
		text.setTextAlignment(TextAlignment.JUSTIFY);
		text.setText("The quick brown fox jumps over the lazy dog");
		root.getChildren().add(text);
	}


	/*
	 * æÿ–Œ
	 */
	private void initDrawRectangle() {
		 Rectangle rectangle = new Rectangle(160, 90, Color.BLACK);
		 rectangle.setX(150);
		 rectangle.setY(200);
		 //…Ë÷√±ﬂΩ«‘≤ _> Õ÷‘≤
		 rectangle.setArcWidth(160);
		 rectangle.setArcHeight(90);
		 root.getChildren().add(rectangle);
	}

	/**
	 * ª≠œﬂapi
	 */
	private void initDrawLine() {
			Line line = new Line(0, 0, 350, 350);
			line.setStroke(Color.GREEN);
			line.setStrokeWidth(50);
			line.setStrokeDashOffset(100);
			line.setStrokeLineCap(StrokeLineCap.ROUND);
			line.setSmooth(true);
			root.getChildren().add(line);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
