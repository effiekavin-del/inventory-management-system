import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[100]; //up to 100 items in inventory
        String[] descriptions = new String[100];
        int[] quantities = new int[100];
        double[] prices = new double[100];
        int num_items = 0;
        //int num_description = 0;
        //int num_quantity = 0;
        //int num_price = 0;
        System.out.println("Please enter an item, its description, quantity, and price to start: ");
        String name = scanner.nextLine();
        names[num_items] = name;
        String description = scanner.nextLine();
        descriptions[num_items] = description;
        //num_description += 1;
        int quantity = scanner.nextInt();
        quantities[num_items] = quantity;
        //num_quantity += 1;
        double price = scanner.nextDouble();
        prices[num_items] = price;
        //num_price += 1;
        num_items += 1;
        scanner.nextLine();

        Item myItem = new Item(name, description, quantity, price);
        System.out.println("Command Options:");
        System.out.println("1. Edit Quantity");
        System.out.println("2. Edit Price");
        System.out.println("3. Delete Item");
        System.out.println("4. Display All Items");
        System.out.println("5. Add Item");
        System.out.println("6. Finish");
        System.out.println("Please enter a command: ");
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            if (command.equals("Add Item")) {
                myItem.addItem(scanner, name, names, num_items, description, descriptions, quantity, quantities, price, prices);
                scanner.nextLine();
            }
            else if (command.equals("Display All Items")) {
                myItem.displayItem(names, descriptions, quantities, prices);
            }
            else if (command.equals("Edit Quantity")){
                System.out.println("Which item's quantity are you changing?: ");
                String target = scanner.nextLine();
                myItem.editQuantity(scanner, target, names, quantities);
                scanner.nextLine();
            }
            System.out.println("Please enter a command: ");
            command = scanner.nextLine();
        }
        scanner.close();
}
}
