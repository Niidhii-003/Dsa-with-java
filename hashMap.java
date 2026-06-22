import java.util.*;

///introduction to hashmap

// public class hashMap {
//     public static void main(String args[]){
//         HashMap<String, Integer> map=new HashMap<>();

//         ///INSERTION
//         map.put("India", 120);
//         map.put("US", 30);
//         map.put("China", 150);

//         System.out.println(map);

//         map.put("China", 180);
//         System.out.println(map);

//         ///SEARCH
//         if(map.containsKey("Indonesia")){
//             System.out.println("key is present in the map");
//         }else{
//             System.out.println("key is not present in the map");
//         }

//         ///GET
//         System.out.println(map.get("China"));  //key exists
//         System.out.println(map.get("Indonesia"));  ///key does not 
        
//         //ANOTHER WAY TO ITERATE OVER LOOP
//         int arr[]={12, 15, 18};
//         for(int i=0; i<3; i++){
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();


//         //another way
//         for(int val: arr){
//             System.out.println(val+" ");
//         }
//         System.out.println();

//         //HASMAP ITERTION
//         // for(int val: arr)
//         for(Map.Entry<String, Integer> e : map.entrySet()){
//             System.out.println(e.getKey());
//             System.out.println(e.getValue());
//         }

//         //ANother Way
//         Set<String> keys = map.keySet();
//         for(String key : keys){
//             System.out.println(key+ " " + map.get(key));
//         }


//     }
// }

//-------------------------------------------------------------------------------------

///MAJORITY ELEMENT
// public class hashMap{
//     public static void majorityElement(int nums[]){
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int n=nums.length;
//         for(int i=0; i<n; i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i], map.get(nums[i])+1);
//             }else{
//                 map.put(nums[i], 1);
//             }
//         }
//         for(int key : map.keySet()){
//             if (map.get(key) > n/3){
//                 System.out.println(key);
//             }
//         }

//     }

//     public static void main(String args[]){
//         int nums[] = {1,2};
//         majorityElement(nums);
//     }

// }

// ----------------------------------------------------------------------------------------------------

// UNION OF 2 ARRAYS
// public class hashMap{
//     public static int union(int arr1[], int arr2[]){
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<arr1.length; i++){
//             set.add(arr1[i]);
//         }
//         for(int j=0; j<arr2.length; j++){
//             set.add(arr2[j]);
//         }
//         return set.size();

//     }
//     public static void main(String args[]){
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};
//         System.out.println(union(arr1, arr2));


//     }
// }

//------------------------------------------------------------

///INTERSECTION OF TWO ARRAYS

// public class HashMap{
//     public static int intersection(int arr1[], int arr2[]){
//         HashSet<Integer> set=new HashSet<>();
//         int count=0;
//         for(int i=0; i<arr1.length; i++){
//             set.add(arr1[i]);
//         }
//         for(int j=0; j<arr2.length; j++){
//             if(set.contains(arr2[j])){  ///common
//                 count++;
//                 set.remove(arr2[j]);
//             }
//         }
//         return count;
//     }
//     public static void main(String args[]){
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};
//         System.out.println(intersection(arr1, arr2));
//     }


// }

///----------------------------------------------------------------------------

///FIND THE ITINERARY FROM TICKETS

// public class hashMap{
//     public static String getStart(HashMap<String, String> tick){
//         HashMap<String, String> revMap = new HashMap<>();

//         for(String key: tick.keySet()){
//             //key->key; val->tick.get(key)
//             revMap.put(tick.get(key), key);
//         }
//         for(String key: tick.keySet()){
//             if(!revMap.containsKey(key)){
//                 return key;
//             }
//         }
//         return null;
//     }
//     public static void main(String args[]){
//         HashMap<String, String> tickets = new HashMap<>();
//         tickets.put("Chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "Chennai");
//         tickets.put("Delhi", "Goa");

//         String start=getStart(tickets);

//         while(tickets.containsKey(start)){
//             System.out.print(start+"->");
//             start=tickets.get(start);
//         }
//         System.out.println(start);
//     }
// }

///---------------------------------------------------------------

///SUBARRAY SUM EQULAS TO K
public class hashMap{
    public static void main(String args[]){
        int arr[]={10, 2, -2, -20, 10};  ///ans=3
        int k=-10;
        HashMap<Integer, Integer> map = new HashMap<>();  //sum, freq

        map.put(0,1);  ///empty subarray
        int ans=0;
        int sum=0;
        for(int j=0; j<arr.length; j++){
            sum+=arr[j];

            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }else{
                map.put(sum, 1);
            }

        }
        System.out.println(ans);

    }
}
