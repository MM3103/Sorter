package prog;

import java.util.ArrayList;

public class BubbleSorted {

    ArrayList<Integer> arrayList = new ArrayList<>();
    int size = 0;

    public BubbleSorted(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
        this.size=arrayList.size();
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void sortToMin(){
        boolean ready = false;
        while (!ready) {
            ready = true;
            for (int i = 0; i < this.getSize() - 1; i++) {
                if (arrayList.get(i) < arrayList.get(i + 1)) {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    ready = false;
                }
            }
        }

    }
    public void sortToMax(){
        boolean ready = false;
        while (!ready) {
            ready = true;
            for (int i = 0; i < this.getSize() - 1; i++) {
                if (arrayList.get(i) > arrayList.get(i + 1)) {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    ready = false;
                }
            }
        }

    }
}
