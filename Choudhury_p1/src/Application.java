import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main (String[] args) throws IOException{

        DuplicateRemover dupeRemove = new DuplicateRemover();
        // Remove the duplicates and store into a set
        dupeRemove.remove("problem1.txt");

        // Write the set into a new file
        dupeRemove.write("unique_words.txt");
    }
}

