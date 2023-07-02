import java.util.Scanner;

/**
 * Main class
 */
public class Main {
//  private static void createAndShowGUI() {
//    JFrame jFrame = new JFrame("Hello World Swing Example");
//    jFrame.setLayout(new FlowLayout());
//    jFrame.setSize(500, 360);
//    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    JLabel label = new JLabel("Hello World Swing");
//    Border border = BorderFactory.createLineBorder(Color.BLACK);
//    label.setBorder(border);
//    label.setPreferredSize(new Dimension(150, 100));
//
//    label.setText("Hello World Swing");
//    label.setHorizontalAlignment(JLabel.CENTER);
//    label.setVerticalAlignment(JLabel.CENTER);
//
//    jFrame.add(label);
//    jFrame.setVisible(true);
//  }

    /**
     * main method for running Java code at launch
     *
     * @param args String array args for main method
     */
    public static void main(String[] args) {

//    createAndShowGUI();

        // instantiate the class TextFileParser
        TextFileParser textFileParser = new TextFileParser();

        textFileParser.textFileParser("input.txt", "output.txt");

        StringConverter stringConverter = new StringConverter();

        System.out.println("Enter Hebrew text:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHebrew Text in Phoenician alphabet:\n" + stringConverter.convertHebrewToPhoenician(scanner.nextLine()));
        scanner.close();
    }
}
