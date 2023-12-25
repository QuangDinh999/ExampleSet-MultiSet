package Ex.MultiSet;

import java.util.ArrayList;

public class MultiSet {
    public ArrayList<Integer> set;

    public MultiSet(ArrayList<Integer> set) {
        this.set = new ArrayList<>();
    }

    public MultiSet() {
        this.set = new ArrayList<>();
    }

    public void getSet() {
        System.out.print("{ ");
        for (Integer integer : this.set) {
            System.out.printf(" %d ", integer);
        }
        System.out.print(" }");
    }

    public void setSet(int data) {
        for (int i = 0; i < this.set.size(); i++) {
            if(data == this.set.get(i)) {
                this.set.remove(this.set.get(i));
            }
        }
        this.set.add(data);
    }
}
