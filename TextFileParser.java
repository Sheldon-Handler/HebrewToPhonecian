import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileParser {

  // Default constructor
  public TextFileParser() {
  }

  public void textFileParser(String inputFilePath, String outputFilePath) {

    try {
      // create the input and output file readers and writers
      FileReader inputFileReader = new FileReader(inputFilePath);
      FileWriter outputFileWriter = new FileWriter(outputFilePath);

      // create the buffered reader for the input file
      BufferedReader bufferedReader = new BufferedReader(inputFileReader);

      // read the input file line by line
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        // split each line into individual letters
        String[] letters = line.split("");

        // write each letter to the output file
        for (int i = 0; i < letters.length; i++) {

          // If[i] letter is a Hebrew letter, then the corresponding Phoenician letter
          // will be written to the output.
          if (HebrewToPhoenicianMap.hebrewToPhoenicianMap(letters[i]) != null) {
            outputFileWriter.write(HebrewToPhoenicianMap.hebrewToPhoenicianMap(letters[i]));
          }
          // If letter[i] is not a Hebrew letter, letter[i] will be directly written to
          // output file without any conversion.
          else {
            outputFileWriter.write(letters[i]);
          }

        }

        // Creates new line to separate current line from the next line.
        outputFileWriter.write("\n");
      }

      // close the readers and writers
      inputFileReader.close();
      outputFileWriter.close();

      System.out.println("File parsing and copying successful.");
    } catch (IOException e) {
      System.out.println("An error occurred while parsing or copying the file: " + e.getMessage());
    }
  }
}
