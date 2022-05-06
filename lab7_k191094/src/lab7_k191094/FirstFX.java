package lab7_k191094;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FirstFX extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		//create controls
		Button b1 = new Button("Click Me!");
		Button b2 = new Button("Click Me Again!");
		Button b3 = new Button("Click Here!");

		//create layout abject
		HBox h = new HBox();
		h.getChildren().add(b1);
		h.getChildren().add(b2);
		Scene sc = new Scene(h);
		stage.setScene(sc);
		stage.setHeight(500);
		stage.setWidth(500);
		stage.setTitle("Maha's App");
		stage.setFullScreen(true);
		stage.show();
		
		
		VBox v = new VBox();
		v.getChildren().add(b1);
		v.getChildren().add(b2);
		Scene sc1 = new Scene(v);
		stage.setScene(sc1);
		v.setSpacing(20);

		
		GridPane g = new GridPane();
		//g.setGridLinesVisible(true);
		g.setHgap(20);
		g.setVgap(20);
		g.add(b1,0,0);
		g.add(b2,1,1);
		g.add(b3, 2, 2);
		Scene sc2 = new Scene(g);
		stage.setScene(sc2);
		stage.setHeight(300);
		stage.setWidth(300);

		BorderPane b = new BorderPane();
		b.setBottom(b1);
		b.setCenter(b2);
		b.setTop(b3);
		Scene sc3 = new Scene(b);
		stage.setScene(sc3);

		
		FlowPane f = new FlowPane();
		f.getChildren().add(b1);
		f.getChildren().add(b2);
		Scene sc4 = new Scene(f);
		stage.setScene(sc4);
		
		
		StackPane s = new StackPane();
		s.getChildren().addAll(b1,b2);
		s.getChildren().add(b3);
		Scene sc5 = new Scene(s);
		stage.setScene(sc5);

	}
	

}
