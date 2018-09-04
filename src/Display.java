import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import static javafx.application.Application.launch;

public class Display extends Application {

    HBox showPanel;
    HBox uiPanel;

    public void start (Stage primaryStage) {
        VBox root = new VBox();
        UIPanel uiPanel = new UIPanel();
        ShowPanel showPanel = new ShowPanel();
        root.getChildren().addAll(showPanel.getPanel(), uiPanel.getPanel());
        Scene scene = new Scene(root, 1280, 720);

        primaryStage.setScene(scene);
        primaryStage.setTitle("DungeonDolls");
        primaryStage.show();
    }

    public void setUiPanel(HBox uiPanel) {
        this.uiPanel = uiPanel;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
