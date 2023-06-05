import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StringConverter {

    private String inputString;

    public StringConverter() {
    }

    public StringConverter(String inputString) {
        this.inputString = inputString;
    }

    public String convertHebrewToPhoenician(String input) {

        String outputString;

        String[] inputArray = input.split("");
        // write each letter to the output file
        for (int i; i < inputArray.length; i++) {

            String convertedLetter = hebrewToPhoenicianMap(letter);

            // If[i] letter is a Hebrew letter, then the corresponding Phoenician letter
            // will be written to the output.
            if (convertedLetter != null && letter != " ") {
                outputString += convertedLetter;
            } else if (convertedLetter != null && letter == " ") {

                if (hebrewToPhoenicianMap(inputArray[i - 1]) != null
                        && hebrewToPhoenicianMap(inputArray[i + 1]) != null) {
                    outputString += hebrewToPhoenicianMap.getPhoenicianWordSeperator();
                } else {
                    outputString += " ";
                }
            }
        }

        return outputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }
}