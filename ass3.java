// #ROTATED search array

// #SORTED ROTATED ARRAY SEARCH

// public class ass3{
//     public static int RotatedSorted(int arr[], int target){
//     int n=arr.length;
//     int low=0;
//     int high=n-1;

//     while(low<=high){
//         int mid=(low+high)/2;

//         //if target is found at mid
//         if(arr[mid]==target){
//             return mid;

//         }
            
    
//         //check if target is in the left half is sorted
//         else if(arr[low]<=arr[mid]){
//             //if target is in the left half
//             if(target>=arr[low] && target<=arr[mid]){
//                 high=mid;
//             }
//             else{
//                 low=mid+1;
//             }

//         }
//         //right half is sorted
//         else{
//             //if target is in the right half
//             if( target>=arr[mid+1] && target<=arr[high] ){
//                 low=mid+1;
//             }
//             else{
//                 high=mid;
//             }

//         }
//     }
//     return -1;

//     }
//     public static void main(String args[]){
//         int arr[]={4,5,6,7,0,12};
//         int target =0;
//         System.out.println(RotatedSorted(arr, target));

//     }
// }



// 3-sum

// public class ass3{
//     public static int[] threeSum(int array[]){
//         for(int i=0 ; i<array.length-2;i++){
//             for(int j=i+1; j<array.length-1 ; j++){
//                 for(int k=j+1; k<array.length ; k++){
//                     if(array[i]+array[j]+array[k]==0){
//                         return new int[]{array[i],array[j],array[k]};
//                     }
//                 }
//             }
//         }
//         //if no triplet found
//         return new int[]{};

//     }

//     public static void main(String args[]){
//         int array[]={-1,0,1,2,-1,4};
//         int result[]=threeSum(array);
//         if(result.length==0){
//             System.out.println("NO TRIPLET FOUND");
//         }else{
//             System.out.println(result[0]+" , "+ result[1]+" , "+result[2]);
//         }
//     }
// }


// import java.util.*;

// public class ass3 {

//     public static List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();

//         int n = nums.length;

//         // Sort to handle duplicates
//         Arrays.sort(nums);

//         for (int i = 0; i < n - 2; i++) {
//             for (int j = i + 1; j < n - 1; j++) {
//                 for (int k = j + 1; k < n; k++) {

//                     if (nums[i] + nums[j] + nums[k] == 0) {

//                         List<Integer> triplet =
//                                 Arrays.asList(nums[i], nums[j], nums[k]);

//                         // Avoid duplicate triplets
//                         if (!result.contains(triplet)) {
//                             result.add(triplet);
//                         }
//                     }
//                 }
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {

//         int[] array = {-1, 0, 1, 2, -1, 4};

//         List<List<Integer>> result = threeSum(array);

//         if (result.isEmpty()) {
//             System.out.println("NO TRIPLETS FOUND");
//         } else {
//             System.out.println(result);
//         }
//     }
// }



// #3sum problem of leetcode ---> brute force ---->time complexity=O(n^3)
// import java.util.*;
// public class ass3{
//     public static List<List<Integer>> threeSum(int nums[]){
//         int n=nums.length;
//         Arrays.sort(nums);   //SORT THE ARRAY
//         List<List<Integer>> ans=new ArrayList<>();
//         Set<List<Integer>> s=new HashSet<>();

//         // CHECK ALL TRIPLETS using three nested loops
//         for(int i=0 ; i<n-2; i++){
//             for(int j=i+1 ; j<n-1; j++){
//                 for(int k=j+1 ; k<n ; k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         //STORE AS LIST TO AVOID DUPLICATES
//                         s.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     }
//                 }
//             }
//         }
//         // CONVERT SET TO FINAL ANSWER LIST
//         ans.addAll(s);
//         return ans;

//     }
//     public static void main(String args[]){
//         int nums[]={-1,0,1,2,-1,-4};
//         System.out.println(threeSum(nums));
//     }
 
// }

///3sum where time complexity is  (n^2logn) using pointers

import java.util.*;
public class ass3{
    public static List<List<Integer>> ThreeSum(int number[]){
        int n=number.length;
        Arrays.sort(number); //sort the array
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s= new HashSet<>();

        //check for triplet
        for ( int i=0 ; i< n-2 ; i++){
            int low= i+1;
            int high=n-1;
            while(low<high){
                int sum=number[i]+number[low]+number[high];

                if(sum==0){
                    s.add(Arrays.asList(number[i], number[low], number[high]));
                    low++;
                    high--;
                }
                else if (sum<0){
                    low++;

                }else{
                    high--;
                }
                
            }


        }
        ans.addAll(s);
        return ans;


        
    }
    public static void main(String args[]){
        int number[]={-1, 0,  1, 2, -1, -4};
        System.out.println(ThreeSum(number));
    }
}


