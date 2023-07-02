import javax.swing.*;
import java.io.File;

/**
 * Class for FileChooser in Java GUI
 */
public class FileChooser {

    /**
     * method for creating fileChooser window method
     */
    public void fileChooser() {
        JFrame jFrame = new JFrame("FileChooser Demo");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton openButton = new JButton("Open");
        openButton.addActionListener(actionEvent -> {
            // Create a file chooser
            JFileChooser jFileChooser = new JFileChooser();

            // Show the open file dialog
            int result = jFileChooser.showOpenDialog(jFrame);

            // If the user selects a file
            if (result == JFileChooser.APPROVE_OPTION) {
                // Get the selected file
                File file = jFileChooser.getSelectedFile();

                // Display the file name
                System.out.println("Selected file: " + file.getName());
            }
        });

        JPanel jPanel = new JPanel();
        jPanel.add(openButton);

        jFrame.add(jPanel);
        jFrame.pack();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
