package restaurant;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
         MenuItem grapes = new MenuItem(25.00, "Quacks like a duck", Category.APPETIZER);

         System.out.println(grapes.getCategory());

         Menu testMenu = new Menu();


         ArrayList<MenuItem> testItems = new ArrayList<MenuItem>();
         testItems.add(grapes);
        Menu testMenu2 = new Menu(testItems);
         System.out.println(testMenu.getLastUpdated());
        System.out.println(testMenu2.getLastUpdated());
    }
}
