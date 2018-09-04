import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.File;

public class UIPanel extends Pane {

    HBox panel;

    public UIPanel() {
        this.panel = new HBox();
        init();
    }

    private void init() {
        String test = System.getProperty("user.dir");
        File[] chars = new File(test + "/assets").listFiles();
        for (int i  = 0; i<chars.length; i++) {
            System.out.println(chars[i].toString());
        }
    }
}
