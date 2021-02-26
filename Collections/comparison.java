package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class comparison {
    public static void main (String args[]){
        TreeSet  ts = new TreeSet(new MyComparator());
        ts.add("a");
        ts.add("l");
        ts.add("z");
        ts.add("d");
        System.out.println(ts);
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(Object o1,Object o2){
        String I1 = (String) o1;
        String I2 = o2.toString();
//        return (I1>I2)?+1:(I1<I2)?-1:0;
        return -I1.compareTo(I2);
    }
}