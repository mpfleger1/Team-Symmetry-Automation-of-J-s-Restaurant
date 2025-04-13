import java.awt.*;
import javax.swing.*;

public class Login {
    public static void showLoginWindow() {
        JFrame loginFrame = new JFrame("Login");
        loginFrame.setSize(1200, 800);
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginFrame.setLocationRelativeTo(null); // Center the window

        // Use GridBagLayout for form-style layout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

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

        // Button action
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            JOptionPane.showMessageDialog(loginFrame,
                "Username: " + username + "\nPassword: " + password);
        });

        // Back Button
        gbc.gridy = 3;
        JButton backButton = new JButton("Back");
        panel.add(backButton, gbc);

        // Back button action
        backButton.addActionListener(e -> {
            // Close the login window and show the home screen again
            Home.showHomeScreen();
            loginFrame.dispose();
        });

        loginFrame.add(panel);
        loginFrame.setVisible(true);

        
    }
}
