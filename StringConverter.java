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

        String outputString = "";

        String[] inputArray = input.split("");
        // write each letter to the output file
        for (int i = 0; i < inputArray.length; i++) {

            String convertedLetter = HebrewToPhoenicianMap.hebrewToPhoenicianMap.get(inputArray[i]);

            // If[i] letter is a Hebrew letter, then the corresponding Phoenician letter
            // will be written to the output.
            if (convertedLetter != null) {
                outputString += convertedLetter;
            } else if (inputArray[i] == " ") {

                if (HebrewToPhoenicianMap.hebrewToPhoenicianMap.get(inputArray[i - 1]) != null
                        && HebrewToPhoenicianMap.hebrewToPhoenicianMap.get(inputArray[i + 1]) != null) {
                    outputString += HebrewToPhoenicianMap.phoenicianWordSeparator;
                } else {
                    outputString += " ";
                }
            } else {
              outputString += inputArray[i];
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