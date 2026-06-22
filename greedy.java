//ACTIVITY SELECTION

import java.util.*;
// public class greedy{
//     public static void main(String args[]){
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};
//         //end time basis sorted
//         int maxAct=0;
//         ArrayList<Integer> ans = new ArrayList<>();
//         //fisrt activity
//         maxAct=1;
//         ans.add(0);
//         int lastEnd=end[0];
//         for(int i=1; i<end.length;i++){
//             if(start[i]>=lastEnd){
//                 maxAct++;
//                 ans.add(i);
//                 lastEnd=end[i];
//             }
//         }
//         System.out.println("max activities =" + maxAct);
//         for(int i=0; i<ans.size(); i++){
//             System.out.print("A"+ans.get(i)+" ");
//         }
//         System.out.println();

//     }
// }
///-----------------------------------------------------------

///WHEN NOT SORTED --> Unsorted activity given

// public class greedy{
//     public static void main(String args[]){
//         int start[]= {1,3,0,5,8,5};
//         int end[]={2,4,6,7,9,9};
//         ///sorting
//         int activities[][]= new int[start.length][3];
//         for(int i=0; i<start.length; i++){
//             activities[i][0]=i;
//             activities[i][1]=start[i];
//             activities[i][2]=end[i];
//         }
//         //lambda function
//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
//         ArrayList<Integer> ans = new ArrayList<>();
//         int maxAct=0;
//         //1st activity
//         maxAct=1;
//         int lastEnd=activities[0][2];
//         ans.add(activities[0][0]);
//         for(int i=1; i<end.length; i++){
//             if(activities[i][1]>=lastEnd){
//                 maxAct++;
//                 lastEnd=activities[i][2];
//                 ans.add(activities[i][0]);
//             }
//         }
//         System.out.println("maximum activities = "+ maxAct);
//         for(int i=0; i<ans.size(); i++){
//             System.out.print("A"+ans.get(i)+" ");
//         }
//         System.out.println();

        
       

//     }
// }

///------------------------------------------------

// FRACTIONAL KNAPSACK

// public class greedy{
//     public static void main(String args[]){
//        int val[]={60, 100, 120};
//        int weight[]={10,20,30};
//        int W=50;
//        double ratio[][]=new double[val.length][2];
//        //0th-->idx ; 1st-->ratio
//         for(int i=0; i<val.length; i++){
//             ratio[i][0]=i;
//             ratio[i][1]=val[i]/(double)weight[i];
//         }
//         //ascending sorting
//         Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
//         int capacity = W;
//         int finalValue=0;
//         for(int i=ratio.length-1; i>=0; i--){
//             int idx = (int)ratio[i][0];
//             if(capacity>=weight[idx]){
//                 finalValue+=val[idx];
//                 capacity-=weight[idx];
//             }else{
//                 //include fractional val
//                 finalValue+=(ratio[i][1]*capacity);
//                 capacity =0;
//                 break;
//             }
//         }
//         System.out.println("result =" + finalValue);
//     }
// }
// ---------------------------------------

 ///MINIMUM ABSOLUTE DIFFEREBCE

// public class greedy{
//     public static void main(String args[]){
//         int A[]={1,2,3};
//         int B[]={2,1,3};
//         Arrays.sort(A);
//         Arrays.sort(B);
//         int minDiff=0;
//         for(int i=0; i<A.length; i++){
//             minDiff+=Math.abs(A[i]-B[i]);
//         }
//         System.out.println("Min absolute difference  of pairs = " + minDiff);
//     }
// }

///----------------------------------------------------------------
// MAXIMUM LENGTH CHAIN OF PAIRS

// public class greedy{
//     public static void main(String args[]){
//         int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
//         Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
//         //fist pair
//         int chainLen =1;
//         int chainEnd=pairs[0][1]; ///last selected pair end //chain end
//         for(int i=1; i<pairs.length; i++){
//             if(pairs[i][0]>chainEnd){
//                 chainLen++;
//                 chainEnd=pairs[i][1];
//             }

//         }
//         System.out.println("Maximum length of chain="+ chainLen);


//     }
// }

////------------------------------------------------------------------------

///INDIAN COINS

// public class greedy{
//     public static void main(String args[]){
//         Integer coins[]={1,2,5,10,20,50,100,500,2000};
//         Arrays.sort(coins, Comparator.reverseOrder());
//         int countOfCoins=0;
//         int amount=590;
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i=0; i<coins.length; i++){
//             if(coins[i]<=amount){
//                 while(coins[i]<=amount){
//                     countOfCoins++;
//                     ans.add(coins[i]);
//                     amount-=coins[i];
//                 }
//             }
//         }
//         System.out.println("total min coin are =" + countOfCoins);
//         for(int i=0; i<ans.size(); i++){
//             System.out.print(ans.get(i)+" ");
//         }
//         System.out.println();


//     }
// }

//--------------------------------------------------------------------------------

//JOB SEQUENCING

// public class greedy{
//     static class Job{
//         int deadline;
//         int profit;
//         int id; //0(A),1(B), 2(C)..

//         public Job(int i, int d, int p){
//             id=i;
//             profit=p;
//             deadline=d;   
//         }
//     }
//     public static void main(String args[]){
//         int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
//         ArrayList<Job> jobs= new ArrayList<>();
//         for(int i=0; i<jobsInfo.length; i++){
//             jobs.add(new Job(i,jobsInfo[i][0], jobsInfo[i][1]));
//         }
//         Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
//         ArrayList<Integer> seq = new ArrayList<>();
//         int time=0;
//         for(int i=0; i<jobs.size(); i++){
//             Job curr=jobs.get(i);
//             if(curr.deadline>time){
//                 seq.add(curr.id);
//                 time++;
//             }
//         }
//         System.out.println("max jobs"+seq.size());
//         for(int i=0; i<seq.size(); i++){
//             System.out.println(seq.get(i)+" ");
//         }
//         System.out.println();

//     }
// }

//--------------------------------------------------------------
///BEST TIME TO BUY AND SELL
// -------------------------------------------------------------
//chocola problem
import java.util.*;
public class greedy{
    public static void main(String args[]){
        int n=4, m=6;
        Integer costVer[]={2,1,3,1,4};
        Integer costHor[]={4,1,2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0,v=0;
        int hp=1, vp=1;
        int cost=0;
        while(h<costHor.length && v<costVer.length){
            //vertical cost<horizontal cost
            if(costVer[v]<=costHor[h]){
                //hori cut
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }else{
                //ver cut
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }
        //remain horizontal
        while(h<costHor.length){
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        //remaining vertical
        while(v<costVer.length){
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println(cost);
    }
}
