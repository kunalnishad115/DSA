import java.util.ArrayList;
//import java.util.*;
import java.util.Collections;
public class Arraylist1{

    public static void main(String args[]){

        ArrayList<Integer> mylist=new ArrayList<>();
        mylist.add(9);
        mylist.add(6);
        mylist.add(7);
        System.out.println("old araylist="+mylist);
       int ele= mylist.get(2);
        System.out.println("number you want from arraylist="+ele);
        mylist.set(0,10);
        System.out.println("new arralist="+mylist);
        mylist.add(2,76);
        System.out.println("after adding new element="+mylist);
        mylist.remove(3);
        System.out.println("removing element from the arraylist="+mylist);
       int size= mylist.size();
        System.out.println("SIZE OF ARRAYLIST="+size);
        Collections.sort(mylist);
        System.out.println("sorted arraylist="+mylist);




    }
}
