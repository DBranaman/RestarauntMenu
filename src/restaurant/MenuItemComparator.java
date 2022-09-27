package restaurant;
// Code adapted from https://stackoverflow.com/questions/14682079/java-arraylist-hashmap-how-to-sort
public class MenuItemComparator implements java.util.Comparator<MenuItem> {
    public int compare(MenuItem item1, MenuItem item2) {
        int c = -1;

        //Test each key in the HashMap
        c = item1.getName().compareTo(item2.getName());
        if (c != 0) {
            return c; // Values are different and sorted
        }

        if(item1.getPrice() > item2.getPrice()){
            return 1;
        } else if(item1.getPrice() < item2.getPrice()){
            return -1;
        }

        c = item1.getDescription().compareTo(item2.getDescription());
        if (c != 0) {
            return c; // Values are different and sorted
        }

        if(item1.getCategory() != item2.getCategory()){
            return 1;
        }
/*
        c = item1.getNewItemDate().compareTo(item2.getNewItemDate());
        if (c != 0) {
            return c; // Values are different and sorted
        }
*/
        return c;   //Ensure return statement
    }
}