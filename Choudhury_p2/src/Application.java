import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main (String[] args) throws IOException{

        DuplicateCounter dupeCount = new DuplicateCounter();
        // Counts the words and displays the count
        dupeCount.count("problem2.txt");

        // Write it into new file
        dupeCount.write("unique_words_counts.txt");
    }
}

