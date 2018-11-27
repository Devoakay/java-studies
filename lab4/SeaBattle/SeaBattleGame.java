import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SeaBattleGame extends Application
{
    private static final String fxmlPath = "main.fxml";

    private static Stage stage;

    public static void main(String[] args) {
        // Start app
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        primaryStage.setTitle("SeaBattle");

        loadAppWindow();

        // Lock app window size
        primaryStage.setResizable(false);
        // Show app window
        primaryStage.show();
    }
    // Load app window
    public static void loadAppWindow()
    {
        // Create FXMLLoader
        FXMLLoader fxmlLoader = new FXMLLoader(SeaBattleGame.class.getResource(fxmlPath));
        try {
            // Create scene and load main app window to stage
            Scene scene = new Scene(fxmlLoader.load());
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
