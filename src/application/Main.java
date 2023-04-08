package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.BorderPane;


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
	

	Pane pane = new Pane();
	Circle circle = new Circle();
	circle.centerXProperty().bind(pane.widthProperty().multiply(.5));
	circle.centerYProperty().bind(pane.heightProperty().multiply(.5));
	circle.radiusProperty().bind(pane.heightProperty().multiply(.35));
//	circle.setRadius(50);
	circle.setStroke(Color.BLACK);
	circle.setFill(Color.GREEN);
	pane.getChildren().add(circle);
	Scene scene  = new Scene(pane,400,400);
	primaryStage.setScene(scene);
	primaryStage.show();
	
	
	
	
	
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
