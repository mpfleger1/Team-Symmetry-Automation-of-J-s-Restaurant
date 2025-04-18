//import Scanner for taking in inputs and list for holding said inputs
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
public class MenuSystem {


    Scanner scan = new Scanner(System.in);


    //create the lists for each menu items and type, and the current menu item
    List<MenuItemR> menuApp = new ArrayList<>();
    List<MenuItemR> menuSal = new ArrayList<>();
    List<MenuItemR> menuEnt = new ArrayList<>();
    List<String> menuTop = new ArrayList<>();
    List<MenuItemR> menuSid = new ArrayList<>();
    List<MenuItemR> menuSan = new ArrayList<>();
    List<MenuItemR> menuBur = new ArrayList<>();
    List<MenuItemR> menuBev = new ArrayList<>();
    MenuItemR currentItem;


    int button = -1;
    //variables for creating and editing menu items
    String foodName;
    String description;
    float price;
    int index;


    //constructor
    MenuSystem() {
        List<MenuItemR> menuApp = new ArrayList<>();
        List<MenuItemR> menuSal = new ArrayList<>();
        List<MenuItemR> menuEnt = new ArrayList<>();
        List<String> menuTop = new ArrayList<>();
        List<MenuItemR> menuSid = new ArrayList<>();
        List<MenuItemR> menuSan = new ArrayList<>();
        List<MenuItemR> menuBur = new ArrayList<>();
        List<MenuItemR> menuBev = new ArrayList<>();

        createMenus();

    }


    //collection of methods to fill out each menu item with the items given
    public static List<MenuItemR> createAppMenu() {
        //create a list and the current item
        List<MenuItemR> menu = new ArrayList<>();
        MenuItemR currentItem;
        //go through the entire appetizers, create a menu item for each one, and put it into the menu
        currentItem = new MenuItemR("Chicken Nachos", 8.50f, "Pulled chicken, spicy white cheese sauce, & cheddar cheese topped with red onions & cilantro. Add BBQ sauce (+0.50)");
        menu.add(currentItem);
        currentItem = new MenuItemR("Pork Nachos", 8.50f, "Pulled pork, spicy white cheese sauce, & pepper jack cheese topped with tomato, Scallions & cilantro, Add BBQ sauce (+0.50)");
        menu.add(currentItem);
        currentItem = new MenuItemR("Pork or Chicken Sliders", "3 for $5.00", "Sauces: Chipotle, Jim Beam or Carolina Gold BBQ");
        menu.add(currentItem);
        currentItem = new MenuItemR("Catfish Bites", 6.50f, "Catfish pieces cornmeal-battered & fried. Served with lemon & spicy cocktail sauce");
        menu.add(currentItem);
        currentItem = new MenuItemR("Fried Veggies", 6.50f, "Choice of okra, zucchini, squash, or Mix & Match. Served with a side of spicy ranch");
        menu.add(currentItem);
        //return the finished menu back into main method
        return menu;

    }

    public static List<MenuItemR> createSalMenu() {
        List<MenuItemR> menu = new ArrayList<>();
        MenuItemR currentItem;
        //go through the entire appetizers, create a menu item for each one, and put it into the menu
        currentItem = new MenuItemR("House Salad", 7.50f, "Mixed Greens, topped with bacon, tomato & blue cheese crumbles");
        menu.add(currentItem);
        currentItem = new MenuItemR("Wedge Salad", 7.50f, "Iceberg lettuce wedge topped with bacon, tomato & blue cheese crumbles");
        menu.add(currentItem);
        currentItem = new MenuItemR("Caesar Salad", 7.50f, "Romaine lettuce, shredded Parmesan cheese & croutons tossed in Caesar dressing");
        menu.add(currentItem);
        currentItem = new MenuItemR("Sweet Potato Chicken Salad", 11.50f, "Mixed greens, red onion, dried cranberries & goat cheese crumbles topped with chilled sweet potato crusted chicken");
        menu.add(currentItem);


        return menu;

    }


