import java.util.stream.Stream;
import java.nio.file.*;
import java.io.IOException;

public class ListDir {
    public static void main(String[] args) {
        Path curdir = Paths.get(".");
        
        // Print all files in current directory.
        try (Stream<Path> files = Files.list(curdir)) {
            files.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
