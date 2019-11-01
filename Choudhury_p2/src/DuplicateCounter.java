import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class DuplicateCounter {

    // Using a Map of Strings to count occurrence of words
    private static int wordCounter;

    private static Map<String, Integer>  counter;

    public DuplicateCounter() {
        this.counter = new HashMap<String, Integer>();
    }

    // Method to count the occurrences of words in the input file
    public void count(String dataFile) throws FileNotFoundException{

        Scanner scnr = new Scanner(new File(dataFile));

        String word;
        Integer count;

        // While loop that iterates through each lines of text within the file until there are no more
        while (scnr.hasNext()) {
            word = scnr.next(); // Scans the word
            count = counter.get(word);
            wordCounter++; // Increment the counter

            if(count != null) {
                count = count + 1;
            }

            else {
                count = 1;
            }

            counter.put(word, count); // Place count for each word
        }

    }

    // Method to write the set of unique words to an output file named unique_words.txt
    public void write(String outputFile) throws IOException {

        File wordCount;

        wordCount = new File(outputFile);

        // Create the outputFile

        wordCount.createNewFile();

        FileWriter fileW = new FileWriter(wordCount);

        fileW.write("Below are the words and counts from problem2.txt\n");
        for(Map.Entry<String, Integer> entry : counter.entrySet()) {
            fileW.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        System.out.println("The words and their count have been written to a separate text file.");
        fileW.close();
    }

}
