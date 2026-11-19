import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GoalieStatsCalculatorGUI extends JFrame {

    private JTextField shotsField;
    private JTextField goalsLetInField;
    private JLabel resultLabel;

    public GoalieStatsCalculatorGUI() {
        setTitle("Goalie Stats Calculator");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create components
        JLabel titleLabel = new JLabel("This is a Goalie Stats Calculator");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 18));

        JLabel shotsLabel = new JLabel("Please Enter How Many Shots The Goalie Faced:");
        shotsField = new JTextField(10);

        JLabel goalsLetInLabel = new JLabel("Please Enter How Many Goals Where Let In:");
        goalsLetInField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate Save Percentage");
        resultLabel = new JLabel("The Goalies Save Percentage Is: ");

        // Set up layout using GridBagLayout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Padding

        // Add components to the frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(titleLabel, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        add(shotsLabel, gbc);
        gbc.gridx = 1;
        add(shotsField, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        add(goalsLetInLabel, gbc);
        gbc.gridx = 1;
        add(goalsLetInField, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        add(calculateButton, gbc);

        gbc.gridy = 4;
        add(resultLabel, gbc);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSavePercentage();
            }
        });
    }

    private void calculateSavePercentage() {
        try {
            int shots = Integer.parseInt(shotsField.getText());
            int goalsLetIn = Integer.parseInt(goalsLetInField.getText());

            if (shots < 0 || goalsLetIn < 0) {
                JOptionPane.showMessageDialog(this, "Input cannot be negative.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (shots == 0) {
                resultLabel.setText("The Goalies Save Percentage Is: N/A (0 shots faced)");
                return;
            }

            double result = Math.floor((((double) shots - goalsLetIn) / (double) shots) * 1000) / 1000.0;
            resultLabel.setText(String.format("The Goalies Save Percentage Is: %.3f.", result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for Shots and Goals.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GoalieStatsCalculatorGUI().setVisible(true);
            }
        });
    }
}