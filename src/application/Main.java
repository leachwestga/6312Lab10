package application;

import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.Border;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.collections.ObservableList;

import javafx.stage.Screen;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Lab10 CS6312");

		// Set size of stage / window
		Rectangle2D monitorSize = Screen.getPrimary().getVisualBounds();
		primaryStage.setWidth(monitorSize.getWidth() * 0.5);
		primaryStage.setHeight(monitorSize.getHeight());

		// Border
		Pane pane = new FlowPane();
		pane.setStyle("-fx-border-color: green; -fx-border-width:20");

		// Name Text
		Text nameText = new Text(40, 40, "David Leach");
		nameText.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 40));
		pane.getChildren().add(nameText);
		
		// Rectangle
		Rectangle r1 = new Rectangle(40, 50);
		r1.setStroke(Color.BLUE);
		r1.setFill(Color.BLACK);
		r1.setStrokeWidth(3);
		pane.getChildren().add(r1);
		
		
		// Circle
		Circle blueCircle = new Circle();
		blueCircle.setRadius(40);
		blueCircle.setStroke(Color.BLUE);
		blueCircle.setFill(Color.BLUE);
		pane.getChildren().add(blueCircle);
		
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
		pane.getChildren().add(triangle);
		
		
		// Drawing CS6312
		
		double pixel = 20.0;
		
		
//		int[] cPoints = {0,0,3,0,3,1,1,1,1,3,3,3,3,4,0,4};
		int[] cPoints = {0,0, 4,0, 4,1, 1,1, 1,4, 4,4, 4,5, 0,5};
		Polygon letterC = generatePoly(cPoints);
		pane.getChildren().add(letterC);

		int[] sPoints = {0,0, 4,0, 4,1, 1,1, 1,2, 4,2, 4,5, 0,5, 0,4, 3,4, 3,3, 0,3};
		Polygon letterS = generatePoly(sPoints);
		pane.getChildren().add(letterS);

		int[] digit6Points = {0,0, 1,0, 1,2, 3,2, 3,5, 0,5, 0,4, 2,4, 2,3, 2,2,  2,3,  0,3, 0,2};
		Polygon digit6 = generatePoly(digit6Points);
		pane.getChildren().add(digit6);

		int[] digit3Points = {0,0, 3,0, 3,5, 0,5, 0,4, 2,4, 2,3, 1,3, 1,2, 2,2, 2,1, 0,1 };
		Polygon digit3 = generatePoly(digit3Points);
		pane.getChildren().add(digit3);
		
		int[] digit1Points = {1,0, 2,0, 2,5, 1,5 };
		Polygon digit1 = generatePoly(digit1Points);
		pane.getChildren().add(digit1);
		
		int[] digit2Points = { };
		Polygon digit2 = generatePoly(digit2Points);
		pane.getChildren().add(digit2);
		
		
		
		
		
//	Rectangle borderLine = new Rectangle(primaryStage.getWidth(), primaryStage.getHeight());
//	borderLine.setStroke(Color.ORANGE);
//	borderLine.setFill(new Color(1,1,1,0));
//	int borderWidth = 10;
//	borderLine.setStrokeWidth(borderWidth);
//	borderLine.widthProperty().bind(primaryStage.widthProperty().subtract(borderWidth));	
//	borderLine.heightProperty().bind(primaryStage.heightProperty().subtract(borderWidth));	
//	pane.getChildren().add(borderLine);

//		Circle circle = new Circle();
//	circle.centerXProperty().bind(pane.widthProperty().multiply(.5));
//	circle.centerYProperty().bind(pane.heightProperty().multiply(.5));
//	circle.radiusProperty().bind(pane.heightProperty().multiply(.35));
////	circle.setRadius(50);
//	circle.setStroke(Color.BLACK);
//	circle.setFill(Color.GREEN);
//	pane.getChildren().add(circle);
//	
//	Rectangle r1 = new Rectangle(40,50);
//	Rectangle r2 = new Rectangle(100,250);
//
//	r1.setStroke(Color.BLUE);
//	r1.setFill(Color.BLACK);
//	r1.setStrokeWidth(10);
//	r1.setRotate(45);
//	pane.getChildren().add(r1);
//
//	r2.setStroke(Color.BLUE);
//	r2.setFill(new Color(0,.7,.2,1));
//	r2.setStrokeWidth(10);
//	pane.getChildren().add(r2);

		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}



	public Polygon generatePoly(int[] list) {
		Polygon letter = new Polygon();
		ObservableList<Double> pointListC = letter.getPoints();
		double pixel = 20.0;
		for (int i=0; i<list.length; i++) {
			pointListC.add(pixel * list[i]);
		}
		letter.setStroke(Color.BLACK);
		letter.setFill(Color.BLACK);
		
		return letter;
		
		
		
	}
}

