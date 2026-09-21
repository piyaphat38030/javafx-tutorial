import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/** A minimal JavaFX window. */
public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setScene(new Scene(new Label("Hello World!")));
        stage.show();
    }
}