    public static List<MenuItemR> createEntMenu() {
        List<MenuItemR> menu = new ArrayList<>();
        MenuItemR currentItem;

        currentItem = new MenuItemR("Shrimp & Grits", 13.50f, "Sautéed shrimp with garlic served on top of cheese grits, topped with sautéed peppers & onions");
        menu.add(currentItem);
        currentItem = new MenuItemR("Sweet Tea Fried Chicken", 11.50f, "Fried chicken breast marinated in sweet tea & spices, topped with a sweet tea reduction");
        menu.add(currentItem);
        currentItem = new MenuItemR("Caribbean Chicken", 11.50f, "Grilled chicken marinated in spicy Caribbean seasoning topped with mango salsa & avocado");
        menu.add(currentItem);
        currentItem = new MenuItemR("Grilled Pork Chops", 11.00f, "Two bone-in grilled pork chops");
        menu.add(currentItem);
        currentItem = new MenuItemR("New York Strip Steak", 17.00f, "New York Strip Steak cut in-house. Cooked to your desired temperature");
        menu.add(currentItem);
        currentItem = new MenuItemR("Seared Tuna", 15.00f, "Seared ahi tuna cooked to your desired temperature, topped with mango salsa & a honey lime vinaigrette drizzle");
        menu.add(currentItem);
        currentItem = new MenuItemR("Captain Crunch Chicken Tenders", 11.50f, "Fried chicken tenders coated in Captain Crunch with a dipping sauce");
        menu.add(currentItem);
        currentItem = new MenuItemR("Shock Top Grouper Fingers", 11.50f, "Shock Top beer-battered grouper served with tartar sauce & a lemon extra");
        menu.add(currentItem);
        currentItem = new MenuItemR("Mac & Cheese Bar", 8.50f, "Cast iron skillet of mac & cheese with choice of regular cheese or spicy cheese & choice of two toppings");
        menu.add(currentItem);


        return menu;

    }

    public static List<String> createTopMenu() {
        List<String> menu = new ArrayList<>();


        menu.add("Pepper Jack Cheese");
        menu.add("Cheddar Cheese");
        menu.add("Swiss Cheese");
        menu.add("Mozzarella Cheese");
        menu.add("Goat Cheese");
        menu.add("Bacon");
        menu.add("Broccoli");
        menu.add("Mushrooms");
        menu.add("Grilled Onions");
        menu.add("Jalapenos");
        menu.add("Spinach");
        menu.add("Tomatoes");

        return menu;

    }

    public static List<MenuItemR> createSidMenu() {
        List<MenuItemR> menu = new ArrayList<>();
        MenuItemR currentItem;

        currentItem = new MenuItemR("Curly Fries", 2.50f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Wing Chips", 2.50f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Sweet Potato Fries", 2.50f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Creamy Cabbage Slaw", 2.50f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Adluh Cheese Grits", 2.50f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Mashed Potatoes", 2.50f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Mac & Cheese", 2.50f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Seasonal Vegetables", 2.50f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Baked BeansA", 2.50f);
        menu.add(currentItem);

        return menu;

    }

    public static List<MenuItemR> createSanMenu() {
        List<MenuItemR> menu = new ArrayList<>();
        MenuItemR currentItem;

        currentItem = new MenuItemR("Grilled Cheese", 5.50f, "American cheese served on multigrain or white bread");
        menu.add(currentItem);
        currentItem = new MenuItemR("Chicken BLT&A", 10.00f, "Grilled chicken, bacon, lettuce, tomato & avocado on a pretzel bun");
        menu.add(currentItem);
        currentItem = new MenuItemR("Philly", 13.50f, "Choice of shaved New York Strip steak or grilled chicken topped with mushrooms, peppers, onions & provolone cheese on a hoagie");
        menu.add(currentItem);
        currentItem = new MenuItemR("Club", 10.00f, "Ham, turkey, Swiss cheddar, lettuce, tomato, mayo & bacon on multigrain bread");
        menu.add(currentItem);
        currentItem = new MenuItemR("Meatball Sub", 10.00f, "House-made meatballs topped with marinara & mozzarella cheese. Sautéed pepper & onions on request");
        menu.add(currentItem);


        return menu;

    }

