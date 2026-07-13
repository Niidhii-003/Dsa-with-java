import java.util.*;

public class twoSum{
    public static void main(String args[]){
        int arr[]={5,7,10,13};
        int target=20;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int other=target-arr[i];
            if(map.containsKey(other)){
                System.out.println((map.get(other) + " " + i));
                return;
            }
            map.put(arr[i], i);
            
        } 
        System.out.println("No pair found");
    }
}