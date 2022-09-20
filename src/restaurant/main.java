package restaurant;

public class main {
    public static void main(String[] args){
         MenuItem grapes = new MenuItem(25.00, "Quacks like a duck", Category.APPETIZER);

         System.out.println(grapes.getCategory());
    }
}
