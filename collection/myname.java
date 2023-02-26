import java.util.*;
public class myname{
    public static void main(String []args){
        LinkedList list=new LinkedList();
        //adding elements to the linked list
        list.addFirst("Harsh Goyal");
        list.addLast("Guddu Raj");
        list.add(1,"Mukesh Sunda");

        System.out.println(list.getfirst());
        System.out.println(list.getlasts());
        System.out.println(list.get(1));
    }
}