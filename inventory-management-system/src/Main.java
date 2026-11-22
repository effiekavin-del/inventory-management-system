import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[100]; //up to 100 items in inventory
        String[] descriptions = new String[100];
        int[] quantities = new int[100];
        double[] prices = new double[100];
        int num_name = 0;
        int num_description = 0;
        int num_quantity = 0;
        int num_price = 0;
        System.out.println("Please enter an item, its description, quantity, and price to start: ");
        String name = scanner.nextLine();
        names[num_name] = name;
        num_name += 1;
        String description = scanner.nextLine();
        descriptions[num_description] = description;
        num_description += 1;
        int quantity = scanner.nextInt();
        quantities[num_quantity] = quantity;
        num_quantity += 1;
        double price = scanner.nextDouble();
        prices[num_price] = price;
        num_price += 1;
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
                name = scanner.nextLine();
                names[num_name] = name;
                num_name += 1;
                description = scanner.nextLine();
                descriptions[num_description] = description;
                num_description += 1;
                quantity = scanner.nextInt();
                quantities[num_quantity] = quantity;
                num_quantity += 1;
                price = scanner.nextDouble();
                prices[num_price] = price;
                num_price += 1;
                scanner.nextLine();
            }
            else if (command.equals("Display All Items")) {
                myItem.displayItem(names, descriptions, quantities, prices);
            }
            System.out.println("Please enter a command: ");
            command = scanner.nextLine();
        }
        scanner.close();
}
}
