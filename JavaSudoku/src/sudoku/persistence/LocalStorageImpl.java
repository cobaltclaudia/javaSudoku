package sudoku.persistence;

import sudoku.problemDomain.IStorage;
import sudoku.problemDomain.SudokuGame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

public class LocalStorageImpl implements IStorage {
    private static final File GAME_DATA = new File(System.getProperty("user.home"), String.valueOf(LocalDateTime.now()));
    @Override
    public void updateGameData(SudokuGame game) throws IOException {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(GAME_DATA);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(game);
            objectOutputStream.close();
        }catch (IOException e){
            throw new IOException("Unable to access Game Data.");
        }

    }

    @Override
    public SudokuGame getGameData() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(GAME_DATA);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        try {
            SudokuGame gameState = (SudokuGame)  objectInputStream.readObject();
            objectInputStream.close();
            return gameState;
        }catch (ClassNotFoundException e ){
            throw new IOException("File not found.");
        }
    }
}
