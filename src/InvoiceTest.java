
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class InvoiceTest {

    public static void main(String[] args) {
        DrinkProduct[] dp = new DrinkProduct[]{
            new DrinkProduct(0.75, 1, 2.0, "energy"),
            new DrinkProduct(0.5, 2, 3.0, "juice")};

        FoodProduct[] fp = new FoodProduct[]{
            new FoodProduct(0.25, 10, 2.50, "chips"),
            new FoodProduct(0.25, 20, 2.50, "chips")};

        Invoice inv = new Invoice();
        inv.addToList(dp);
        inv.addToList(fp);

        inv.shuffle();

        System.out.println("Unsorted:");
        System.out.println(inv.toString());

        System.out.println("Sorted");
        inv.sort();
        System.out.println(inv.toString());

        System.out.println("The two most expensive:");
        LinkedList<Product> tme = inv.twoMostExpensive();
        ListIterator itr = tme.listIterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next().toString());
        }

    }
}
