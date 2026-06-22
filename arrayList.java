///ARRAY LIST

import java.util.ArrayList;
import java.util.Collections;


//ARRAYLIST OPERATIONS

// public class arrayList{
//     public static void main(String args[]){
//         ///ClassName objectName = new ClassName();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<String> list2= new ArrayList<>();
//         ArrayList<Boolean> list3= new ArrayList<>();


//         //add operation on arraylist
//         list1.add(1);      ///TC-->O(1)
//         list1.add(2);
//         list1.add(3);
//         list1.add(4);
//         list1.add(1,9);

//         System.out.println(list1);


//         ///GET OPERATION
//         int element=list1.get(2);     ///O(1)
//         System.out.println(element);

//         //DElete                  ///O(n)
//         list1.remove(3);
//         System.out.println(list1);


//         ///SET element at index----------> O(n)

//         list1.set(2,10);
//         System.out.println(list1);


//         System.out.println(list1.size());


//         //print the arraylist
//         for(int i=0; i<list1.size(); i++){
//             System.out.print(list1.get(i) + " ");
//         }
//         System.out.println();



//         ////REVERSE THE ELEMENT
//         for(int i=list1.size()-1; i>=0; i--){
//             System.out.print(list1.get(i)+" ");
//         }
//         System.out.println();




        



//     }
// }


///FIND THE MAXIMUM ELEMENT FROM ARRAYLIST
///tc-->O(n)


// public static void main(String args[]){
//     ArrayList<Integer> list= new ArrayList<>();
//     list.add(2);
//     list.add(5);
//     list.add(9);
//     list.add(6);
//     list.add(8);


//     int max=Integer.MIN_VALUE;
//     for(int i=0; i<list.size(); i++){
//         // if(max<list.get(i)){
//         //     max=list.get(i);
//         // }

//         max=Math.max(max, list.get(i));
//     }
//     System.out.println("max element="+ max);




// }


///SWAPING IN ARRAYLIST


// public class arraylist{
//     public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
//         int temp=list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         int idx1=1 , idx2=3;
//         System.out.println(list);
//         Swap(list, idx1, idx2);
//         System.out.println(list);
//     }
// }


//SORTING IN ARRAYLIST

// public class arrayList{
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);

//         System.out.println(list);
//         Collections.sort(list);    ///ascending order
//         System.out.println(list);

//         ///descending
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println(list);

        
//     }
// }


//multidimensional ARRAYLIST


// public class arrayList{

//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
//         ArrayList<Integer> list= new ArrayList<>();
//         list.add(1); list.add(2);
//         mainList.add(list);

//         ArrayList<Integer> list2= new ArrayList<>();
//         list2.add(3); list2.add(4);
//         mainList.add(list2);
        
//         for(int i=0; i<mainList.size(); i++){
//             ArrayList<Integer> currList=mainList.get(i);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j)+" ");
//             }
//             System.out.println();
//         }
//          System.out.println(mainList);






//     }
    

// }



///list1: 1 2 3 4 5
///list2 : 2 4 6 8 10
///list3 : 3 6 9 12 15




// public class arrayList{
//     public static void main(String args[]){
//         ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
//         ArrayList<Integer> list1=new ArrayList<>();
//         ArrayList<Integer> list2=new ArrayList<>();
//         ArrayList<Integer> list3=new ArrayList<>();

//         for(int i=1; i<=5; i++){
//             list1.add(i*1);  ///1 , 2, 3, 4, 5
//             list2.add(i*2);   ///2 4 6 8 10
//             list3.add(i*3);   ////3 6 9 12 15
//         }

//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);

//         System.out.println(mainList);



//         ///nested Loops
//         for(int i=0; i<mainList.size(); i++){
//             ArrayList<Integer> currList=mainList.get(i);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j)+ " ");
//             }
//             System.out.println();

//         }

//     }
// }



///CONTAINER WITH MAXIMUM WATER
//brute force


// public class arrayList{
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater=0;
//         //brute force
//         for(int i=0; i<height.size(); i++){
//             for(int j=i+1; j<height.size(); j++){
//                 int ht=Math.min(height.get(i), height.get(j));
//                 int width=j-i;
//                 int currWater=ht*width;
//                 maxWater=Math.max(maxWater, currWater);
//             }

//         }
//         return maxWater;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> height = new ArrayList<>();
//         ///1 , 8 , 6 , 2 , 5 , 4 , 8 , 3 , 7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storeWater(height));

//     }
// }




///2 POINTER APPROACH
//choti height waterlevel  ko control krti hai toh hum usee heee change karenge



// public class arrayList{
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater=0;
//         int lp=0;
//         int rp=height.size()-1;
//         while(lp < rp){
//             //calculate water area
//             int ht=Math.min(height.get(lp), height.get(rp));
//             int width=rp-lp;
//             int currWater=ht*width;
//             maxWater=Math.max(maxWater, currWater);

//             //update pointer'
//             if(height.get(lp)<height.get(rp)){
//                 lp++;
//             }else{
//                 rp--;
//             }

//         }
//         return maxWater;
//     }
//      public static void main(String args[]){
//         ArrayList<Integer> height = new ArrayList<>();
//         ///1 , 8 , 6 , 2 , 5 , 4 , 8 , 3 , 7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);
//         System.out.println(storeWater(height));
// }

// }




//PAIR SUM-1;

//brute force-->all possible pair--->O(N^2)


// public class arrayList{
//     public static boolean pairSum1(ArrayList<Integer> list , int target){
//         for(int i=0; i<list.size(); i++){
//             for(int j=i+1; j<list.size(); j++){
//                 if(list.get(i) + list.get(j)==target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list= new ArrayList<>();
//         //1 , 2 3, 4 , 5 ,6
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target=5;
//         System.out.println(pairSum1(list, target));
//     }
// }


//2 POINTER APPROACH

// public class arrayList{
//     public static boolean pairSum1(ArrayList<Integer> list , int target){
//         int lp=0;
//         int rp=list.size()-1;
//         while(lp!=rp) {
//             //case - 1;
//             if(list.get(lp)+list.get(rp)==target){
//                 return true;
//             }
//             //case-2
//             if(list.get(lp)+list.get(rp)<target){
//                 lp++;
//             }else{
//                 rp--;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         //1 , 2 , 3 , 4 , 5 , 6
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
//         int target =5;
//         System.out.println(pairSum1(list, target));
//     }
// }





///PAIR SUM-2

public class arrayList{
    public static boolean pairSum2(ArrayList<Integer> list , int target){
        int bp=-1;
        int n=list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>list.get(i+1)){   ///breaking point
                bp=i;
                break; 
            }
        }
        int lp=bp+1;   //smallest
        int rp=bp;    //largest

        while(lp!=rp){
            //case1
            if(list.get(lp)+ list.get(rp)==target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1) % n;
            }else{
                //case3
                rp=(n+rp-1) % n;
            }
        }

        return false;

    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        ///11 , 15 , 6 ,8 , 9 , 10--sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=16;
        System.out.println(pairSum2(list, target));
    }
}
