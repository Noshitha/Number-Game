import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGameSwing extends JFrame {
    private int number = 0;
    private int step = 0;
    private JButton yesButton;
    private JButton noButton;
    private JTextArea instructionsArea;
    private JTextArea setArea;
    
    // List of sets corresponding to each binary digit (0-4 for 0-31 range)
    private final String[] sets = {
        "1     3     5     7\n9    11    13    15\n17    19    21    23\n25    27    29    31",
        "2     3     6     7\n10    11    14    15\n18    19    22    23\n26    27    30    31",
        "4     5     6     7\n12    13    14    15\n20    21    22    23\n28    29    30    31",
        "8     9     10     11\n12    13    14    15\n24    25    26    27\n28    29    30    31",
        "16    17    18    19\n20    21    22    23\n24    25    26    27\n28    29    30    31"
    };

    public NumberGameSwing() {
        // Setup the frame
        setTitle("Number Guessing Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Instruction area at the top
        instructionsArea = new JTextArea("Think of any number from 0 to 31.\nDoes your number appear in the set below?");
        instructionsArea.setEditable(false);
        add(instructionsArea, BorderLayout.NORTH);

        // Set area in the center to display sets of numbers
        setArea = new JTextArea(sets[step]);
        setArea.setEditable(false);
        add(setArea, BorderLayout.CENTER);

        // Button panel at the bottom
        JPanel buttonPanel = new JPanel();
        yesButton = new JButton("Yes");
        noButton = new JButton("No");
        buttonPanel.add(yesButton);
        buttonPanel.add(noButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners for the buttons
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAnswer(true);
            }
        });

        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onAnswer(false);
            }
        });
    }

    private void onAnswer(boolean existsInSet) {
        if (existsInSet) {
            number += Math.pow(2, step); // Add the corresponding value to the number
        }

        step++;

        if (step < sets.length) {
            setArea.setText(sets[step]); // Display the next set
        } else {
            displayResult(); // Game is finished
        }
    }

    private void displayResult() {
        // Show the result
        instructionsArea.setText("The number you selected is: " + number);
        setArea.setText(""); // Clear the set display
        yesButton.setEnabled(false); // Disable buttons
        noButton.setEnabled(false);
    }

    public static void main(String[] args) {
        // Run the GUI
        SwingUtilities.invokeLater(() -> {
            NumberGameSwing game = new NumberGameSwing();
            game.setVisible(true);
        });
    }
}
