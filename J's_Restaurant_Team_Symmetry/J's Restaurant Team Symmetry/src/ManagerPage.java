import java.awt.*;
import javax.swing.*;

public class ManagerPage {

    public static void showManagerPage() {
        JFrame managerFrame = new JFrame("Manager Page");
        managerFrame.setSize(1200, 800);
        managerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        managerFrame.setLayout(new BorderLayout());

        // Create a panel for buttons
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // View Chef Page Button
        JButton viewChefPageButton = new JButton("View Chef Page");
        viewChefPageButton.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(viewChefPageButton, gbc);

        viewChefPageButton.addActionListener(e -> {
            //ChefPage.showChefPage(); // Navigate to the Chef Page
        });

        // View Busboy Page Button
        JButton viewBusboyPageButton = new JButton("View Busboy Page");
        viewBusboyPageButton.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(viewBusboyPageButton, gbc);

        viewBusboyPageButton.addActionListener(e -> {
            //BusboyPage.showBusboyPage(); // Navigate to the Busboy Page
        });

        // View Waiter Page Button
        JButton viewWaiterPageButton = new JButton("View Waiter Page");
        viewWaiterPageButton.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(viewWaiterPageButton, gbc);

        viewWaiterPageButton.addActionListener(e -> {
            WaiterPage.showWaiterPage(); // Navigate to the Waiter Page
            managerFrame.dispose(); // Close the manager page
        });

        // Update Menu Button
        JButton updateMenuButton = new JButton("Update Menu");
        updateMenuButton.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 3;
        centerPanel.add(updateMenuButton, gbc);

        updateMenuButton.addActionListener(e -> {
            UpdateMenuPage.showUpdateMenuPage(); // Navigate to the Update Menu Page 
        });

        // Back to Home Button
        JButton backToHomeButton = new JButton("Back to Home");
        backToHomeButton.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 4;
        centerPanel.add(backToHomeButton, gbc);

        backToHomeButton.addActionListener(e -> {
            Home.showHomeScreen(); // Navigate to the home screen
            managerFrame.dispose(); // Close the manager page
        });

        managerFrame.add(centerPanel, BorderLayout.CENTER);
        managerFrame.setVisible(true);
    }
}