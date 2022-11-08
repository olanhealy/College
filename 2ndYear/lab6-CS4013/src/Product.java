/**
 A product in a vending machine.
 */
public class Product
{
    private String description;
    private int quantity;
    private double price;

    /**
     Constructs a Product object
     @param aDescription the description of the product
     @param aPrice the price of the product
     */
    public Product(String aDescription, double aPrice,int aQuantity)
    {
        description = aDescription;
        price = aPrice;
        quantity = aQuantity;

    }
    //ADD REMAINING CODE HERE
    public double getPrice() {
        return price;
    }


    public String toString(){
        String x = "Description: " + description +"\n" + " Price: " + price;
        return x;
    }
    public int getQuantity()
    {
        return quantity;
    }


}