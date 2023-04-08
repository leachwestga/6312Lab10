package application;

import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.collections.ObservableList;

/**
 *  Lab 10
 * 
 * @author David Leach
 * @version 04.08.2023
 *
 */
public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Lab10 CS6312 David Leach");

		// Set size of stage / window
		Rectangle2D monitorSize = Screen.getPrimary().getVisualBounds();
		primaryStage.setWidth(monitorSize.getWidth() * 0.5);
		primaryStage.setHeight(monitorSize.getHeight());

		// Border
		GridPane pane = new GridPane();
		pane.setStyle("-fx-border-color: green; -fx-border-width:20");
		pane.setPadding(new Insets(40));
		pane.setHgap(10);
		pane.setVgap(10);
		// Name Text
		Text nameText = new Text(40, 40, "David Leach");
		nameText.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 40));
		pane.add(nameText, 1, 0);

		// Rectangle
		Rectangle r1 = new Rectangle(40, 50);
		r1.setStroke(Color.BLUE);
		r1.setFill(Color.BLACK);
		r1.setStrokeWidth(3);
		pane.add(r1, 1, 1);

		// Circle
		Circle blueCircle = new Circle();
		blueCircle.setRadius(40);
		blueCircle.setStroke(Color.BLUE);
		blueCircle.setFill(Color.BLUE);
		pane.add(blueCircle, 2, 1);

		// Triangle
		Polygon triangle = new Polygon();
		ObservableList<Double> pointList = triangle.getPoints();
		double sideLength = 100;
		pointList.add(0.0);
		pointList.add(sideLength * Math.sqrt(3) / 2);
		pointList.add(sideLength);
		pointList.add(sideLength * Math.sqrt(3) / 2);
		pointList.add(sideLength / 2);
		pointList.add(0.0);
		triangle.setStroke(Color.BLUE);
		pane.add(triangle, 1, 2);

		// Drawing CS6312
		FlowPane cs6312Pane = new FlowPane();
		cs6312Pane.setHgap(5);

		int[] cPoints = { 1, 0, 0, 0, 0, 2, 1, 2 };
		Polyline letterC = this.generatePoly(cPoints);
		cs6312Pane.getChildren().add(letterC);

		int[] sPoints = { 1, 0, 0, 0, 0, 1, 1, 1, 1, 2, 0, 2 };
		Polyline letterS = this.generatePoly(sPoints);
		cs6312Pane.getChildren().add(letterS);

		int[] digit6Points = { 1, 0, 0, 0, 0, 2, 1, 2, 1, 1, 0, 1 };
		Polyline digit6 = this.generatePoly(digit6Points);
		cs6312Pane.getChildren().add(digit6);

		int[] digit3Points = { 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 2, 0, 2 };
		Polyline digit3 = this.generatePoly(digit3Points);
		cs6312Pane.getChildren().add(digit3);

		int[] digit1Points = { 1, 0, 1, 2 };
		Polyline digit1 = this.generatePoly(digit1Points);
		cs6312Pane.getChildren().add(digit1);

		int[] digit2Points = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 2, 1, 2 };
		Polyline digit2 = this.generatePoly(digit2Points);
		cs6312Pane.getChildren().add(digit2);

		pane.add(cs6312Pane, 2, 2);

		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	/**
	 * entry to the program
	 * @param args not used
	 */
	public static void main(String[] args) {
		launch(args);
	}

	
	/**
	 * Helper method that returns a polyline based on an array of ints
	 * @param list of ints
	 * @return a polyline 
	 */
	public Polyline generatePoly(int[] list) {
		Polyline letter = new Polyline();
		ObservableList<Double> pointListC = letter.getPoints();
		double pixel = 10.0;
		for (int i = 0; i < list.length; i++) {
			pointListC.add(pixel * list[i]);
		}
		letter.setStrokeWidth(3);
		letter.setStroke(Color.BLACK);
		letter.setFill(new Color(0, 0, 0, 0));

		return letter;

	}
}
