/*
 * Filename: Main.java
 * Original Creator: Dorian Brandusa
 * Date Created: 12/15/2022
 * Last Updated: 03/20/2023
 * Version: v1
 */

package rms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.Objects;

// import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/rms/App.fxml")));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("application.css")).toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    // add two numbers
    public int addNumber(int a, int b) {
        return a+b;
    }

    // break up long text
    public static class StringProcessor {

        private static final int WORD_MAX_LENGTH = 40;

        public static boolean stringLengthIsSafe(CharSequence input){
            return input.length() <= WORD_MAX_LENGTH;
        }

    }

    public class Thing { }
}