    public static List<MenuItemR> createBurMenu() {
        List<MenuItemR> menu = new ArrayList<>();
        MenuItemR currentItem;

        currentItem = new MenuItemR("Bacon Cheeseburger", 11.00f, "8-ounce burger topped with bacon & your choice of cheddar, American, Swiss, provolone, pepper jack, blue cheese, or pimento cheese on a brioche bun");
        menu.add(currentItem);
        currentItem = new MenuItemR("Carolina Burger", 11.00f, "8-ounce burger topped with chili, diced onions & slaw on a brioche bun.");
        menu.add(currentItem);
        currentItem = new MenuItemR("Portobello Burger (V)", 8.50f, "Marinated Portobello mushroom cap topped with mango salsa, lettuce, tomato & onion on a telera bun");
        menu.add(currentItem);
        currentItem = new MenuItemR("Vegan Boca Burger (V)", 10.50f, "Vegan Boca Burger topped with lettuce, tomato & onion on a telera bun");
        menu.add(currentItem);

        return menu;

    }

    public static List<MenuItemR> createBevMenu() {
        List<MenuItemR> menu = new ArrayList<>();
        MenuItemR currentItem;


        currentItem = new MenuItemR("Sweet / Unsweetened Tea", 2.00f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Coke / Diet Coke", 2.00f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Sprite", 2.00f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Bottled Water", 2.00f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Lemonade", 2.00f);
        menu.add(currentItem);
        currentItem = new MenuItemR("Orange Juice", 2.00f);
        menu.add(currentItem);


        return menu;

    }


    //make a print method for any type of list given
    public static <E> void printMenu(List<E> menu) {
        int index = 0;
        for (E item : menu) {
            System.out.println(index + ") " + item);
            index++;
        }
    }


    public void printAll() {
        //print each of the menu items by type
        System.out.println("Appetizers");
        System.out.println();
        printMenu(menuApp);
        System.out.println();
        System.out.println("Salads");
        System.out.println();
        printMenu(menuSal);
        System.out.println();
        System.out.println("Entrees");
        System.out.println("All entrees served with 2 sides");
        System.out.println();
        printMenu(menuEnt);
        System.out.println();
        System.out.println("Toppings");
        System.out.println();
        printMenu(menuTop);
        System.out.println();
        System.out.println("Sides");
        System.out.println();
        printMenu(menuSid);
        System.out.println();
        System.out.println("Sandwiches");
        System.out.println();
        printMenu(menuSan);
        System.out.println();
        System.out.println("Burgers");
        System.out.println();
        printMenu(menuBur);
        System.out.println();
        System.out.println("Beverages");
        System.out.println();
        printMenu(menuBev);
        System.out.println();

    }


    public void createMenus() {
        //import all the menus
        menuApp = createAppMenu();
        menuSal = createSalMenu();
        menuEnt = createEntMenu();
        menuTop = createTopMenu();
        menuSid = createSidMenu();
        menuSan = createSanMenu();
        menuBur = createBurMenu();
        menuBev = createBevMenu();
    }

