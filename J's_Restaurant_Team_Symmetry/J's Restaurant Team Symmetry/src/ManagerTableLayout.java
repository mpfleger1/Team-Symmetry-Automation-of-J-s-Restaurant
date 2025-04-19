import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Layout {
    Scanner sc = new Scanner(System.in);
    private List<TableSystem> tables;

    public void LayoutMain(){
        boolean running = true;
        while (running){
            System.out.println("1. Display Tables");
            System.out.println("2. Add Seats");
            System.out.println("3. Change Layout");
            System.out.println("4. Return to Homepage");
            int action = sc.nextInt();

            switch (action){
                case 1:
                    display();
                    break;

                case 2:
                    addseats();
                    break;

                case 3:
                    changeLayout();
                    break;

                case 4:
                    System.out.println("Returning to Homepage...");
                    running =  false;
                    break;
            }
        }
    }

    public void display(){
        for (TableSystem tables : tables){
            System.out.println(tables);
        }
        System.out.println();
    }

    public Layout(){
        tables = new ArrayList<>();
        tables.add(new TableSystem("A1", 4));
        tables.add(new TableSystem("A2", 4));
        tables.add(new TableSystem("A3", 4));
        tables.add(new TableSystem("A4", 4));
        tables.add(new TableSystem("A5", 4));
        tables.add(new TableSystem("A6", 4));
        tables.add(new TableSystem("B1", 4));
        tables.add(new TableSystem("B2", 4));
        tables.add(new TableSystem("B3", 4));
        tables.add(new TableSystem("B4", 4));
        tables.add(new TableSystem("B5", 4));
        tables.add(new TableSystem("B6", 4));
        tables.add(new TableSystem("C5", 4));
        tables.add(new TableSystem("C6", 4));
        tables.add(new TableSystem("D5", 4));
        tables.add(new TableSystem("D6", 4));
        tables.add(new TableSystem("E1", 4));
        tables.add(new TableSystem("E2", 4));
        tables.add(new TableSystem("E3", 4));
        tables.add(new TableSystem("E4", 4));
        tables.add(new TableSystem("E5", 4));
        tables.add(new TableSystem("E6", 4));
        tables.add(new TableSystem("F1", 4));
        tables.add(new TableSystem("F2", 4));
        tables.add(new TableSystem("F3", 4));
        tables.add(new TableSystem("F4", 4));
        tables.add(new TableSystem("F5", 4));
        tables.add(new TableSystem("F6", 4));
    }

    public void addseats(){
        System.out.println("Which table would you like to add to?");
        String choice = sc.next();
        System.out.println("How many seats would you like to add?");
        int addedseats = sc.nextInt();

        for (TableSystem tables : tables){
            if(tables.gettableID().equals(choice)){
                tables.addseats(addedseats);
                return;
            }
        }
        System.out.println("Table does not exist");
    }

    public void changeLayout(){
        System.out.println("What is the first table you'd like to join?");
        String first = sc.next();
        System.out.println("What is the second table you'd like to join?");
        String second = sc.next();


        TableSystem table1 = null;
        TableSystem table2 = null;


        for (TableSystem table : tables) {
            if (table.gettableID().equals(first)) {
                table1 = table;
            } else if (table.gettableID().equals(second)) {
                table2 = table;
            }
        }

        if (table1 != null && table2 != null) {
            int newSeats = table1.getSeats() + table2.getSeats();
            String newtableID = table1.gettableID();
            tables.remove(table1);
            tables.remove(table2);

            TableSystem newtable = new TableSystem(newtableID, newSeats);
            tables.add(newtable);

            System.out.println("Tables joined successfully.");

            }
            else {
                System.out.println("One or both tables not found.");
            }
    }
}



