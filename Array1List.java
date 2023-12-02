package Arraypack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array1List {
    public static void main(String[] args) {
        List list=new ArrayList();
        List l2=new ArrayList();
        l2.add(123);
        l2.add(555);
        l2.add("vijay");
        list.add(123);
        list.add(0,5000);
        System.out.println(list);

        list.add(555);
      //  list.add(555);
        list.add("Vijay");
       // list.add(1,44);
     //   list.hashCode();
     //   System.out.println(l2.hashCode());
      //  System.out.println(list.hashCode());
       // System.out.println(list.lastIndexOf(555));
      //  System.out.println(list.contains(555));//true

     /*   System.out.println(list.isEmpty());// false
 List l2=new ArrayList();
        System.out.println(l2.isEmpty());// true
*/


     /*   list.clear();   //for clear all of list
        System.out.println(list.add(4 ));//true
        System.out.println(list.get(0));// 4  */
//list.toArray();    //for convert list to array
//        System.out.println(list);

       // System.out.println(list.indexOf(44));  //for check index of value.
    }


      /*  List l = new ArrayList();
        l.add(10);
        l.add(15);
        l.add(20);
        System.out.println(l);

        List l2 = new ArrayList();
        l2.add(10);
        l2.add(15);
        l2.add(20);

            System.out.println(l.equals(l2));}//This method is used to compare two lists.
        // It compares the lists as, both lists should have the same size,
        // and all corresponding pairs of elements in the two lists are equal.*/





}