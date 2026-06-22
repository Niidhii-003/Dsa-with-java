//creation of array

// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         int marks[]= new int[50];
//         int numbers[]={10, 12 , 90};
//         String fruits[]={"apple" , "mango","litchi"};
//     }
// }


//input/output in array

// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         //input
//         int marks[]=new int[50];
//         Scanner sc= new Scanner(System.in);
//         marks[0]=sc.nextInt();
//         marks[1]=sc.nextInt();
//         marks[2]=sc.nextInt();
//         marks[3]=sc.nextInt();

//         //output
//         System.out.println("physics marks: "+ marks[0]);
//         System.out.println("chemistry marks: " + marks[1]);
//         System.out.println("Maths marks :" + marks[2]);
//         System.out.println("english marks :" + marks[3]);
//         System.out.println("array length " + marks.length);
        
//         //updation of marks
//         marks[2]=100;
//         System.out.println("maths marks: " + marks[2]);

//         int percentage=(marks[0]+marks[1]+marks[2]+marks[3])/4;
//         System.out.println("percentage= "+percentage + "%");



//     }
// }

//passing arryas as arguments
// import java.util.*;
// public class array{
//     public static void update(int marks[]){
//         for(int i=0; i<marks.length; i++){
//             marks[i]=marks[i]+1;

//         }
//     }
//     public static void main(String args[]){
//         int marks[]={97,98,100};
//         update(marks);
//         //printing marks instead od writng sos marks[0] ,ssos marks[1]and so on we can write bellow
//         for(int i=0; i<marks.length; i++){
//             System.out.print(marks[i]+ " ");
//         }
//         System.out.println();
//     }
// }

//LINEAR SEARCH ARRAY
// import java.util.*;
// public class array{
//     public static int linearSearch(int numbers[] , int key){
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[]={2,5,7,10,12,14,16};
//         int key=10;
//         int index=linearSearch(numbers, key);
//         if(index==-1){
//             System.out.println("NOT FOUND");
//         }else{
//             System.out.println("key is at index: " + index);
//         }
//     }
// }


// import java.util.*;
// public class array{
//     public static int linearSearch(String menu[] , String key){
//         for(int i=0; i<menu.length; i++){
//             if(menu[i].equals(key)){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         String menu[]={"dosa","samosa","sambhar","burger","pizza"};
//         String key="samosa";
//         int index=linearSearch(menu, key);
//         if(index==-1){
//             System.out.println("NOT FOUND");
//         }else{
//             System.out.println("key is at index: " + index);
//         }
//     }
// }

//largest number in linear search

// import java.util.*;
// public class array{
//     public static int getLargest(int numbers[]){
//         int largest=Integer.MIN_VALUE;  //minus infity
//         for(int i=0 ; i<numbers.length; i++){
//             if(largest<numbers[i]){
//                 largest=numbers[i];

//             }
//         }
//         return largest;
        
//    }

//    public static void main(String args[]){
//     int numbers[]={1,2,6,3,5};
//     System.out.println("LARGEST VALUE IS:" + getLargest(numbers));

//    }



// }


//SMALLEST NUMBER IS LINEAR SEARCH

// import java.util.*;
// public class array{
//     public static int getSmallest(int numbers[]){
//         int smallest=Integer.MAX_VALUE;
//         for(int i=0; i<numbers.length;i++){
//             if(smallest>numbers[i]){
//                 smallest=numbers[i];
//             }
//         }
//         return smallest;
//     }
//     public static void main(String args[]){
//         int numbers[]={1,3,6,7,2,8};
//         System.out.println("SMALLEST NUMBER IS : " + getSmallest(numbers));
//     }
// }


//BINARY SEARCH ARRAY

// import java.util.*;
// public class array{
//     public static int binarySearch(int numbers[], int key){
//         int start=0, end=numbers.length-1;
//         while(start<=end){
//             int mid=(start+end)/2;
//             //comparisons
//             if (numbers[mid]==key){
//                 return mid;
//             }
//             if(numbers[mid]<key){//right
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[]={1,4,6,8,10,12,14};
//         int key=10;
//         System.out.println("index at: " + binarySearch(numbers , key));
//     }
// }

