import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.File;

public class UIPanel extends Pane {


    HBox panel;

    public UIPanel() {
        this.panel = new HBox();
        init();
    }

    private void init() {
        String path = System.getProperty("user.dir");
        File[] chars = new File(path + "/assets").listFiles();
        VBox charPanel = new VBox();
        for (int i  = 0; i<chars.length; i++) {
            int nameStart = chars[i].toString().lastIndexOf('\\');
            String name = chars[i].toString().substring(nameStart + 1);
            Button but = new Button(name);
            //TODO set on action
            charPanel.getChildren().add(but);
            //TODO make doll
        }
        charPanel.toString();
        panel.getChildren().add(charPanel);

    }

    public HBox getPanel() {
        return panel;
    }
}
