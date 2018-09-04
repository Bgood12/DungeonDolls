import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

import java.io.File;

public class Doll {

    String name;
    UIPanel select;
    int jumpDist = 10;
    int moveSpeed = 240;


    public Doll(String name, UIPanel select) {
        this.name = name;
        this.select = select;
    }

    public void init() {
        String path = System.getProperty("user.dir");
        File[] emotes = new File(path + "/assets/" + name).listFiles();
        VBox emotePanel = new VBox();
        for (int i  = 0; i<emotes.length; i++) { //Iterates through the list of characters
            int emoteStart = emotes[i].toString().lastIndexOf('\\');
            String emote = emotes[i].toString().substring(emoteStart + 1); //get a characters name
            Button but = new Button(emote); //Create a button for each character
            //TODO set on action
            but.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {

                }
            });
            emotePanel.getChildren().add(but);
        }
        select.getPanel().getChildren().add(emotePanel);

    }

    public void exit() {
        //TODO remove doll menu from UIPanel
    }
}
