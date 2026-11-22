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
    public void addItem(Scanner scanner,String name, String[] names, int num_name, String description, String[] descriptions, int num_description, int quantity, int[] quantities, int num_quantity, double price, double[] prices, int num_price) {
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
    }

    }