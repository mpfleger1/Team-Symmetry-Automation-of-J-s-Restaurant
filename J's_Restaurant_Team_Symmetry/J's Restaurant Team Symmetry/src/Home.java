import java.awt.*;
import javax.swing.*;

public class Home {
    public static void showHomeScreen() {

        // ---------- Home Page (Window) ----------
        // Set the look and feel to the system's default
        JFrame mainFrame = new JFrame("Home Page");
        mainFrame.setSize(1200, 800);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout());

        // ---------- Custom Banner Panel (Information About the Restaurant) ----------
        // Create a custom banner panel with a background color and title
        JPanel bannerPanel = new JPanel();
        bannerPanel.setBackground(new Color(14, 40, 65));
        bannerPanel.setPreferredSize(new Dimension(400, 120));
        
        JLabel titleLabel = new JLabel(
            "<html>J's Restaurant<br>" +
            "jscorner.com<br>" +
            "680 Arnston Drive, Marietta GA 30060<br>" +
            "(470) 555-1212</html>"
        );
        titleLabel.setFont(new Font("Serif", Font.BOLD, 20));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        
        bannerPanel.add(titleLabel);
        mainFrame.add(bannerPanel, BorderLayout.NORTH);

        // ---------- Login Button (Center) ----------
        // Create a button and center it in the main frame
        JPanel centerPanel = new JPanel(new GridBagLayout()); // Center things
        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 16));
        centerPanel.add(loginButton); // Automatically centers
        mainFrame.add(centerPanel, BorderLayout.CENTER);

        loginButton.addActionListener(e -> {
            Login.showLoginWindow();
            mainFrame.dispose(); // Close the main frame when login is clicked
        });
        

        // ---------- Clock Label (Bottom) ----------
        // Create a clock label and add it to the bottom of the main frame
        JLabel clockLabel = new JLabel();
        clockLabel.setHorizontalAlignment(JLabel.CENTER);
        clockLabel.setFont(new Font("Arial", Font.BOLD, 16));
        mainFrame.add(clockLabel, BorderLayout.SOUTH);

        Timer timer = new Timer(1000, e -> {
            String dateTime = new java.text.SimpleDateFormat("EEEE, MMMM dd, yyyy - hh:mm:ss a").format(new java.util.Date());
            clockLabel.setText(dateTime);
        });
        timer.start();

        mainFrame.setVisible(true);
    }
}
