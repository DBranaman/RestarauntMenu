package restaurant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> fullMenu;

    public Menu() {
        this.lastUpdated = new Date();
        this.fullMenu = new ArrayList<MenuItem>();
    }

    //Overloaded constructor for pre made menu lists
    public Menu(ArrayList<MenuItem> newMenuList) {
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

    public MenuItem getMenuItem(int index) {
        return fullMenu.get(index);
    }

    public MenuItem getMenuItem(MenuItem item) {
        int index = fullMenu.indexOf(item);
        return fullMenu.get(index);
    }

    public void setFullMenu(ArrayList<MenuItem> fullMenu) {
        this.fullMenu = fullMenu;
    }

    public void addMenuItem(MenuItem toAdd) {
        Boolean duplicate = false;
        for (MenuItem i : this.getFullMenu()) {
            if (equals(toAdd, i) && (this.getFullMenu().indexOf(toAdd) != this.getFullMenu().indexOf(i))) {
                duplicate = true;
                System.out.println(toAdd.getName() + " is a duplicate of of an existing menu item " + toAdd.getName());
                return;
            }
        }
        fullMenu.add(toAdd);
    }

    public void removeMenuItem(MenuItem toRemove) {
        int position = this.fullMenu.indexOf(toRemove);
        this.fullMenu.remove(position);
    }

    public void printFullMenu() {
        //Sort Menu
        ArrayList<MenuItem> sortedMenu = new ArrayList<>(this.getFullMenu());
        Collections.sort(sortedMenu, new MenuItemComparator());

        for (MenuItem i : sortedMenu) {
            printMenuItem(i);
            System.out.println();
        }
    }

    public void printMenuItem(MenuItem item) {
        item.printInformation();
    }

    public int compareMenuItems(MenuItem item1, MenuItem item2) {
        MenuItemComparator comp = new MenuItemComparator();
        int result = comp.compare(item1, item2);

        return result;
    }

    public boolean equals(MenuItem item1, MenuItem item2){
        boolean name = false;
        boolean price = false;
        boolean description = false;
        boolean category = false;
        if(item1.getName() == item2.getName()){
            name =  true;
        }

        if(item1.getPrice() == item2.getPrice()){
            price = true;
        }

        if(item1.getDescription() == item2.getDescription()){
            description = true;
        }

        if(item1.getCategory() == item2.getCategory()){
            category = true;
        }
        if(name && price && description && category){
            return true;
        } else {
            return false;
        }
    }
}

