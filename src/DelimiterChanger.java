import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DelimiterChanger {

    char oldDelimiter = ',';
    char newDelimiter = ';';

    Path file = Paths.get("D:\\Tardigrada\\Documents\\code\\csvDelimiterChanger\\csvFiles\\oldDelimiter\\07Aug23_orbix.csv");

    public void createNewFile() throws IOException {
        FileWriter fileWriter = new FileWriter("07Aug23_orbix_copy_delimiter.csv");
        Files.lines(file)
                .map(i -> i.replace(oldDelimiter, newDelimiter))
                .forEach(i -> {
                    try {
                        fileWriter.write(i);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        fileWriter.close();
    }

}
