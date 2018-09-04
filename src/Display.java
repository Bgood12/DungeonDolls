import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Display extends Application {

    public void start (Stage primaryStage) {
        VBox root = new VBox();
        ShowPanel showPanel = new ShowPanel();
        UIPanel uiPanel = new UIPanel();
        root.getChildren().addAll(showPanel, uiPanel);

        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setScene(scene);
        primaryStage.setTitle("DungeonDolls");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
