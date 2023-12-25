package Ex.Set;

import java.util.ArrayList;
import java.util.List;

public class Multiset {
    public ArrayList<Integer> multiset;

    public Multiset(ArrayList<Integer> multiset) {
        this.multiset = new ArrayList<>();
    }

    public Multiset() {
        this.multiset = new ArrayList<>();
    }

    public void getSet() {
        System.out.print("{ ");
        for (Integer integer : this.multiset) {
            System.out.printf(" %d ", integer);
        }
        System.out.print(" }");
    }

    public void setSet(int data) {
        this.multiset.add(data);
    }
}
