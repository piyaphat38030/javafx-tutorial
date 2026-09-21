import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** A minimal JavaFX window. */
public class Main extends Application {
    @Override
    public void start(Stage stage) {
        ScrollPane scrollPane = new ScrollPane(new VBox());
        TextField userInput = new TextField();
        Button sendButton = new Button("Send");
        AnchorPane layout = new AnchorPane(scrollPane, userInput, sendButton);
        AnchorPane.setTopAnchor(scrollPane, 0.0);
        AnchorPane.setBottomAnchor(scrollPane, 42.0);
        AnchorPane.setLeftAnchor(scrollPane, 0.0);
        AnchorPane.setRightAnchor(scrollPane, 0.0);
        AnchorPane.setBottomAnchor(userInput, 0.0);
        AnchorPane.setLeftAnchor(userInput, 0.0);
        AnchorPane.setRightAnchor(userInput, 76.0);
        AnchorPane.setBottomAnchor(sendButton, 0.0);
        AnchorPane.setRightAnchor(sendButton, 0.0);
        stage.setTitle("Duke");
        stage.setScene(new Scene(layout, 400, 600));
        stage.show();
    }
}
