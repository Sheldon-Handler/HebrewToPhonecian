public class StringConverter {

    private String inputString;
    private String outputString;

    public StringConverter() {
    }

    public StringConverter(String inputString, String outputString) {
        this.inputString = inputString;
        this.outputString = outputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getOutputString() {
        return outputString;
    }

    public void setOutputString(String outputString) {
        this.outputString = outputString;
    }
}