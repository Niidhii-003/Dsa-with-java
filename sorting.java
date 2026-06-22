// import java.util.*;
// public class sorting{
//     public static void BubbleSort(int arr[]){
//         for(int turn=0; turn<arr.length-1 ; turn++){
//             for(int j=0 ; j<arr.length-1-turn ; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }

//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0 ; i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         BubbleSort(arr);
//         printArr(arr);
//     }
// }

//ANOTHER WAY
// import java.util.*;
// public class sorting{
//     public static void BubbleSort(int arr[]){
//         int n=arr.length;
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }

//     }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]={4,3,1,6,9,5,1};
//         BubbleSort(arr);
//         printArr(arr);
//     }
// }



//SELECTION SORT


// import java.util.*;
// public class sorting{
//     public static void SelectionSort(int arr[]){
//         for(int i=0 ; i<arr.length-1 ; i++){
//             int minPos=i;
//             for(int j=i+1; j<arr.length ; j++){
//                 if(arr[minPos]>arr[j]){
//                     minPos=j;
//                 }
//             }
//          //Swap
//            int temp=arr[minPos];
//            arr[minPos]=arr[i];
//            arr[i]=temp;
        
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0 ; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }


//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         SelectionSort(arr);
//         printArr(arr);
//     }
// }



//INSERTION SORT
// import java.util.*;

// public class sorting{
//     public static void InsertionSort(int arr[]){
//     for(int i=1; i<arr.length; i++){
//         int curr=arr[i];
//         int prev=i-1;
//         //finding out the correct pos to insert
//         while(prev>=0 && arr[prev]>arr[curr]>arr[curr]){
//             arr[prev+1]=arr[prev];
//             prev--;
//         }
//         //inserttion
//         arr[prev+1]=arr[curr];
//     }
//     public static void printArr(int arr[]){
//         for(int i=0 ; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         InsertionSort(arr);
//         printArr(arr);

//     }
// }




// }


//INBUILT SORTING
//ascending order
// import java.util.Arrays;

// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0 ; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int arr[]={5,4,1,3,2};
//         Arrays.sort(arr);
//         printArr(arr);

//     }
// }

//descending order
// import java.util.Arrays;
// import java.util.Collections;
// public class sorting{
//     public static void printArr(Integer arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
//     public static void main(String args[]){
//         Integer arr[]={5,4,1,3,2};
//         Arrays.sort(arr,Collections.reverseOrder());
//         printArr(arr);
//     }

    

// }


//Counting Sort
// import java.util.*;
// public class sorting{
//     public static void countingSort(int arr[]){
//         int Largest=Integer.MIN_VALUE;
//         for(int i=0; i<arr.length ; i++){
//             Largest=Math.max(Largest,arr[i]);
//         }
//         int count[]=new int[Largest+1];
//         for(int i=0; i<arr.length; i++){
//             count[arr[i]]++;

//         }
//         //sorting
//         int j=0;
//         for(int i=0; i<count.length; i++){
//             while(count[i]>0){
//                 arr[j]=i;
//                 j++;
//                 count[i]--;

//             }
//         }
//     }
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
//     public static void main(String args[]){
//         int arr[]={1,4,1,3,2,4,3,7};
//         countingSort(arr);
//         printArr(arr);

//     }
// }



///DIVIDE AND CONQUER

//MERGE SORT
// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0 ; i<arr.length ; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void mergeSort(int arr[] , int si , int ei){
//         //base case
//         if(si>=ei){
//             return;
//         }
//         ///kaam
//         int mid=si+(ei-si)/2;   ///or si+ei/2
//         mergeSort(arr , si , mid); ///left part
//         mergeSort(arr , mid+1, ei);  ///right part

//         merge(arr , si , mid , ei );
//     }
//     //merge method to merge the sorted parts
//     public static void merge(int arr[] , int si , int mid , int ei){
//         int temp[]=new int[ei-si+1];
//         int i=si; //iterator for left part
//         int j=mid+1;  //iterator for right part
//         int k=0;  //iterator for temp  array

//         while(i<=mid && j<=ei){
//             if(arr[i]<arr[j]){
//                 temp[k]=arr[i];
//                 i++;
//             }else{
//                 temp[k]=arr[j];
//                 j++;
//             }
//             k++;
//         }
//         //for leftover elements of 1st sorted part
//         while(i<=mid){
//             temp[k++]=arr[i++];
//         }
//         //for leftover elements of 2md sorted parts
//         while(j<=ei) {
//             temp[k++]=arr[j++];
//         }
//         //copy temp to original array
//         for(k=0 , i=si ; k<temp.length; k++ ,  i++){
//             arr[i]=temp[k];

//         }
//     }
//     public static void main(String args[]){
//         int arr[]={6,3,9,5,2,8};
//         mergeSort(arr , 0 , arr.length-1);
//         printArr(arr);

//     }
// }


///QUICK SORT

// public class sorting{
//     public static void printArr(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }
//     public static void quickSort(int arr[] , int si , int ei){
//         //base case
//         if(si>=ei){
//             return;
//         }
//         //last element
//         int pIdx=partition(arr , si , ei);
//         quickSort(arr , si , pIdx-1); //left 
//         quickSort(arr , pIdx+1 , ei);  //right
//     }
//     public static int partition(int arr[], int si , int ei){
//         int pivot = arr[ei];
//         int i= si-1; ///to make place for element smaller than pivot
//         for(int j=si; j<ei; j++){
//             if(arr[j]<=pivot){
//                 i++;
//                 //swap
//                 int temp=arr[j];
//                 arr[j]=arr[i];
//                 arr[i]=temp;
//             }

//         }
//         //pivot at right pos
//         i++;
//         int temp=pivot;
//         arr[ei]=arr[i];
//         arr[i]=temp;
//         return i;
//     }
//     public static void main(String args[]){
//         int arr[]={6,3,9,8,2,5};
//         quickSort(arr , 0 , arr.length-1);
//         printArr(arr);
//     }

// }



///ROTATED SEARCH ARRAY4
// public class sorting{
//     public static int rotatedsearch(int arr[], int tar , int si , int ei){
//         if(si>ei){
//             return -1;
//         }
//         //kaam
//         int mid=si+(ei-si)/2;
//         //case found
//         if(arr[mid]==tar){
//             return mid;
//         }
//         //mid on l1
//         if(arr[si]<=arr[mid]){
//             //case a:left
//             if(arr[si]<=tar && tar<=arr[mid]){
//                 return rotatedsearch(arr, tar , si , mid-1);
//             }else{
//                 //caseb:right
//                 return rotatedsearch(arr, tar , mid+1 , ei);
//             }

//         }
//         //mid on l2
//         else{
//             //case c:right
//             if(arr[mid]<=tar && tar<=arr[ei]){
//                 return rotatedsearch(arr , tar , mid+1 , ei);
//             }else{
//                 ///case d: left
//                 return rotatedsearch(arr, tar , si , mid-1);
//             }

//         }
//     }
//     public static void main(String args[]){
//         int arr[]={4,5,6,7,0,1,2};
//         int target=0;
//         int tarIdx=rotatedsearch(arr , target , 0 , arr.length-1);
//         System.out.println(tarIdx);
//     }
// }





