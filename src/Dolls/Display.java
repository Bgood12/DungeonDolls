package Dolls;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import static javafx.application.Application.launch;

public class Display extends Application {

    /**
     * The start method of the application, begins a cascade effect of initializations
     * for the user.
     * @param primaryStage The stage the dolls will perform on
     */
    public void start (Stage primaryStage) {
        BorderPane root = new BorderPane();
        UIPanel uiPanel = new UIPanel();
        ShowPanel showPanel = new ShowPanel();

        root.setBottom(uiPanel.getPanel()); //Set locations for ui and show to appear
        root.setCenter(showPanel.getPanel());

        Scene scene = new Scene(root, 1280, 720);

        primaryStage.setScene(scene);
        primaryStage.setTitle("DungeonDolls");
        primaryStage.show();
    }

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
