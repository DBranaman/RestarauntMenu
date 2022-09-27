package restaurant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> fullMenu;

    public Menu(){
        this.lastUpdated = new Date();
        this.fullMenu = new ArrayList<MenuItem>();
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
    public MenuItem getMenuItem(int index){
        return fullMenu.get(index);
    }

    public MenuItem getMenuItem(MenuItem item){
        int index = fullMenu.indexOf(item);
        return fullMenu.get(index);
    }

    public void setFullMenu(ArrayList<MenuItem> fullMenu) {
        this.fullMenu = fullMenu;
    }

    public void addMenuItem(MenuItem toAdd){
        fullMenu.add(toAdd);
    }

    public void removeMenuItem(MenuItem toRemove){
        int position = this.fullMenu.indexOf(toRemove);
        this.fullMenu.remove(position);
    }

    public void printFullMenu(){
        //Sort Menu
        ArrayList<MenuItem> sortedMenu = new ArrayList<>(this.getFullMenu());
        Collections.sort(sortedMenu, new MenuItemComparator());

        for(MenuItem i : sortedMenu ){
            printMenuItem(i);
            System.out.println();
        }
    }

    public void printMenuItem(MenuItem item){
        item.printInformation();
    }

    public int compareMenuItems(MenuItem item1, MenuItem item2){
        MenuItemComparator comp = new MenuItemComparator();
        int result = comp.compare(item1, item2);

        return result;
    }


}

