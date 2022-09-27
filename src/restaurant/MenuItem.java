package restaurant;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
enum Category {APPETIZER, MAINCOURSE, DESSERT};


public class MenuItem {
    // Days before an item is considered old
    public static int NEW_ITEM_DAYS = 14;
    private double price = 0.0;
    public String description = "";
    private Category category;
    private Date newItemDate;
    private String name;

    private DateFormat df = new SimpleDateFormat("dd:MMM:yyyy");


    public MenuItem(){
        this.price = -1.00;
        this.description = "Impossibly delicious";
        this.category = Category.APPETIZER;
        this.newItemDate = new Date(0000, 1, 14);
        this.name = "Void Burger";
    }

    public MenuItem(String name, double price, String description, Category category){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItemDate = new Date();
    }

    public void setName(String aName){
        this.name = aName;
    }
    public void setPrice(double aPrice){
        this.price = aPrice;
    }

    public void setDescription(String aDescription){
        this.description = aDescription;
    }

    public void setCategory(Category aCategory){
        this.category = aCategory;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.description;
    }

    public Category getCategory(){
        return this.category;
    }

    public Date getNewItemDate() {
        return this.newItemDate;
    }


    public Boolean isNew(){
        Date today = new Date();
        float timeDifference = today.getTime() - this.getNewItemDate().getTime();  // Difference in Milliseconds
        if( (timeDifference / TimeUnit.MILLISECONDS.convert (1, TimeUnit.DAYS)) < NEW_ITEM_DAYS){
            // Item is less than NEW_ITEM_DAYS old
            return true;
        }
        return false;
    }

    public void printInformation(){
        System.out.println(this.name);
        System.out.printf("\t$%.2f\n", this.price);
        System.out.println("\t" + this.description);
        System.out.println("\t" + this.category);
        System.out.println("\tAdded on " + this.df.format(this.newItemDate));
    }

}
