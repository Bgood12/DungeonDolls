package Dolls;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

import java.io.File;

public class Doll {

    String name;
    UIPanel select;
    VBox emotePanel;
    int jumpDist = 10;
    int moveSpeed = 240;


    public Doll(String name, UIPanel select) {
        this.name = name;
        this.select = select;
        this.emotePanel = new VBox();
        init();
    }

    private void init() {
        String path = System.getProperty("user.dir");
        File[] emotes = new File(path + "/assets/" + name).listFiles();

        for (int i  = 0; i<emotes.length; i++) { //Iterates through the list of characters
            int emoteStart = emotes[i].toString().lastIndexOf('\\');
            String emote = emotes[i].toString().substring(emoteStart + 1); //get a characters name
            Button but = new Button(emote); //Create a button for each character
            but.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    //TODO set on action
                    //TODO put image in showPanel
                }
            });

            emotePanel.getChildren().add(but);
        }
    }

    public void setActive() {
        select.getPanel().getChildren().add(emotePanel);
    }

    public void exit() {
        select.getPanel().getChildren().remove(emotePanel);
        //TODO remove image from showpanel
    }
}
