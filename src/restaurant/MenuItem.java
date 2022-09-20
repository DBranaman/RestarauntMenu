package restaurant;
import java.util.Date;
enum Category {APPETIZER, MAINCOURSE, DESSERT};

public class MenuItem {
    private double price = 0.0;
    public String description = "";
    private Category category;
    private Date newItemDate;


    public MenuItem(double price, String description, Category category){
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItemDate = new Date();
    }

    public void setPrice(double aPrice){
        this.price = aPrice;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCategory(Category aCategory){
        this.category = aCategory;
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
}
