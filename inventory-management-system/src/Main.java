import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String description = scanner.nextLine();
        int quantity = scanner.nextInt();
        double price = scanner.nextDouble();

        Item myItem = new Item(name, description, quantity, price);
        System.out.println("Command Options:");
        System.out.println("1. Edit Quantity");
        System.out.println("2. Edit Price");
        System.out.println("3. Delete Item");
        System.out.println("4. Display All Items");
        System.out.println("Please enter a command: ");
        String command = scanner.nextLine();
        if (command.equals("Display All Items")) {
            myItem.displayItem();
        }
        

    }
}