    //add new items to the menu
    public void addItemstoMenus() {
        do {
            System.out.println("Please select which menu item type you'd like to add to");
            System.out.println("1) Appetizers");
            System.out.println("2) Salads");
            System.out.println("3) Entrees");
            System.out.println("4) Toppings");
            System.out.println("5) Sides");
            System.out.println("6) Sandwiches");
            System.out.println("7) Burgers");
            System.out.println("8) Beverages");
            System.out.println("9) Back");

            button = Integer.parseInt(scan.nextLine());

            if (button == 1) { //app are name, price and desc
                System.out.print("Please enter the name of the appetizer: ");
                foodName = scan.nextLine();
                System.out.print("Please enter the price of " + foodName + ": $");
                price = Float.parseFloat(scan.nextLine());
                System.out.print("Please enter a description for " + foodName + ": ");
                description = scan.nextLine();
                currentItem = new MenuItemR(foodName, price, description);
                menuApp.add(currentItem);
                System.out.println("Salad added");

            } else if (button == 2) { //salads are name, price and desc
                System.out.print("Please enter the name of the salad: ");
                foodName = scan.nextLine();
                System.out.print("Please enter the price of " + foodName + ": $");
                price = Float.parseFloat(scan.nextLine());
                System.out.print("Please enter a description for " + foodName + ": ");
                description = scan.nextLine();
                currentItem = new MenuItemR(foodName, price, description);
                menuSal.add(currentItem);
                System.out.println("Salad added");
            } else if (button == 3) { //entrees are name, price and desc
                System.out.print("Please enter the name of the Entree: ");
                foodName = scan.nextLine();
                System.out.print("Please enter the price of " + foodName + ": $");
                price = Float.parseFloat(scan.nextLine());
                System.out.print("Please enter a description for " + foodName + ": ");
                description = scan.nextLine();
                currentItem = new MenuItemR(foodName, price, description);
                menuEnt.add(currentItem);
                System.out.println("Entree added");
            } else if (button == 4) { //toppings are just name
                System.out.print("Please enter the name of the topping: ");
                foodName = scan.nextLine();
                menuTop.add(foodName);
                System.out.println("Topping added");
            } else if (button == 5) { //sides are name and price
                System.out.print("Please enter the name of the Side: ");
                foodName = scan.nextLine();
                System.out.print("Please enter the price of " + foodName + ": $");
                price = Float.parseFloat(scan.nextLine());

                currentItem = new MenuItemR(foodName, price);
                menuSid.add(currentItem);
                System.out.println("Side added");
            } else if (button == 6) {//sadwitches name price and desc
                System.out.print("Please enter the name of the Sandwich: ");
                foodName = scan.nextLine();
                System.out.print("Please enter the price of " + foodName + ": $");
                price = Float.parseFloat(scan.nextLine());
                System.out.print("Please enter a description for " + foodName + ": ");
                description = scan.nextLine();
                currentItem = new MenuItemR(foodName, price, description);
                menuSan.add(currentItem);
                System.out.println("Sandwich added");
            } else if (button == 7) {// burgers are name, price and desc
                System.out.print("Please enter the name of the salad: ");
                foodName = scan.nextLine();
                System.out.print("Please enter the price of " + foodName + ": $");
                price = Float.parseFloat(scan.nextLine());
                System.out.print("Please enter a description for " + foodName + ": ");
                description = scan.nextLine();
                currentItem = new MenuItemR(foodName, price, description);
                menuBur.add(currentItem);
                System.out.println("Burger added");
            } else if (button == 8) {// beverages are name and price
                System.out.print("Please enter the name of the beverage: ");
                foodName = scan.nextLine();
                System.out.print("Please enter the price of " + foodName + ": $");
                price = Float.parseFloat(scan.nextLine());
                currentItem = new MenuItemR(foodName, price);
                menuBev.add(currentItem);
                System.out.println("Beverage added");
            } else if (button == 9) {

            } else {
                System.out.println("Please enter a valid number");
            }
        } while (button != 9);


    }

