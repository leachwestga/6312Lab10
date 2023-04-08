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
import javafx.geometry.Rectangle2D;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;

import javafx.stage.Screen;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	primaryStage.setTitle("C3PO");

	Rectangle2D monitorSize= Screen.getPrimary().getVisualBounds();
	primaryStage.setWidth(monitorSize.getWidth() * 0.5);
	primaryStage.setHeight(monitorSize.getHeight());
	


	
	
	FlowPane pane = new FlowPane();

	pane.setStyle("-fx-border-color: green; -fx-border-width:20");	
	
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

	
	Scene scene  = new Scene(pane);
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	
	
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
