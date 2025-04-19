import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class TableLayoutPage {
    public static void showTableLayout() {
        JFrame frame = new JFrame("Table Layout");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a 6x6 grid for tables
        JPanel tablePanel = new JPanel(new GridLayout(6, 6, 10, 10));
        ArrayList<Table> tables = new ArrayList<>();

        // Create 36 tables and add them to the grid
        for (int i = 1; i <= 36; i++) {
            Table table = new Table(i, "Clean");
            tables.add(table);

            JButton tableButton = new JButton("Table " + i + "\n(" + table.getStatus() + ")");
            tableButton.setFont(new Font("Arial", Font.PLAIN, 12));

            // Black out non-existent tables
            if (i == 3 || i == 4 || i == 9 || i == 10 || i == 15 || i == 16) {
                tableButton.setText("N/A");
                tableButton.setBackground(Color.BLACK);
                tableButton.setEnabled(false); // Disable the button
            } else {
                tableButton.setBackground(Color.GREEN);

                // Add action listener to handle table status changes
                tableButton.addActionListener(e -> {
                    if (table.getStatus().equals("Clean")) {
                        table.setStatus("Occupied");
                        tableButton.setText("Table " + table.getTableID() + "\n(" + table.getStatus() + ")");
                        tableButton.setBackground(Color.RED);
                    } else if (table.getStatus().equals("Occupied")) {
                        table.setStatus("Dirty");
                        tableButton.setText("Table " + table.getTableID() + "\n(" + table.getStatus() + ")");
                        tableButton.setBackground(Color.ORANGE);
                    } else if (table.getStatus().equals("Dirty")) {
                        table.setStatus("Clean");
                        tableButton.setText("Table " + table.getTableID() + "\n(" + table.getStatus() + ")");
                        tableButton.setBackground(Color.GREEN);
                    }
                });
            }

            tablePanel.add(tableButton);
        }

        frame.add(tablePanel, BorderLayout.CENTER);

        // Add a back button to return to the home screen
        JButton backButton = new JButton("Back to Home");
        backButton.setFont(new Font("Arial", Font.PLAIN, 16));
        backButton.addActionListener(e -> {
            Home.showHomeScreen(); // Navigate to the home screen
            frame.dispose(); // Close the table layout window
        });

        frame.add(backButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}