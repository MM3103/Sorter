package prog;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*        ArrayList<Integer> arrayList = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(r.nextInt(100));
        }
        System.out.println(arrayList);

        int n = arrayList.size();


        boolean ready = false;
        while (!ready) {
            ready = true;
            for (int i = 0; i < n - 1; i++) {
                if (arrayList.get(i) < arrayList.get(i + 1)) {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    ready = false;
                }
            }
        }
        System.out.println(arrayList);*/

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            arrayList.add(r.nextInt(100));
        }
        System.out.println(arrayList);

        BubbleSorted bubbleSorted = new BubbleSorted(arrayList);
        bubbleSorted.sortToMax();
        System.out.println(arrayList);
        bubbleSorted.sortToMin();
        System.out.println(arrayList);
    }
}

