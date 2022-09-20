package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> fullMenu;

    public Menu(){
        this.lastUpdated = new Date();
    }

    //Overloaded constructor for pre made menu lists
    public Menu(ArrayList<MenuItem> newMenuList){
        this.lastUpdated = new Date();
        this.fullMenu = newMenuList;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getFullMenu() {
        return fullMenu;
    }

    public void setFullMenu(ArrayList<MenuItem> fullMenu) {
        this.fullMenu = fullMenu;
    }

    //Remove item

    //Add item
}
