package sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import sudoku.buildLogic.SudokuBuildLogic;
import sudoku.userInterface.IUserInterfaceContract;
import sudoku.userInterface.UserInterfaceImpl;

import java.io.IOException;

public class SudokuApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        IUserInterfaceContract.View uiImpl = new UserInterfaceImpl(primaryStage);
        try {
            SudokuBuildLogic.build(uiImpl);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}