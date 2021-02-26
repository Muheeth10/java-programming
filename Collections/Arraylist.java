package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
//import java.util.Collections;

public class Arraylist {

    public static void main(String args[]){
        ArrayList<String> a  = new ArrayList<String> ();
        a.add("a");
        a.add("10");
        ArrayList b = new ArrayList();

//        b.addAll(a);
        b.add("new");
        b.add("new2");
        b.add("new3");
//        a.set(0,b);
        ListIterator li = b.listIterator();
        while(li.hasNext()) {
            System.out.println(li.next());

        }
        System.out.println(b);
        System.out.println(a);


        // Synchronized list
        List l = Collections.synchronizedList(b);
        System.out.println(l);

    }

}
