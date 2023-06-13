package sudoku;

import javafx.application.Application;
import javafx.stage.Stage;
import sudoku.userInterface.IUserInterfaceContract;
import sudoku.userInterface.UserInterfaceImpl;

import java.io.IOException;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;

    @Override
    public void start(Stage primaryStage) throws Exception, IOException {
        uiImpl = new UserInterfaceImpl(primaryStage);
        System.out.println("SudokuBuildLogic.build(uiImpl);" );
    }


    public static void main(String[] args) {
        launch(args);
    }
}