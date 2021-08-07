import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainApp {

    public static void main(String[] args) throws IOException {
        String filePath = "D:/";
        File file = new File(filePath, "test.txt");
        FileWriter myWriter = new FileWriter(file);
        myWriter.write("Files but it is fun enough! Yes it is always hard to work on complex queries :(");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");

        System.out.println(String.format("Creating folder %s...", file.getParentFile().getAbsolutePath()));
    }
}
