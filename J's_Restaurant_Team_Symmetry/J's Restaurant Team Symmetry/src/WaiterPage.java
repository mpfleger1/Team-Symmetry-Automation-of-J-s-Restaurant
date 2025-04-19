import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class WaiterPage {

    private static int orderIdCounter = 1; // To generate unique order IDs

    public static void showWaiterPage() {
        JFrame waiterFrame = new JFrame("Waiter Page");
        waiterFrame.setSize(1200, 800);
        waiterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        waiterFrame.setLayout(new BorderLayout());

        // Create a panel for buttons
        JPanel centerPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Create Order Button
        JButton createOrderButton = new JButton("Create Order");
        createOrderButton.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(createOrderButton, gbc);

        createOrderButton.addActionListener(e -> {
            createOrder(waiterFrame);
        });

        // Show Table Layout Button
        JButton showTableLayoutButton = new JButton("Show Table Layout");
        showTableLayoutButton.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(showTableLayoutButton, gbc);

        showTableLayoutButton.addActionListener(e -> {
            TableLayoutPage.showTableLayout(); // Open the table layout window
        });

        // Back to Home Button
        JButton backToHomeButton = new JButton("Back to Home");
        backToHomeButton.setFont(new Font("Arial", Font.PLAIN, 16));
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(backToHomeButton, gbc);

        backToHomeButton.addActionListener(e -> {
            Home.showHomeScreen(); // Navigate to the home screen
            waiterFrame.dispose(); // Close the waiter page
        });

        waiterFrame.add(centerPanel, BorderLayout.CENTER);
        waiterFrame.setVisible(true);
    }

    private static void createOrder(JFrame parentFrame) {
        MenuItemData menuItemData = new MenuItemData(); // Access menu items
        Order order = new Order(orderIdCounter++); // Create a new order with a unique ID

        boolean addingItems = true;

        while (addingItems) {
            // Show menu categories
            String[] categories = {
                "Appetizers", "Salads", "Entrees", "Sides", "Sandwiches", "Burgers", "Beverages"
            };

            String selectedCategory = (String) JOptionPane.showInputDialog(
                parentFrame,
                "Select a category:",
                "Menu Categories",
                JOptionPane.PLAIN_MESSAGE,
                null,
                categories,
                categories[0]
            );

            if (selectedCategory == null) {
                break; // User canceled
            }

            // Get the menu items for the selected category
            ArrayList<MenuItem> items = getMenuItemsByCategory(menuItemData, selectedCategory);

            if (items.isEmpty()) {
                JOptionPane.showMessageDialog(parentFrame, "No items available in this category.", "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            // Show menu items for the selected category
            String[] itemNames = items.stream().map(MenuItem::getName).toArray(String[]::new);

            String selectedItemName = (String) JOptionPane.showInputDialog(
                parentFrame,
                "Select an item:",
                "Menu Items - " + selectedCategory,
                JOptionPane.PLAIN_MESSAGE,
                null,
                itemNames,
                itemNames[0]
            );

            if (selectedItemName == null) {
                break; // User canceled
            }

            // Find the selected item and add it to the order
            for (MenuItem item : items) {
                if (item.getName().equals(selectedItemName)) {
                    order.addItem(item);
                    JOptionPane.showMessageDialog(parentFrame, item.getName() + " added to the order.");
                    break;
                }
            }

            // Ask if the user wants to add more items
            int continueAdding = JOptionPane.showConfirmDialog(
                parentFrame,
                "Would you like to add more items?",
                "Add More Items",
                JOptionPane.YES_NO_OPTION
            );

            if (continueAdding == JOptionPane.NO_OPTION) {
                addingItems = false;
            }
        }

        // Show the final order summary
        JOptionPane.showMessageDialog(parentFrame, order.toString(), "Order Summary", JOptionPane.INFORMATION_MESSAGE);
    }

    private static ArrayList<MenuItem> getMenuItemsByCategory(MenuItemData menuItemData, String category) {
        ArrayList<MenuItem> items = new ArrayList<>();

        switch (category) {
            case "Appetizers":
                items.add(menuItemData.menuItem1);
                items.add(menuItemData.menuItem2);
                items.add(menuItemData.menuItem3);
                items.add(menuItemData.menuItem4);
                items.add(menuItemData.menuItem5);
                break;
            case "Salads":
                items.add(menuItemData.menuItem6);
                items.add(menuItemData.menuItem7);
                items.add(menuItemData.menuItem8);
                items.add(menuItemData.menuItem9);
                break;
            case "Entrees":
                items.add(menuItemData.menuItem10);
                items.add(menuItemData.menuItem11);
                items.add(menuItemData.menuItem12);
                items.add(menuItemData.menuItem13);
                items.add(menuItemData.menuItem14);
                items.add(menuItemData.menuItem15);
                items.add(menuItemData.menuItem16);
                items.add(menuItemData.menuItem17);
                items.add(menuItemData.menuItem18);
                break;
            case "Sides":
                items.add(menuItemData.menuItem19);
                items.add(menuItemData.menuItem20);
                items.add(menuItemData.menuItem21);
                items.add(menuItemData.menuItem22);
                items.add(menuItemData.menuItem23);
                items.add(menuItemData.menuItem24);
                items.add(menuItemData.menuItem25);
                items.add(menuItemData.menuItem26);
                items.add(menuItemData.menuItem27);
                break;
            case "Sandwiches":
                items.add(menuItemData.menuItem28);
                items.add(menuItemData.menuItem29);
                items.add(menuItemData.menuItem30);
                items.add(menuItemData.menuItem31);
                items.add(menuItemData.menuItem32);
                break;
            case "Burgers":
                items.add(menuItemData.menuItem33);
                items.add(menuItemData.menuItem34);
                items.add(menuItemData.menuItem35);
                items.add(menuItemData.menuItem36);
                break;
            case "Beverages":
                items.add(menuItemData.menuItem37);
                items.add(menuItemData.menuItem38);
                items.add(menuItemData.menuItem39);
                items.add(menuItemData.menuItem40);
                items.add(menuItemData.menuItem41);
                items.add(menuItemData.menuItem42);
                items.add(menuItemData.menuItem43);
                items.add(menuItemData.menuItem44);
                break;
        }

        return items;
    }
}