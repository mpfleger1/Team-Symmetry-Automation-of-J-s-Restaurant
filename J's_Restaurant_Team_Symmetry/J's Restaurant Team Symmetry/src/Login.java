import java.awt.*;
import javax.swing.*;

public class Login {
    public static void showLoginWindow() {
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setSize(1200, 800);
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null); // Center the window

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Data data = new Data(); // Create an instance of Data to access employees

        // Username Label
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Username:"), gbc);

        // Username Field
        gbc.gridx = 1;
        JTextField usernameField = new JTextField(15);
        panel.add(usernameField, gbc);

        // Password Label
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Password:"), gbc);

        // Password Field
        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(15);
        panel.add(passwordField, gbc);

        // Login Button
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton loginButton = new JButton("Login");
        panel.add(loginButton, gbc);

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            Employee authenticatedEmployee = authenticate(username, password, data);
            if (authenticatedEmployee != null) {
                JOptionPane.showMessageDialog(loginFrame, "Welcome, " + authenticatedEmployee.getFirstName() + "!");
                // Proceed to the next screen
                if (authenticatedEmployee instanceof Waiter) {
                    WaiterPage.showWaiterPage(); // Show Waiter Page
                    loginFrame.dispose(); // Close the login frame
                } else if (authenticatedEmployee instanceof Manager) {
                    ManagerPage.showManagerPage(); // Show Manager Page
                    JOptionPane.showMessageDialog(loginFrame, "You will be directed to the manager page soon.");
                } else if (authenticatedEmployee instanceof Chef) {
                    //ChefPage.showChefPage(); // Show Chef Page
                    JOptionPane.showMessageDialog(loginFrame, "You will be directed to the chef page soon.");
                } else if (authenticatedEmployee instanceof Busboy) {
                    //CashierPage.showBusboyPage(); // Show Busboy Page
                    JOptionPane.showMessageDialog(loginFrame, "You will be directed to the busboy page soon.");
                }

            } else {
                JOptionPane.showMessageDialog(loginFrame, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Back Button
        gbc.gridy = 3;
        JButton backButton = new JButton("Back");
        panel.add(backButton, gbc);

        // Back button action
        backButton.addActionListener(e -> {
            Home.showHomeScreen();
            loginFrame.dispose();
        });

        loginFrame.add(panel);
        loginFrame.setVisible(true);
    }

    private static Employee authenticate(String username, String password, Data data) {
        // Check if the username and password match any employee in the Data class
        for (Employee employee : data.getAllEmployees()) {
            if (employee.getUsername().equals(username) && employee.getPassword().equals(password)) {
                return employee; // Return the authenticated employee
            }
        }
        return null; // Return null if authentication fails
    }
}