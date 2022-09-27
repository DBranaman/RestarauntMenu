package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        MenuItem grapes = new MenuItem("Grapes", 25.00, "Quacks like a duck", Category.APPETIZER);
        MenuItem cassadilla = new MenuItem("Quesadilla", 25.00, "Dang cassadilla", Category.MAINCOURSE);
        MenuItem apple = new MenuItem("Apple", 0.25, "Granny's Finest", Category.DESSERT);
        MenuItem yogurt = new MenuItem("Yogurt", 3.47, "Full of bacteria", Category.DESSERT);
        MenuItem apple2 = new MenuItem("Apple", 0.25, "Granny's Finest", Category.DESSERT);

        Menu testMenu = new Menu();
        testMenu.addMenuItem(grapes);
        testMenu.addMenuItem(cassadilla);
        testMenu.addMenuItem(apple);
        testMenu.addMenuItem(yogurt);
        testMenu.addMenuItem(apple2);

        testMenu.printFullMenu();
        testMenu.getMenuItem(grapes);
        testMenu.removeMenuItem(apple);
        System.out.println("***************************************************");
        testMenu.printFullMenu();
    }
}
