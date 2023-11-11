import java.io.FileNotFoundException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("myfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        throw new FileNotFoundException("File not found: " + filename);
    }
}
