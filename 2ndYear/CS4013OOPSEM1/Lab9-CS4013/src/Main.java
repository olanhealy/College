import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }


    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Group root = new Group();
        TextField tf = new TextField("time to be displayed here");
        Scene scene = new Scene(root, 300, 100);
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button zero = new Button("0");
        Button start = new Button("Start");
        Button stop = new Button("Stop");
        two.setLayoutX(50);
        two.setLayoutY(0);
        three.setLayoutX(100);
        three.setLayoutY(0);
        four.setLayoutX(0);
        four.setLayoutY(25);
        five.setLayoutX(50);
        five.setLayoutY(25);
        six.setLayoutX(100);
        six.setLayoutY(25);
        seven.setLayoutX(0);
        seven.setLayoutY(50);
        eight.setLayoutX(50);
        eight.setLayoutY(50);
        nine.setLayoutX(100);
        nine.setLayoutY(50);
        zero.setLayoutX(0);
        zero.setLayoutY(75);
        start.setLayoutX(50);
        start.setLayoutY(75);
        stop.setLayoutX(100);
        stop.setLayoutY(75);
        one.setMinHeight(25);
        one.setMinWidth(50);
        two.setMinHeight(25);
        two.setMinWidth(50);
        three.setMinHeight(25);
        three.setMinWidth(50);
        four.setMinHeight(25);
        four.setMinWidth(50);
        five.setMinHeight(25);
        five.setMinWidth(50);
        six.setMinHeight(25);
        six.setMinWidth(50);
        seven.setMinHeight(25);
        seven.setMinWidth(50);
        eight.setMinHeight(25);
        eight.setMinWidth(50);
        nine.setMinHeight(25);
        nine.setMinWidth(50);
        zero.setMinHeight(25);
        zero.setMinWidth(50);
        start.setMinHeight(25);
        start.setMinWidth(50);
        stop.setMinHeight(25);
        stop.setMinWidth(50);

        root.getChildren().addAll(one, two, three, four, five, six, seven, eight, nine, zero, start, stop);


       one.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent actionEvent) {


           }
         });
        primaryStage.setTitle("Lab9-CS4013"); // Set the stage title
        primaryStage.setScene(scene);// Place the scene in the stage
        primaryStage.show();

// I didn't look much at javaFX as was quite overwhelmed with workload this semester


    }

}




