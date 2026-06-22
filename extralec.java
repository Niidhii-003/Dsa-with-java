////count sort


// public class extralec{
//     public static void countSort(int[] arr){
//         int n=arr.length;

//         int maxEle=0;

//         ///code to find largest elemnt 
//         for(int i=0; i<n; i++){
//             if(arr[i]>maxEle){
//                 maxEle=arr[i];
//             }
//         }
//         //create count of array
//         int[] countArr=new int[maxEle + 1];
//         ///store frequency
//         for(int i=0; i < n; i++){
//             countArr[arr[i]]++;
//         }
//         int currIdx=0;
//         for(int i=0; i<maxEle+1; i++ ){
//             for(int j=0; j<countArr[i]; j++){
//                 arr[currIdx]=i;
//                 currIdx++;
//             }
//         }
//     }
//     public static void main(String args[]){
//         int[] arr={4,3,1,6,9,5};
//         System.out.println("before sorting");
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
       
//         countSort(arr);
//         System.out.println("\n After Sorting:");
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }


// }


///MINIMUM ABOSUKTE DIFFERNEVCE OF ARRAY
//given an array of distinct integers arr, find all pairs of elements with the minimum absolute differenec of any two elements.












//2d arrays creation

// int[][] mat= new int[5][3];         //// 5 row and 3 columns

//row= mat.length
//col=mat[0].length
///iteration over row==> for(int r=0; r<mat.length; r++)
///iteration over column => for(int c=o; c<mat[0].length; c++)


///ROTATE MATRIX
///transpose then reverse
///IN TRANSPOSE-->row chnages to columns
//for transpose-->swap i and j

////pseudocode for transpose
//for(int r=0; r<mat.length-1; r++){
// for (int c=r+1; c<mat[0].length; c+=){
//     int temp=mat[r][c]
//     mat[r][c]=mat[c][r];
//     mat[c][r]=temp;
// }
// }


///transpose code

// public class extralec{
//     public static void transpose(int[][]matrix){
//         for(int r=0; r<matrix.length-1; r++){
//             for(int c=r+1; c<matrix.length; c++){
//                 int temp=matrix[r][c];
//                 matrix[r][c]=matrix[c][r];
//                 matrix[c][r]=temp;
//             }
//         }
//     }

//     public static void printMatrix(int[][] matrix){
//         for(int r=0; r<matrix.length; r++){
//             for(int c=0; c<matrix.length; c++){
//                 System.out.print(matrix[r][c]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){
//         int[][] matrix={{1,2,3},
//                         {4,5,6},
//                         {7,8,9},
//         };
//         System.out.println("Original Matrix");
//         printMatrix(matrix);

//         transpose(matrix);

//         System.out.println("Transposed Matrix");
//         printMatrix(matrix);


//     }
// }


////STRING QUESTIONS

//count vowels in string

// public class extralec{
//     public static int CountVowels(String s){
//         int count=0;
//         int n=s.length();
//         for(int i=0; i<n; i++){
//             if(isVowel(s.charAt(i))){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static boolean isVowel(char ch){
//         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U'){
//             return true;
//         }
//         else {
//             return false;
//         }
//     }

//     public static void main(String args[]){
//         String s = "Aarun";
//         System.out.println(CountVowels(s));
//     }
// }





///ANAGRAMS-->SAME CHARACTER AND SAME FREQUENCY


// public class extralec{
//     public static boolean isAnagram(String s, String t){
//         if(s.length()!=t.length())  return false;

//         HashMap<Character, Integer> m1=new HashMap<>();
//         HashMap<Character, Integer> m2=new HashMap<>();

//         for (int i=0; i<s.length(); i++){
//             m1.put(s.charAt(i), m1.getOrDefault(s.charAt(i), 0)+1);
//             m2.put(t.charAt(i), m2.getOrDefault(t.charAt(i), 0)+1);
//         }
//         return m1.equals(m2);
//     }

// }


///LEETCODE--->SINGLE NUMBER
////INPUT->[1,2,2,7,3,7,4,4,3]
///OUTPUT->[1]

