import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ShowPanel extends Pane {

    HBox panel;

    public ShowPanel() {
        this.panel = new HBox();
        init();
    }

    private void init() {

    }

    public HBox getPanel() {
        return panel;
    }
}
