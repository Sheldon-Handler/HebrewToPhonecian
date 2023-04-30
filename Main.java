/**
 * Main class
 */
public class Main {

  /**
   * main method for running Java code at launch
   *
   * @param args String array args for main method
   */
  public static void main(String[] args) {

    // instantiate the class TextFileParser
    TextFileParser textFileParser = new TextFileParser();

    textFileParser.textFileParser("input.txt", "output.txt");
  }
}