// --->one approcah is by xor opertaion which i solved on leetcode


// public class extralec{
//     public static int SingleNumber(int nums[]){
//         for(int i=0; i<nums.length; i++){
//             boolean foundDuplicates=false;
//             for(int j=0; j<nums.length; j++){
//                 if(i!=j && nums[i]==nums[j]){
//                     foundDuplicates=true;
//                     break;
//                 }
//             }
//             if(! foundDuplicates){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int nums[]={5,5,7,4,8,4,8};
//         System.out.println(SingleNumber(nums));
//     }
// }



//single-||-->3 same and 1 different------->Time complexity is O(n2)
// import java.util.*;
// public class extralec {
//     public static int singleNumber(int nums[]) {
//         Arrays.sort(nums);
//         for(int i=0; i<nums.length; i++){
//             int count=0;
//             for(int j=0; j<nums.length; j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count==1){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int nums[]={1,1,1,6,2,2,2};
//         System.out.println(singleNumber(nums));
//     }
// }


///swapping of bits

// public class extralec{
//     public static void main(String args[]){
//         int a=10;
//         int b=30;

//         a=a^b;
//         b=a^b;
//         a=a^b;
//         System.out.println(a);
//         System.out.println(b);

//     }
// }


///converttt uppercase character to lower  case-->A(65) TO a(97))

///A| 0X20=>'a'

// import java.util.*;
// public class extralec{
//     public static void main(String args[]){
//         char ch='A';
//         char ans=(char) (ch| 0x20);
//         System.out.println(ans);
//     }
// }

///0x20 ==>32

// public class extralec{
//     public static void towerOfHanoi(int n, char A, char C, char B){
//         if(n==0)
//         return ;
//         towerOfHanoi(n-1, A, B,C);
//         System.out.println(A + " to " +C);
//         towerOfHanoi(n-1, B , C, A);
//     }
//     public static void main(String args[]){
//         towerOfHanoi(3, 'A', 'C', 'B');
//     }

// }



//MERGE SORT

// public class extralec{
//     static void merge(int arr[], int low, int mid, int high){
//         int n1=mid-low+1;  //number of left element
//         int n2= high-mid;  //number of element at right side

//         //Temporary array
//         int left[]=new int[n1];
//         int right[]=new int[n2];

//         //copy data into left[] and right[]
//         for(int i=0; i<n1; i++){
//             left[i]=arr[low+i];
//         }
//         for(int i=0; i<n2; i++){
//             right[i]=arr[mid+1+i];
//         }

//         int i=0, j=0, k=low;

//         //merge two subarrays
//         while(i<n1 && j<n2){
//             if(left[i]>=right[j]){
//                 arr[k++]=right[j++];

//             }else{
//                 arr[k++]=left[i++];
//             }
//         }
//         //copy remainigng eleemnt of left[] if any
//         while(i<n1){
//             arr[k++]=left[i++];
//         }
//         //copy remaining element of rightt[]if any
//         while(j<n2){
//             arr[k++]=right[j++];
//         }
//     }
//     public static void mergeSort(int arr[], int low , int high){
//         if(low<high){
//             int mid=(low+high)/2;
//             mergeSort(arr, low , mid);
//             mergeSort(arr, mid+1, high);
//             merge(arr, low, mid, high);
//         }
//     }
//     public static void main(String args[]){
//         int arr[]={7,4,3,2,8};
//         mergeSort(arr, 0 , arr.length-1);
//         for(int num:arr){
//             System.out.print(num+" ");

//         }
        
//     }
// }


///majority element
public class extralec{
    public static int majorityElement(int nums[]){
        int n=nums.length;
        int count=1;
        int res=nums[0];
        for(int i=1; i<n; i++){
            if (nums[i]==res){
                count++;
            }else {
                count--;
                if(count==0){
                    count=1;
                    res=nums[i];
                }
            }
        }
        return res; 
    }
    public static void main(String args[]){
        int nums[]={3,2,3};
        System.out.println(majorityElement(nums));
    }
}


///INVERSION COUNT OF ARRRAY
//CONDITION-->arr[i]>arr[j]