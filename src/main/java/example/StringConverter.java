package example;

public class StringConverter {

    private String inputString;

    public StringConverter() {
    }

    public StringConverter(String inputString) {
        this.inputString = inputString;
    }

    public String convertHebrewToPhoenician(String input) {

        HebrewToPhoenicianMap hebrewToPhoenicianMap = new HebrewToPhoenicianMap();
        String outputString = "";

        String[] inputArray = input.split("");
        // write each letter to the output file
        for (int i = 0; i < inputArray.length; i++) {

            String convertedLetter = hebrewToPhoenicianMap.getHebrewToPhoenicianMap(inputArray[i]);

            // If[i] letter is a Hebrew letter, then the corresponding Phoenician letter
            // will be written to the output.
            if (convertedLetter != null) {
                outputString += convertedLetter;
            } else if (inputArray[i] == " ") {

                if (hebrewToPhoenicianMap.getHebrewToPhoenicianMap(inputArray[i - 1]) != null
                        && hebrewToPhoenicianMap.getHebrewToPhoenicianMap(inputArray[i + 1]) != null) {
                    outputString += hebrewToPhoenicianMap.getPhoenicianWordSeparator();
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