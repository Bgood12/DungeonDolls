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

    /**
     * The method responsible for initializing the character panel in the UI
     */
    private void init() {
        String path = System.getProperty("user.dir"); //Gets the file path
        File[] chars = new File(path + "/assets").listFiles();
        VBox charPanel = new VBox(); //The structure that character names will exist in
        for (int i  = 0; i<chars.length; i++) { //Iterates through the list of characters
            int nameStart = chars[i].toString().lastIndexOf('\\');
            String name = chars[i].toString().substring(nameStart + 1); //get a characters name
            Button but = new Button(name); //Create a button for each character
            //TODO set on action
            charPanel.getChildren().add(but);
            //TODO make doll
        }
        charPanel.toString();
        panel.getChildren().add(charPanel);

    }

    /**
     * Getter method for the UIPanel
     * @return The UIPanel
     */
    public HBox getPanel() {
        return panel;
    }
}
