import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/** A minimal JavaFX window. */
public class Main extends Application {
    private final VBox dialogContainer = new VBox(8);
    private final TextField userInput = new TextField();
    private final Duke duke = new Duke();
    @Override
    public void start(Stage stage) {
        ScrollPane scrollPane = new ScrollPane(dialogContainer);
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
        sendButton.setOnAction(event -> handleUserInput());
        userInput.setOnAction(event -> handleUserInput());
        dialogContainer.heightProperty().addListener(observable -> scrollPane.setVvalue(1.0));
        stage.setTitle("Duke");
        stage.setScene(new Scene(layout, 400, 600));
        stage.show();
    }

    /** Adds the user's message and Duke's reply to the conversation. */
    private void handleUserInput() {
        String input = userInput.getText().trim();
        if (!input.isEmpty()) {
            dialogContainer.getChildren().addAll(new Label("You: " + input), new Label(duke.getResponse(input)));
            userInput.clear();
        }
    }
}
