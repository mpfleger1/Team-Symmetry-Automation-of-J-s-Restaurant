import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

class TableLayouts extends JFrame {

    private JButton[][] tableButtons;
    private HashMap<String, Order> tableOrders;

    public TableLayouts() {
        setTitle("Table Layout");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 6));

        tableButtons = new JButton[6][6];
        tableOrders = new HashMap<>();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if ((j == 2 || j == 3) && (i >= 0 && i <= 3)) {
                    JPanel panel = new JPanel();
                    panel.setBackground(Color.LIGHT_GRAY);
                    add(panel);
                } else {
                    String tableID = (char) ('A' + j) + String.valueOf(i + 1);
                    tableButtons[i][j] = new JButton(tableID);
                    tableButtons[i][j].setBackground(Color.GREEN);
                    tableButtons[i][j].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            handleTableClick(tableID);
                        }
                    });
                    add(tableButtons[i][j]);
                }
            }
        }

        setVisible(true);
    }

    private void handleTableClick(String tableID) {
        JPanel panel = new JPanel(new GridLayout(0, 1));
        JLabel label = new JLabel("Table ID: " + tableID);
        panel.add(label);

        JButton changeStatusButton = new JButton("Change Table Status");
        changeStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeTableStatus(tableID);
            }
        });
        panel.add(changeStatusButton);

        JButton addToOrderButton = new JButton("Add to Order");
        addToOrderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Close the dialog before opening WaiterGUI
                Window window = SwingUtilities.getWindowAncestor(panel);
                if (window != null) {
                    window.dispose();
                }
                Order order = tableOrders.getOrDefault(tableID, new Order());
                tableOrders.put(tableID, order);
                new Waiter.WaiterGUI(TableLayouts.this, order);
            }
        });
        panel.add(addToOrderButton);

        JButton checkoutButton = new JButton("Checkout");
        checkoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkout(tableID);
            }

            private void checkout(String tableID) {
                Order order = tableOrders.get(tableID);
                if (order != null) {
                    // Implement checkout logic here
                    JOptionPane.showMessageDialog(null, "Order for table " + tableID + " checked out.");
                    tableOrders.remove(tableID);
                } else {
                    JOptionPane.showMessageDialog(null, "No order found for table " + tableID);
                }
            }
        });
        panel.add(checkoutButton);

        JOptionPane.showConfirmDialog(null, panel, "Table Options", JOptionPane.OK_CANCEL_OPTION);
    }

    private void changeTableStatus(String tableID) {
        int col = tableID.charAt(0) - 'A';
        int row = Integer.parseInt(tableID.substring(1)) - 1;
        String[] statuses = {"Occupied", "Clean", "Dirty"};
        int result = JOptionPane.showOptionDialog(null, "Change Table Status", "Table Status",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, statuses, statuses[0]);
        if (result == 0) {
            tableButtons[row][col].setBackground(Color.YELLOW);
            tableButtons[row][col].setToolTipText("Occupied");
        } else if (result == 1) {
            tableButtons[row][col].setBackground(Color.GREEN);
            tableButtons[row][col].setToolTipText("Clean");
        } else if (result == 2) {
            tableButtons[row][col].setBackground(Color.RED);
            tableButtons[row][col].setToolTipText("Dirty");
        }
    }

    public static void main(String[] args) {
        new TableLayouts();
    }
}
