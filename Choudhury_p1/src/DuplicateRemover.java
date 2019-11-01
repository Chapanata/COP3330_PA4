import java.util.*;
import java.io.*;

public class DuplicateRemover {

    // Using a set since sets do not read in duplicates, only unique lines
    private Set<String> uniqueWords;

    // Method to remove the duplicates from the text file. Since we are using Sets it will skip over duplicates no matter
    // what which makes the program easier
    public void remove(String dataFile) throws FileNotFoundException{
        String words;
        uniqueWords = new HashSet<String>();

        Scanner scnr = new Scanner(new File(dataFile));


            // While loop that iterates through each lines of text within the file until there are no more
            while (scnr.hasNext()) {
                words = scnr.next();
                uniqueWords.add(words);
            }
            scnr.close();
    }

    // Method to write the set of unique words to an output file named unique_words.txt
    public void write(String outputFile) throws IOException {
        File uniqueText;

        uniqueText = new File(outputFile);

        // Create the outputFile

        uniqueText.createNewFile();
        FileWriter fileW = new FileWriter(uniqueText);
        Iterator parseLine = uniqueWords.iterator();

        fileW.write("Here are the unique words from problem1.txt\n");
        // Write to new output file
        while(parseLine.hasNext()){
            String str = (String)parseLine.next();
            fileW.write(str + "\n");
        }

        fileW.close();
        System.out.println("The duplicated words from problem1.txt have been removed and the remaining unique words have been printed to the unique_words.txt file.");
    }

}