//REVERSE AN ARRAY
// import java.util.*;
// public class array{
//     public static void reverse(int numbers[]){
//         int start=0; 
//         int end=numbers.length-1;
//         while(start<end){ //why not equal to because when st=ed then swap by itslef no need
//             //swap
//             int temp=numbers[end];
//             numbers[end]=numbers[start];
//             numbers[start]=temp;
//             start++;
//             end--;
//         }
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         reverse(numbers);
//         for(int i=0 ;i<numbers.length;i++){
//             System.out.print(numbers[i] + " ");

//         }
//         System.out.println();
        

//     }
// }


//pairs in array

// import java.util.*;
// public class array{
//     public static void printPairs(int numbers[]){
//         int tp=0;
//         for(int i=0 ; i<numbers.length; i++){
//             int curr=numbers[i];  //2,4/6,8,10
//             for(int j=i+1 ; j<numbers.length ; j++){
//                 System.out.print("("+ curr + ", " + numbers[j] + ") ");
//                 tp++;
//             }
//             System.out.println();
            
              
//         }
//         System.out.println("total pairs :" + tp);
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         printPairs(numbers);
//     }
// }


//PRINT SUBARRAY
//PEHLA NUMBER UTHAO DUSRA UTHAO THE UNKE BEECHE KE SAARE ELEMENTS PRINT KRDO

// import java.util.*;
// public class array{
//     public static void printSubarray(int numbers[]){
//         int ts=0;
//         for(int i=0 ; i<numbers.length ; i++){
//             int start=i;
//             for(int j=i ; j<numbers.length;j++){
//                 int end=j;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(numbers[k]+" "); //subarray

//                 }
//                 ts++;
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println("total subarrays= "+ts);
//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         printSubarray(numbers);

//     }
// }



//MAXIMUM SUBARRAY SUMM by brute force
// import java.util.*;
// public class array{ 
//     public static void printMaxSubarraySum(int numbers[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length ; i++){
//             int start=i;
//             for(int j=i ; j<numbers.length;j++){
//                 int end=j;
//                 currSum=0;
//                 for(int k=start ; k<=end;k++){
//                     currSum+=numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }
//             }


//         }
//         System.out.println("max sum= "+maxSum);

//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         printMaxSubarraySum(numbers);
//     }
// }


//MAXIMUM SUBARRAY SUM BY PREFIX METHOD

// import java.util.*;

// public class array{ 
//     public static void printMaxSubarraySum(int numbers[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         int prefix[]=new int[numbers.length];
//         prefix[0]=numbers[0];

//         //calculation of prefix
//         for(int i=1; i<prefix.length; i++){
//             prefix[i]=prefix[i-1] + numbers[i];
//         }


//         for(int i=0; i<numbers.length ; i++){
//             int start=i;
//             for(int j=i ; j<numbers.length; j++){
//                 int end=j;
                
//                 currSum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
//                 if(maxSum<currSum){
//                     maxSum=currSum;
//                 }
//             }


//         }
//         System.out.println("max sum= "+maxSum);

//     }
//     public static void main(String args[]){
//         int numbers[]={2,4,6,8,10};
//         printMaxSubarraySum(numbers);
//     }
// }    


///KEDANES ALGORITHM FOR MAX SUM SUBARRAY
// public class array{
//     public static void kadanes(int numbers[]){
//         int ms=Integer.MIN_VALUE;
//         int cs=0;
//         for(int i=0; i<numbers.length ; i++){
//             cs = cs + numbers[i];
//             if(cs<0){
//                 cs=0;
//             }

//             ms=Math.max(cs , ms);
//         }
//         System.out.println("OUR MAXIMUM SUBARRAY SUM IS : "+ ms);
//     }

//     public static void main(String args[]){
//         int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//         kadanes(numbers);
//     }
// }


//TRAPPING RAINWATER
// import java.util.*;
// public class array{
//     public static int trappedRainWater(int height[]){
//         int n=height.length;
//         //calculate left max boundary-array
//         int leftMax[]=new int[height.length];
//         leftMax[0]=height[0];
//         for(int i=1; i<height.length; i++){
//             leftMax[i]=Math.max(height[i] , leftMax[i-1]);
//         }

//         //calculate right max boundary-array
//         int rightMax[]= new int[n];
//         rightMax[n-1]=height[n-1];
//         for(int i=n-2 ; i>=0; i--){
//             rightMax[i]=Math.max(height[i], rightMax[i+1]);
//         }

//         int trappedWater=0;

//         //loop
//         for (int i=0 ; i<n; i++){
//              //water level =min(leftmax bound , rightmax bound)
//            int waterLevel=Math.min(leftMax[i] , rightMax[i]);
//             //trapped water=waterlevel-height
//            trappedWater+=waterLevel-height[i];
//         }
//         return trappedWater;
       
        