    public void removeItems() {
        do {
            System.out.println("Please select which menu item type you'd like to remove");
            System.out.println("1) Appetizers");
            System.out.println("2) Salads");
            System.out.println("3) Entrees");
            System.out.println("4) Toppings");
            System.out.println("5) Sides");
            System.out.println("6) Sandwiches");
            System.out.println("7) Burgers");
            System.out.println("8) Beverages");
            System.out.println("9) Back");

            button = Integer.parseInt(scan.next());

            if (button == 1) {
                System.out.println("Appetizers");
                System.out.println();
                printMenu(menuApp);
                System.out.print("Please enter the index of the item to remove: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println(menuApp.get(index).getName() + " is now removed");
                menuApp.remove(index);

            } else if (button == 2) {
                System.out.println("Salads");
                System.out.println();
                printMenu(menuSal);
                System.out.print("Please enter the index of the item to remove: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println(menuSal.get(index).getName() + " is now removed");
                menuSal.remove(index);

            } else if (button == 3) {
                System.out.println("Entrees");
                System.out.println("All entrees served with 2 sides");
                System.out.println();
                printMenu(menuEnt);
                System.out.print("Please enter the index of the item to remove: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println(menuEnt.get(index).getName() + " is now removed");
                menuEnt.remove(index);

            } else if (button == 4) {
                System.out.println("Toppings");
                System.out.println();
                printMenu(menuTop);
                System.out.print("Please enter the index of the item to remove: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println(menuTop.get(index) + " is now removed");
                menuTop.remove(index);

            } else if (button == 5) {
                System.out.println("Sides");
                System.out.println();
                printMenu(menuSid);
                System.out.print("Please enter the index of the item to remove: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println(menuSid.get(index).getName() + " is now removed");
                menuSid.remove(index);

            } else if (button == 6) {
                System.out.println("Sandwiches");
                System.out.println();
                printMenu(menuSan);
                System.out.print("Please enter the index of the item to remove: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println(menuSan.get(index).getName() + " is now removed");
                menuSan.remove(index);

            } else if (button == 7) {
                System.out.println("Burgers");
                System.out.println();
                printMenu(menuBur);
                System.out.print("Please enter the index of the item to remove: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println(menuBur.get(index).getName() + " is now removed");
                menuBur.remove(index);

            } else if (button == 8) {
                System.out.println("Beverages");
                System.out.println();
                printMenu(menuBev);
                System.out.print("Please enter the index of the item to remove: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println(menuBev.get(index).getName() + " is now removed");
                menuBev.remove(index);
            } else if (button == 9) {

            } else {
                System.out.println("Please enter a valid number");
            }
        } while (button != 9);

    }

    public void updateItems() {
        do {
            //pick a menu list to update
            System.out.println("Please select which menu item type you'd like to update");
            System.out.println("1) Appetizers");
            System.out.println("2) Salads");
            System.out.println("3) Entrees");
            System.out.println("4) Toppings");
            System.out.println("5) Sides");
            System.out.println("6) Sandwiches");
            System.out.println("7) Burgers");
            System.out.println("8) Beverages");
            System.out.println("9) Back");

            button = Integer.parseInt(scan.next());
            //update appetizers
            if (button == 1) {
                System.out.println("Appetizers");
                System.out.println();
                printMenu(menuApp);
                System.out.print("Please enter the index of the item to update: ");
                index = Integer.parseInt(scan.nextLine());
                do {
                    System.out.println(menuApp.get(index));
                    System.out.println("Please select which field to update");
                    System.out.println("1) Name");
                    System.out.println("2) Price");
                    System.out.println("3) Description");
                    System.out.println("4) Back");
                    button = Integer.parseInt(scan.nextLine());
                    if (button == 1) {
                        System.out.print("Please enter a new name: ");
                        foodName = scan.nextLine();
                        System.out.println(menuApp.get(index).getName() + " is now " + foodName);
                        menuApp.get(index).setName(foodName);

                    } else if (button == 2) {
                        System.out.println("Price per item or price for multiple?");

                        button = Integer.parseInt(scan.nextLine());
                        if (button == 1) {
                            System.out.print("Please enter a new price: ");
                            price = Float.parseFloat(scan.nextLine());
                            System.out.println(menuApp.get(index).getName() + "'s price is now " + price);
                            menuApp.get(index).setPrice(price);

                        } else if (button == 2) {
                            System.out.print("Please enter a new price: ");
                            String priceMult = (scan.nextLine());
                            System.out.println(menuApp.get(index).getName() + "'s price is now " + priceMult);
                            menuApp.get(index).setPriceMult(priceMult);
                        }
                    } else if (button == 3) {
                        System.out.print("Please enter a new description");
                        description = scan.nextLine();
                        System.out.println(menuApp.get(index).getName() + "'s description is now " + description);
                        menuApp.get(index).setDescription(description);
                    }

                } while (button != 4);


            } else if (button == 2) {
                System.out.println("Salads");
                System.out.println();
                printMenu(menuSal);
                System.out.print("Please enter the index of the item to update: ");
                index = Integer.parseInt(scan.nextLine());
                do {
                    System.out.println(menuSal.get(index));
                    System.out.println("Please select which field to update");
                    System.out.println("1) Name");
                    System.out.println("2) Price");
                    System.out.println("3) Description");
                    System.out.println("4) Back");
                    button = Integer.parseInt(scan.nextLine());
                    if (button == 1) {
                        System.out.print("Please enter a new name: ");
                        foodName = scan.nextLine();
                        System.out.println(menuSal.get(index).getName() + " is now " + foodName);
                        menuSal.get(index).setName(foodName);

                    } else if (button == 2) {
                        System.out.println("Price per item or price for multiple?");

                        button = Integer.parseInt(scan.nextLine());
                        if (button == 1) {
                            System.out.print("Please enter a new price: ");
                            price = Float.parseFloat(scan.nextLine());
                            System.out.println(menuSal.get(index).getName() + "'s price is now " + price);
                            menuSal.get(index).setPrice(price);

                        } else if (button == 2) {
                            System.out.print("Please enter a new price: ");
                            String priceMult = (scan.nextLine());
                            System.out.println(menuSal.get(index).getName() + "'s price is now " + priceMult);
                            menuSal.get(index).setPriceMult(priceMult);
                        }
                    } else if (button == 3) {
                        System.out.print("Please enter a new description");
                        description = scan.nextLine();
                        System.out.println(menuSal.get(index).getName() + "'s description is now " + description);
                        menuSal.get(index).setDescription(description);
                    }

                } while (button != 4);

            } else if (button == 3) {
                System.out.println("Entrees");
                System.out.println("All entrees served with 2 sides");
                System.out.println();
                printMenu(menuEnt);
                System.out.print("Please enter the index of the item to update: ");
                index = Integer.parseInt(scan.nextLine());
                do {
                    System.out.println(menuEnt.get(index));
                    System.out.println("Please select which field to update");
                    System.out.println("1) Name");
                    System.out.println("2) Price");
                    System.out.println("3) Description");
                    System.out.println("4) Back");
                    button = Integer.parseInt(scan.nextLine());
                    if (button == 1) {
                        System.out.print("Please enter a new name: ");
                        foodName = scan.nextLine();
                        System.out.println(menuEnt.get(index).getName() + " is now " + foodName);
                        menuEnt.get(index).setName(foodName);

                    } else if (button == 2) {
                        System.out.println("Price per item or price for multiple?");

                        button = Integer.parseInt(scan.nextLine());
                        if (button == 1) {
                            System.out.print("Please enter a new price: ");
                            price = Float.parseFloat(scan.nextLine());
                            System.out.println(menuEnt.get(index).getName() + "'s price is now " + price);
                            menuEnt.get(index).setPrice(price);

                        } else if (button == 2) {
                            System.out.print("Please enter a new price: ");
                            String priceMult = (scan.nextLine());
                            System.out.println(menuEnt.get(index).getName() + "'s price is now " + priceMult);
                            menuEnt.get(index).setPriceMult(priceMult);
                        }
                    } else if (button == 3) {
                        System.out.print("Please enter a new description");
                        description = scan.nextLine();
                        System.out.println(menuEnt.get(index).getName() + "'s description is now " + description);
                        menuEnt.get(index).setDescription(description);
                    }

                } while (button != 4);

            } else if (button == 4) {
                System.out.println("Toppings");
                System.out.println();
                printMenu(menuTop);
                System.out.print("Please enter the index of the item to update: ");
                index = Integer.parseInt(scan.nextLine());
                do {
                    System.out.println(menuTop.get(index));
                    System.out.println("Please select which field to update");
                    System.out.println("1) Name");
                    System.out.println("2) Back");
                    button = Integer.parseInt(scan.nextLine());
                    if (button == 1) {
                        System.out.print("Please enter a new name: ");
                        foodName = scan.nextLine();
                        System.out.println(menuTop.get(index) + " is now " + foodName);
                        menuTop.set(index, foodName);

                    } else if (button == 2) {
                    }


                } while (button != 2);

            } else if (button == 5) {
                System.out.println("Sides");
                System.out.println();
                printMenu(menuSid);
                System.out.print("Please enter the index of the item to update: ");
                index = Integer.parseInt(scan.nextLine());
                do {
                    System.out.println(menuSid.get(index));
                    System.out.println("Please select which field to update");
                    System.out.println("1) Name");
                    System.out.println("2) Price");
                    System.out.println("3) Description");
                    System.out.println("4) Back");
                    button = Integer.parseInt(scan.nextLine());
                    if (button == 1) {
                        System.out.print("Please enter a new name: ");
                        foodName = scan.nextLine();
                        System.out.println(menuSid.get(index).getName() + " is now " + foodName);
                        menuSid.get(index).setName(foodName);

                    } else if (button == 2) {
                        System.out.println("Price per item or price for multiple?");

                        button = Integer.parseInt(scan.nextLine());
                        if (button == 1) {
                            System.out.print("Please enter a new price: ");
                            price = Float.parseFloat(scan.nextLine());
                            System.out.println(menuSid.get(index).getName() + "'s price is now " + price);
                            menuSid.get(index).setPrice(price);

                        } else if (button == 2) {
                            System.out.print("Please enter a new price: ");
                            String priceMult = (scan.nextLine());
                            System.out.println(menuSid.get(index).getName() + "'s price is now " + priceMult);
                            menuSid.get(index).setPriceMult(priceMult);
                        }
                    } else if (button == 3) {
                        System.out.print("Please enter a new description");
                        description = scan.nextLine();
                        System.out.println(menuSid.get(index).getName() + "'s description is now " + description);
                        menuSid.get(index).setDescription(description);
                    }

                } while (button != 4);
                ;

            } else if (button == 6) {
                System.out.println("Sandwiches");
                System.out.println();
                printMenu(menuSan);
                System.out.print("Please enter the index of the item to update: ");
                index = Integer.parseInt(scan.nextLine());
                do {
                    System.out.println(menuSan.get(index));
                    System.out.println("Please select which field to update");
                    System.out.println("1) Name");
                    System.out.println("2) Price");
                    System.out.println("3) Description");
                    System.out.println("4) Back");
                    button = Integer.parseInt(scan.nextLine());
                    if (button == 1) {
                        System.out.print("Please enter a new name: ");
                        foodName = scan.nextLine();
                        System.out.println(menuSan.get(index).getName() + " is now " + foodName);
                        menuSan.get(index).setName(foodName);

                    } else if (button == 2) {
                        System.out.println("Price per item or price for multiple?");

                        button = Integer.parseInt(scan.nextLine());
                        if (button == 1) {
                            System.out.print("Please enter a new price: ");
                            price = Float.parseFloat(scan.nextLine());
                            System.out.println(menuSan.get(index).getName() + "'s price is now " + price);
                            menuSan.get(index).setPrice(price);

                        } else if (button == 2) {
                            System.out.print("Please enter a new price: ");
                            String priceMult = (scan.nextLine());
                            System.out.println(menuSan.get(index).getName() + "'s price is now " + priceMult);
                            menuSan.get(index).setPriceMult(priceMult);
                        }
                    } else if (button == 3) {
                        System.out.print("Please enter a new description");
                        description = scan.nextLine();
                        System.out.println(menuSan.get(index).getName() + "'s description is now " + description);
                        menuSan.get(index).setDescription(description);
                    }

                } while (button != 4);

            } else if (button == 7) {
                System.out.println("Burgers");
                System.out.println();
                printMenu(menuBur);
                System.out.print("Please enter the index of the item to update: ");
                index = Integer.parseInt(scan.nextLine());
                do {
                    System.out.println(menuBur.get(index));
                    System.out.println("Please select which field to update");
                    System.out.println("1) Name");
                    System.out.println("2) Price");
                    System.out.println("3) Description");
                    System.out.println("4) Back");
                    button = Integer.parseInt(scan.nextLine());
                    if (button == 1) {
                        System.out.print("Please enter a new name: ");
                        foodName = scan.nextLine();
                        System.out.println(menuBur.get(index).getName() + " is now " + foodName);
                        menuBur.get(index).setName(foodName);

                    } else if (button == 2) {
                        System.out.println("Price per item or price for multiple?");

                        button = Integer.parseInt(scan.nextLine());
                        if (button == 1) {
                            System.out.print("Please enter a new price: ");
                            price = Float.parseFloat(scan.nextLine());
                            System.out.println(menuBur.get(index).getName() + "'s price is now " + price);
                            menuBur.get(index).setPrice(price);

                        } else if (button == 2) {
                            System.out.print("Please enter a new price: ");
                            String priceMult = (scan.nextLine());
                            System.out.println(menuBur.get(index).getName() + "'s price is now " + priceMult);
                            menuBur.get(index).setPriceMult(priceMult);
                        }
                    } else if (button == 3) {
                        System.out.print("Please enter a new description");
                        description = scan.nextLine();
                        System.out.println(menuBur.get(index).getName() + "'s description is now " + description);
                        menuBur.get(index).setDescription(description);
                    }

                } while (button != 4);

            } else if (button == 8) {
                System.out.println("Beverages");
                System.out.println();
                printMenu(menuBev);
                System.out.print("Please enter the index of the item to update: ");
                index = Integer.parseInt(scan.nextLine());
                do {
                    System.out.println(menuBev.get(index));
                    System.out.println("Please select which field to update");
                    System.out.println("1) Name");
                    System.out.println("2) Price");
                    System.out.println("3) Description");
                    System.out.println("4) Back");
                    button = Integer.parseInt(scan.nextLine());
                    if (button == 1) {
                        System.out.print("Please enter a new name: ");
                        foodName = scan.nextLine();
                        System.out.println(menuBev.get(index).getName() + " is now " + foodName);
                        menuBev.get(index).setName(foodName);

                    } else if (button == 2) {
                        System.out.println("Price per item or price for multiple?");

                        button = Integer.parseInt(scan.nextLine());
                        if (button == 1) {
                            System.out.print("Please enter a new price: ");
                            price = Float.parseFloat(scan.nextLine());
                            System.out.println(menuBev.get(index).getName() + "'s price is now " + price);
                            menuBev.get(index).setPrice(price);

                        } else if (button == 2) {
                            System.out.print("Please enter a new price: ");
                            String priceMult = (scan.nextLine());
                            System.out.println(menuBev.get(index).getName() + "'s price is now " + priceMult);
                            menuBev.get(index).setPriceMult(priceMult);
                        }
                    } else if (button == 3) {
                        System.out.print("Please enter a new description");
                        description = scan.nextLine();
                        System.out.println(menuBev.get(index).getName() + "'s description is now " + description);
                        menuBev.get(index).setDescription(description);
                    }

                } while (button != 4);
            } else if (button == 9) {

            } else {
                System.out.println("Please enter a valid number");
            }
        } while (button != 9);
    }


    public <E> Object getItemForOrder() {

        do {
            //pick a menu list to update
            System.out.println("Please select which menu item type you'd like to update");
            System.out.println("1) Appetizers");
            System.out.println("2) Salads");
            System.out.println("3) Entrees");
            System.out.println("4) Toppings");
            System.out.println("5) Sides");
            System.out.println("6) Sandwiches");
            System.out.println("7) Burgers");
            System.out.println("8) Beverages");


            button = Integer.parseInt(scan.next());


            if (button == 1) {
                System.out.println("Appetizers");
                System.out.println();
                printMenu(menuApp);
                System.out.print("Please enter the index of the item to order: ");
                index = Integer.parseInt(scan.nextLine());
                return menuApp.get(index);

            } else if (button == 2) {
                System.out.println("Salads");
                System.out.println();
                printMenu(menuSal);
                System.out.print("Please enter the index of the item to order: ");
                index = Integer.parseInt(scan.nextLine());
                return menuSal.get(index);

            } else if (button == 3) {
                System.out.println("Entrees");
                System.out.println("All entrees served with 2 sides");
                System.out.println();
                printMenu(menuEnt);
                System.out.print("Please enter the index of the item to order: ");
                index = Integer.parseInt(scan.nextLine());
                return menuEnt.get(index);

            } else if (button == 4) {
                System.out.println("Toppings");
                System.out.println();
                printMenu(menuTop);
                System.out.print("Please enter the index of the item to order: ");
                index = Integer.parseInt(scan.nextLine());
                return menuTop.get(index);

            } else if (button == 5) {
                System.out.println("Sides");
                System.out.println();
                printMenu(menuSid);
                System.out.print("Please enter the index of the item to order: ");
                index = Integer.parseInt(scan.nextLine());
                return menuSid.get(index);

            } else if (button == 6) {
                System.out.println("Sandwiches");
                System.out.println();
                printMenu(menuSan);
                System.out.print("Please enter the index of the item to order: ");
                index = Integer.parseInt(scan.nextLine());
                return menuSan.get(index);

            } else if (button == 7) {
                System.out.println("Burgers");
                System.out.println();
                printMenu(menuBur);
                System.out.print("Please enter the index of the item to order: ");
                index = Integer.parseInt(scan.nextLine());
                return menuBur.get(index);

            } else if (button == 8) {
                System.out.println("Beverages");
                System.out.println();
                printMenu(menuBev);
                System.out.print("Please enter the index of the item to order: ");
                index = Integer.parseInt(scan.nextLine());
                return menuBev.get(index);


            }

        } while (true);
        

    }


}

