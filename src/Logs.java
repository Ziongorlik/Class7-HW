import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logs {
    public static final String FILE_NAME = "log.txt";
    private static Logs instance = null;

    public Logs() {
    }

    public static Logs getInstance(){
        if (instance == null){
            instance = new Logs();
        }
        return instance;
    }

    public void writeToFile(String text){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME,true))){
            writer.write(text+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