//     }



//     public static void main(String args[]){
//         int height[]={4,2,0,6,3,2,5};
//         System.out.println(trappedRainWater(height));
//     }
// }


//buy & sell stocks

// import java.util.*;
// public class array{
//     public static int buyAndSellStocks(int prices[]){
//         int buyPrice=Integer.MAX_VALUE;
//         int maxProfit=0;
//         for(int i=0 ; i<prices.length ; i++){
//             if(buyPrice<prices[i]){
//                 int profit=prices[i]-buyPrice; //todays profit
//                 maxProfit=Math.max(maxProfit , profit);
//             }else{
//                 buyPrice=prices[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String args[]){
//         int prices[]={7,1,5,3,6,4};
//         System.out.println(buyAndSellStocks(prices));


//     }
// }




///2-DIMENSIONAL ARRAY
//Creation of 2-D Array


// import java.util.*;
// public class Matrices{
//     public static void main(String args[]){
//         int matrix[][]=new int[3][3];
//         int n=3 , m=3; //or n=matrix.length , m=matrix[0].length
//         Scanner sc= new Scanner(System.in);
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j]=sc.nextInt();

//             }
//         }
//         //output
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }


//SEARCH OF KEY IN 2-D 
// import java.util.*;  
// public class array{
//     public static boolean Search(int matrix[][], int key){
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(matrix[i][j]==key){
//                     System.out.println("found at shell ("+ i + "," + j + ")");
//                     return true;
//                 }
//             }
//         }
//         System.out.println("key not found");
//         return false;
//     }
//     public static void main(String args[]){
//         int matrix[][]= new int[3][3];
//         int n = matrix.length , m=matrix[0].length;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 matrix[i][j]=sc.nextInt();
//             }

//         }
//         //output
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//         Search(matrix, 5);
//     }
// }



//SPIRAL MATRIX
// import java.util.*;
// public class array{
//     public static void PrintSpiral(int matrix[][]){
//         int startRow=0;
//         int startCol=0;
//         int endRow=matrix.length-1;
//         int endCol=matrix[0].length-1;
//         while(startRow<=endRow && startCol<=endCol){
//             //top
//             for(int j=startCol; j<=endCol; j++){
//                 System.out.print(matrix[startRow][j]+" ");
//             }
//             //right
//             for(int i=startRow+1; i<=endRow ; i++){
//                 System.out.print(matrix[i][endCol]+" ");

//             }
//             //bottom
//             for(int j=endCol-1; j>=startCol; j-- ){
//                 if(startRow==endRow){
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j]+" ");

//             }
//             ///left 
//             for(int i=endRow-1 ; i>=startRow+1; i--){
//                 if(startCol==endCol){
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol]+" ");
//             }

//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;

//         }
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};
//         PrintSpiral(matrix);
        
        
//     }
// }


///DIAGONAL SUM
//BRUTE FORCE  time complexity==0(n^2)
// import java.util.*;
// public class array{
//     public static int DiagonalSum(int matrix[][]){
//         int sum=0;
//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[0].length; j++){
//                 if(i==j){
//                     sum += matrix[i][j];
//                 }
//                 else if(i+j==matrix.length-1){
//                     sum += matrix[i][j];
//                 }
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         int matrix[][]={{1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};
//         System.out.println(DiagonalSum(matrix));
//     }
// }

//OPTIMISED CODE
//TIME COMPLEXITY IS BIG OF N
// import java.util.*;
// public class array{
//     public static int DiagonalSum(int matrix[][]){
//         int sum=0;
//         for(int i=0; i<matrix.length; i++){
//             //primary diagonal
//             sum+=matrix[i][i];
//             //secondary diagonal
//             if(i!=matrix.length-1-i){
//                 sum+=matrix[i][matrix.length-i-1];
//             }

//         }
//         return sum;
//     }
//     public static void main(String args[]){
//          int matrix[][]={{1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};
//         System.out.println(DiagonalSum(matrix));
        
//     }
// }


//SEARCH IN SORTED MATRIX
//Time Complexity is O(n+m) n=row,m=column
import java.util.*;
public class array{
    public static boolean StairCaseSearch(int matrix[][], int key){
        int row=0, col=matrix[0].length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;

    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
        StairCaseSearch(matrix,key);

    }
}



