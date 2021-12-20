package prog;

import java.io.IOException;
import java.util.ArrayList;

public class BubbleSorted<E> {
    ArrayList<E> arrayList;

    public BubbleSorted(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    private static int compare(Number a,Number b ){
        if(a instanceof Integer && b instanceof Integer){
            return ((Integer) a).compareTo((Integer) b);
        }
        else if(a instanceof Float && b instanceof Float){
            ((Float) a).compareTo((Float) b);;
        }
        else if(a instanceof Double && b instanceof Double){
            ((Double) a).compareTo((Double) b);
        }
        else if(a instanceof Short && b instanceof Short){
            ((Short) a).compareTo((Short) b);
        }
        else if(a instanceof Byte && b instanceof Byte){
            ((Byte) a).compareTo((Byte) b);
        }
        else if(a instanceof Long && b instanceof Long){
            ((Long) a).compareTo((Long) b);
        }
        else {
            throw new IllegalArgumentException();
        }
        return 0;
    }

    public static<E> void sortToMin(ArrayList<E> arrayList){
        if(!(arrayList.get(0) instanceof Number )){ throw new IllegalArgumentException();}
        boolean ready = false;
        while (!ready) {
            ready = true;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (compare((Number) arrayList.get(i),(Number) arrayList.get(i + 1))<0 ) {
                    E temp = (E) arrayList.get(i);
                    arrayList.set(i,arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    ready = false;
                }
            }
        }

    }
    public static<E> void sortToMax(ArrayList<E> arrayList){
        if(!(arrayList.get(0) instanceof Number )){
            throw new IllegalArgumentException();}
        boolean ready = false;
        while (!ready) {
            ready = true;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (compare((Number) arrayList.get(i),(Number) arrayList.get(i + 1))>0) {
                    E temp = (E) arrayList.get(i);
                    arrayList.set(i,arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    ready = false;
                }
            }
        }

    }
}
