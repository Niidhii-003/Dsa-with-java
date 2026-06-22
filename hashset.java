import java.util.*;
import java.util.HashSet;


public class hashset{
    public static void main(String args[]){
        //creating 

        HashSet<Integer> set = new HashSet<>();

        ///INSERT

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        ///SEARCH
        
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }


        //DELETE 
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1 - we deleted one");
        }

        //size
        System.out.println(set.size());

        //print all element
         System.out.println(set);


        //ITERATION

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }






    }
}