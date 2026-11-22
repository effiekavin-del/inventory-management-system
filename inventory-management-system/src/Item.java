import java.util.Scanner;
public class Item extends Main {
    private String name; //name of item
    private String description; //description of item
    private int quantity; //amount/quantity of item available
    private double price;// item's cost

    //Constructor with parameters name, description, quantity, and price
    public Item(String name, String description, int quantity, double price) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;    
    }
    //returns name value to outside classes
    public String getName() {
        return name;
    }
    //returns description value to outside classes
    public String getDescription() {
        return description;
    }
    //Allows outside classes to update value of quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //returns quantity value to outside classes
    public int getQuantity(){
        return quantity;
    }
    //Allows outside classes to update value of price
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void displayItem(String[] names, String[] descriptions, int[] quantities, double[] prices) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                break;
            }
            System.out.println("Item name : "+names[i]);
            System.out.println("Item descrption: "+descriptions[i]);
            System.out.println("Item quantity: "+quantities[i]);
            System.out.println("Item price: "+prices[i]);
            System.out.println(".......");
        }
    }
    public void addItem(Scanner scanner,String name, String[] names, int num_items, String description, String[] descriptions, int quantity, int[] quantities, double price, double[] prices) {
        name = scanner.nextLine();
        names[num_items] = name;
        description = scanner.nextLine();
        descriptions[num_items] = description;
        quantity = scanner.nextInt();
        quantities[num_items] = quantity;
        price = scanner.nextDouble();
        prices[num_items] = price;
        num_items += 1;
    }
    public void editQuantity(Scanner scanner, String target, String[] names, int[] quantities) {
        int index = -1;
        for (int i = 0; i < names.length; i++){
            if (names[i].equals(target)) {
                index = i;
                break;
            }
        }
        quantities[index] = scanner.nextInt();

    }
    }