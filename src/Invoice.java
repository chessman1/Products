
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Invoice {

    private LinkedList<Product> pList;

    public Invoice(){
        pList = new LinkedList<>();
    }
    
    public Invoice(Collection<? extends Product> c) {
        pList = new LinkedList<>();
        pList.addAll(c);
    }

    public void sort() {
        Collections.sort(pList);
    }

    public void addToList(Product[] arrProducts) {
        pList.addAll(Arrays.asList(arrProducts));
    }

    public LinkedList<Product> twoMostExpensive() {
        LinkedList<Product> copy = new LinkedList<>(pList);

        Collections.sort(copy,
                Collections.reverseOrder(new ProductComparator()));
        

        LinkedList<Product> result = new LinkedList<>();

        Iterator<Product> itr = copy.listIterator();

        for (int i = 0; i < 2; i++) {
            if (itr.hasNext()) {
                result.add(itr.next());
            }
        }

        return result;
    }

    public void shuffle(){
        Collections.shuffle(pList, new Random());
    }
    
    public String toString() {
        StringBuilder bdr = new StringBuilder();

        ListIterator<Product> itr = pList.listIterator();

        while (itr.hasNext()) {
            bdr.append(itr.next().toString());
            bdr.append(String.format("%n"));
        }

      

        return bdr.toString();
    }
}
