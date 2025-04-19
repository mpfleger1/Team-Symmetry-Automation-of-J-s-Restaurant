import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class UpdateMenuPage {

    private static ArrayList<MenuItem> menuItems = new ArrayList<>(); // Temporary menu storage

    public static void showUpdateMenuPage() {
        JFrame updateMenuFrame = new JFrame("Update Menu");
        updateMenuFrame.setSize(800, 600);
        updateMenuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        updateMenuFrame.setLayout(new BorderLayout());

        // Menu List Panel
        JPanel menuListPanel = new JPanel(new BorderLayout());
        DefaultListModel<String> menuListModel = new DefaultListModel<>();
        JList<String> menuList = new JList<>(menuListModel);
        menuList.setFont(new Font("Arial", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(menuList);
        menuListPanel.add(scrollPane, BorderLayout.CENTER);

        // Load existing menu items
        for (MenuItem item : menuItems) {
            menuListModel.addElement(item.getName() + " - $" + item.getPrice());
        }

        // Buttons Panel
        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3, 10, 10));

        // Add Item Button
        JButton addItemButton = new JButton("Add Item");
        addItemButton.setFont(new Font("Arial", Font.PLAIN, 14));
        addItemButton.addActionListener(e -> {
            String name = JOptionPane.showInputDialog(updateMenuFrame, "Enter item name:");
            if (name != null && !name.trim().isEmpty()) {
                String priceStr = JOptionPane.showInputDialog(updateMenuFrame, "Enter item price:");
                try {
                    double price = Double.parseDouble(priceStr);
                    menuItems.add(new MenuItem(name, price));
                    menuListModel.addElement(name + " - $" + price);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(updateMenuFrame, "Invalid price entered.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        buttonsPanel.add(addItemButton);

        // Remove Item Button
        JButton removeItemButton = new JButton("Remove Item");
        removeItemButton.setFont(new Font("Arial", Font.PLAIN, 14));
        removeItemButton.addActionListener(e -> {
            int selectedIndex = menuList.getSelectedIndex();
            if (selectedIndex != -1) {
                menuItems.remove(selectedIndex);
                menuListModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(updateMenuFrame, "Please select an item to remove.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        buttonsPanel.add(removeItemButton);

        // Back Button
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.PLAIN, 14));
        backButton.addActionListener(e -> updateMenuFrame.dispose());
        buttonsPanel.add(backButton);

        updateMenuFrame.add(menuListPanel, BorderLayout.CENTER);
        updateMenuFrame.add(buttonsPanel, BorderLayout.SOUTH);
        updateMenuFrame.setVisible(true);
    }
}