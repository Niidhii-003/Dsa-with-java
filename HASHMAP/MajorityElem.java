import java.util.*;

public class MajorityElem{
    public static void main(String args[]){
        int arr[]={1,3,2,5,1,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num=arr[i];
            // if(map.containsKey(num)){
            //     map.put(num, map.get(num)+1);
            // }else{
            //     map.put(num, 1);
            // }
            //shortcut
            map.put(num , map.getOrDefault(num,0)+1);
        }
        // Set<Integer> KeySet = map.keySet();
        for(Integer key : map.keySet()){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}