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
    //Allows outside classes to update value of price
    public void setPrice(double price) {
        this.price = price;
    }
    public void displayItem() {
        System.out.println("Item name : "+name);
        System.out.println("Item descrption: "+description);
        System.out.println("Item quantity: "+quantity);
        System.out.println("Item price: "+price);
        System.out.println(".......");
    }
    

    }