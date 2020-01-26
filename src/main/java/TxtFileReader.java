import java.io.File;
import java.util.Scanner;

public class TxtFileReader {

    public static String read(String filepath) {
        String characters = "";
        try {
            File file = new File(filepath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                characters = characters + scanner.nextLine();
            }

            scanner.close();
        } catch (Exception e) {
            characters = null;
            e.printStackTrace();
        }
        return characters;
    }
}
