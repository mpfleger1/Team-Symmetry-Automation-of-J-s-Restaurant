import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import static com.example.jaysfinalproject.MenuSystem.*;

public class Waiter extends Employee {

    public Waiter() {
        super();
    }

    public Waiter(int employeeID, String password, String firstName, String lastName, double hoursWorked, double hourlyWage) {
        super(employeeID, password, firstName, lastName, hoursWorked, hourlyWage);
    }

    public void viewMenu() {
        try {
            List<List<MenuItemR>> menus = List.of(createAppMenu(), createSalMenu(), createEntMenu(), createSidMenu(), createSanMenu(), createBurMenu(), createBevMenu());
            List<String> menuNames = List.of("Appetizers", "Salads", "Entrees (All entrees served with 2 sides)", "Sides", "Sandwiches", "Burgers", "Beverages");

            System.out.println("Select Menu Item");
            for (int i = 0; i < menus.size(); i++) {
                System.out.println(menuNames.get(i));
                printMenu(menus.get(i));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error viewing menu: " + e.getMessage());
        }
    }

    public void takeOrder() {
        // Logic to take an order from a customer
        System.out.println("Taking order...");
    }

    public void collectPayment() {
        // Logic to collect payment from a customer
        System.out.println("Collecting payment...");
    }

    public static class WaiterGUI extends JFrame {
        private Order currentOrder;
        private JPanel menuPanel;
        private TableLayouts tableLayouts;

        public WaiterGUI(TableLayouts tableLayouts, Order order) {
            this.tableLayouts = tableLayouts;
            this.currentOrder = order;
            setTitle("Waiter Menu");
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            menuPanel = new JPanel();
            menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
            JScrollPane scrollPane = new JScrollPane(menuPanel);
            add(scrollPane, BorderLayout.CENTER);

            // Add menu buttons
            addMenuButtons(createAppMenu(), "Appetizers");
            addMenuButtons(createSalMenu(), "Salads");
            addMenuButtons(createEntMenu(), "Entrees");
            addMenuButtons(createSidMenu(), "Sides");
            addMenuButtons(createSanMenu(), "Sandwiches");
            addMenuButtons(createBurMenu(), "Burgers");
            addMenuButtons(createBevMenu(), "Beverages");

            // Add view order button
            JPanel bottomPanel = new JPanel();
            bottomPanel.setLayout(new FlowLayout());
            JButton viewOrderButton = new JButton("View Order");
            viewOrderButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String receipt = viewOrder();
                    JOptionPane.showMessageDialog(null, receipt);
                }
            });
            bottomPanel.add(viewOrderButton);

            JButton completeOrderButton = new JButton("Complete Order");
            completeOrderButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    completeOrder();
                }
            });
            bottomPanel.add(completeOrderButton);

            JButton backButton = new JButton("Back");
            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tableLayouts.setVisible(true);
                    dispose();
                }
            });
            bottomPanel.add(backButton);

            add(bottomPanel, BorderLayout.SOUTH);

            setVisible(true);
        }

        private void addMenuButtons(List<MenuItemR> menuItems, String category) {
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBorder(BorderFactory.createTitledBorder(category));

            for (MenuItemR item : menuItems) {
                String description = item.getDescription() != null ? item.getDescription() : "";
                JButton button = new JButton("<html><div style='text-align: left;'>" + item.getName() + " - $" + item.getPrice() + "<br>" + description + "</div></html>");
                button.setHorizontalAlignment(SwingConstants.LEFT);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        modifyMenuItem(item);
                    }
                });
                panel.add(button);
            }
            menuPanel.add(panel);
        }

        private void modifyMenuItem(MenuItemR item) {
            JPanel panel = new JPanel(new GridLayout(0, 1));
            JLabel nameLabel = new JLabel("Name: " + item.getName());
            JLabel priceLabel = new JLabel("Price: $" + item.getPrice());
            JLabel descriptionLabel = new JLabel("Description: " + (item.getDescription() != null ? item.getDescription() : ""));
            JTextField modificationField = new JTextField();
            panel.add(nameLabel);
            panel.add(priceLabel);
            panel.add(descriptionLabel);
            panel.add(new JLabel("Enter modifications:"));
            panel.add(modificationField);

            int result = JOptionPane.showConfirmDialog(null, panel, "Modify Item", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                currentOrder.addItems(item);
                JOptionPane.showMessageDialog(null, item.getName() + " added to order.");
                // Debugging statement
                System.out.println("Item added: " + item.getName());
                System.out.println("Current order items: " + currentOrder.getItems());
            }
        }

        private String viewOrder() {
            StringBuilder orderDetails = new StringBuilder("Receipt\n");
            orderDetails.append("====================================\n");
            List<MenuItem> items = currentOrder.getItems();
            if (items == null || items.isEmpty()) {
                orderDetails.append("No items in the order.\n");
            } else {
                for (MenuItem item : items) {
                    if (item != null) {
                        orderDetails.append(String.format("%-20s $%.2f\n", item.getName(), item.getPrice()));
                    } else {
                        orderDetails.append("Error: Null item encountered.\n");
                    }
                }
            }
            orderDetails.append("====================================\n");
            orderDetails.append(String.format("Total: $%.2f", currentOrder.getTotal()));
            return orderDetails.toString();
        }

        private void completeOrder() {
            currentOrder.completeOrder();
            JOptionPane.showMessageDialog(null, "Order completed and sent to another page.");
        }

        public static void main(String[] args) {
            new WaiterGUI(new TableLayouts(), new Order());
        }
    }
}
