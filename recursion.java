//PRINT NUMBERS FROM N TO 1(DECREASING ORDER)


// public class recursion{
//     public static void printDec(int n){
//         if(n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         printDec(n-1);
//     }
//     public static void main(String args[]){
//         int n=10;
//         printDec(n);
//     }
    
// }


///PRINT NUMBERS FROM 1 TO N(INCREASING ORDER)


// public class recursion{
//     public static void printInc(int n){
//         if(n==1){
//             System.out.print(n);
//             return;
//         }
//         printInc(n-1);
//         System.out.print(n + " ");
        
//     }
//     public static void main(String args[]){
//         int n = 10;
//         printInc(n);


//     }
// }



///PRINT FACTORIAL OF A NUMBER N

// public class recursion{
//     public static int fact(int n){
//         if(n==0){
//             return 1;
//         }
//         int fn = n* fact(n-1);
//         return fn;
//     }

    
//     public static void main(String args[]){
//         int n=5;
//         System.out.println(fact(n));

//     }
// }

//PRINT SUM OF N NATURAL NUMBERS

// public class recursion{
//     public static int calcSum(int n){
//         if(n==1){
//             return 1;
//         }
//         int sum=calcSum(n-1);
//         int sn=n+sum;
//         return sn;
//     }
//     public static void main(String args[]){
//         int n=5;
//         System.out.println(calcSum(n));
//     }
// }


// CALCULATE NTH TERM FIBONACCI SERIES

//time complexity is 2^n

// public class recursion{
//     public static int fib(int n){
//         if(n==0 || n==1){
//             return n;
//         }
//         int fnm1=fib(n-1);
//         int fnm2=fib(n-2);
//         int fn=fnm1+fnm2;
//         return n;
//     }
//     public static void main(String args[]){
//         int n=5;
//         System.out.println(fib(n));
//     }
// }

//CHECK IF A GIVEN ARRAY IS SORTED OR NOT

///time complexity is O(n)

// public class recursion{
//     public static boolean isSorted(int arr[], int i){
//         if(i==arr.length-1){
//             return true;
//         }
//         if(arr[i]>arr[i+1]){
//             return false;
//         }
//         return isSorted(arr , i+1);
//     }
//     public static void main(String args[]){
//         int arr[]={1,2,3,5,6};
//         System.out.println(isSorted(arr, 0));

//     }
// }



///WAF TO FIND THE FIRST OCCURENCE OF AN ELEMENT IN AN ARRAY


// public class recursion{
//     public static int firstOccurence(int arr[], int key , int i){
//         if(i==arr.length){
//             return -1;
//         }
//         if(arr[i]==key){
//             return i;
//         }
//         return firstOccurence(arr, key, i+1);
//     }
//     public static void main(String args[]){
//         int arr[]={8,3,6,9,5,10,2,5,3};
//         System.out.println(firstOccurence(arr,5,0 ));
//     }
// }


///WAP TO FIND THE LAST OCCURENCE OF AN ELEMENT IN AN ARRAY


// public class recursion{
//     public static int lastOccurence(int arr[], int key , int i){
//         if(i==arr.length){
//             return -1;
//         }
//         int isFound=lastOccurence(arr, key , i+1);
//         if(isFound ==-1 && arr[i]==key){
//             return i;
//         }
//         return isFound;
//     }
//     public static void main(String args[]){
//         int arr[]={8,3,6,9,5,10,2,5,3};
//         System.out.println(lastOccurence(arr, 5, 0));
//     }
// }


///WAP TO PRINT X TO POWER N
///x to the power n---> x^n


// public class recursion{
//     public static int power(int x , int n){
//         if(n==0){
//             return 1;
//         }
//         // int xnm1=power(x , n-1);
//         // int xn = x * xnm1;
//         // return xn;
//         return x* power(x , n-1);
//     }
//     public static void main(String args[]){
//         System.out.println(power(2 , 10));
//     }
// }


////OPTIMIZED POWER----->TIME COMPLEXITY---->O(n)

// public class recursion{
//     public static int optimisedPower(int a , int n){
//         if(n==0){
//             return 1;
//         }
//         int halfPowerSq=optimisedPower(a , n/2)* optimisedPower(a , n/2);
//         //above can be wriiten as below also
//         // int halfPower=optimisedPower(a , n/2);
//         // int halfPowerSq=halfPower * halfPower;

//         //n is odd
//         if(n%2!=0){
//             halfPowerSq= a * halfPowerSq;
//         }
//         return halfPowerSq;
//     }
//     public static void main(String args[]){
//         int a=2;
//         int n=10;
//         System.out.println(optimisedPower(2,10));
//     }
// }


///TIILING PROBLEM

// public class recursion{
//     public static int tiilingProblem(int n){ ///2Xn (floor size)
//     //base case
//     if(n==0 || n==1){
//         return 1;
//     }
//     //kaam
//     //vertical choice
//     int fnv=tiilingProblem(n-1);

//     //horizontal choice
//     int fnh=tiilingProblem(n-2);
//     int totalWays=fnv + fnh;
//     return totalWays;
//     }
//     public static void main(String args[]){
//         System.out.println(tiilingProblem(3));
//     }
      

// }


///REMOVE DUPLICATES IN A STRING

// public class recursion{
//     public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
//     if(idx==str.length()){
//         System.out.println(newStr);
//         return;
//     }
//     //kaam
//     char currChar = str.charAt(idx);
//     if(map[currChar-'a']==true){
//         ///duplicates
//         removeDuplicates(str,idx+1 , newStr , map);
//     }else {
//         map[currChar-'a']=true;
//         removeDuplicates(str , idx+1 , newStr.append(currChar),map);
//     }
// }
// public static void main(String args[]){
//     String str="apnnacollege";
//     removeDuplicates(str , 0 , new StringBuilder("") , new boolean[26]);
// }
// }



///FRIENDS PAIR PROBLEM

// public class recursion{
//     public static int friendsPair(int n ){
//         if(n==1 || n==2){
//             return n;
//         }
//         //choice

//         //single
//         int fn1=friendsPair(n-1);
//         //pair
//         int fn2=friendsPair(n-2);
//         int pairways=(n-1)*fn2;

//         //totalways
//         int totalWays=fn1 +pairways;
//         return totalWays;
//     }
//     public static void main(String args[]){
//         System.out.println(friendsPair(3));
//     }
// }



//print binary string with no consecytive one
// public class recursion{
//     public static void binaryString(int n , int lastPlace , String str){
//         ///base case
//         if(n==0){
//             System.out.println(str);
//             return;
//         }
//         ///kaam
//         binaryString(n-1 , 0 , str+"0");
//         if(lastPlace==0){
//             binaryString(n-1 , 1 , str+"1");
//         }

//     }
//     public static void main(String args[]){
//         binaryString(3 , 0 , "");
//     }
// }
