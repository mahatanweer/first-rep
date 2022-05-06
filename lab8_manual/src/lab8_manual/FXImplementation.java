package lab8_manual;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXImplementation extends Application{

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		Label l = new Label();
		Label l2 = new Label();
		Label l3 = new Label();

		l.setText("Enter your name: ");
		TextField t = new TextField();
		Button b = new Button("Click Here!");
		b.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) { 
				l2.setText("Hello, " + t.getText() + "! \nWelcome to the application! :)");
			}
			
		});
//		HBox h = new HBox();
//		h.getChildren().addAll(l,t,b,l2);
//		Scene sc = new Scene(h);
		
		ToggleGroup g = new ToggleGroup();
		RadioButton r = new RadioButton("Pizza");
		RadioButton r2 = new RadioButton("Lasagne");
		RadioButton r3 = new RadioButton("Burger");
		Button b2 = new Button("SUBMIT");
		r.setToggleGroup(g);
		r2.setToggleGroup(g);
		r3.setToggleGroup(g);
		
		b2.setOnAction(new EventHandler<ActionEvent> () {

			@Override
			public void handle(ActionEvent arg0) {
				if(r.isSelected()) {
					l3.setText("Your favourite food is " + r.getText()+ "\n\nGood to know!");
				}
				else if(r2.isSelected()) {
					l3.setText("Your favourite food is " + r2.getText());
				}
				else if(r3.isSelected()) {
					l3.setText("Your favourite food is " + r3.getText());
				}				
			}
			
			
		});

		
		
		VBox v = new VBox();
		v.getChildren().addAll(l,t,b,l2,r,r2,r3,b2,l3);
		Scene sc = new Scene(v);
		
		
		
		
		stage.setScene(sc);
		stage.setTitle("First jAVAFX Application");
		stage.setWidth(500);
		stage.setHeight(500);
		stage.show();


	}

}
