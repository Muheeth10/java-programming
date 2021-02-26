package Collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst("hi");
        System.out.println(ll);
        ll.add(2);
        System.out.println(ll);
        ll.add("3");
        System.out.println(ll);
        ll.set(0,1);
        System.out.println("set"+ll);
        ll.add(0,"new1");
        System.out.println("index add"+ll);
        ll.remove(0);
        System.out.println("index removal"+ll);
        ll.remove("3");
        System.out.println("object removal"+ll);
    }
}
