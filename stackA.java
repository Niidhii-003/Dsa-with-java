// import java.util.ArrayList;

//STACK IMPLEMNEATION USING ARRAYLIST

// public class stackA{
//     public static class Stack{
//         ///stack implementation using arraylist
//         static ArrayList<Integer> list = new ArrayList<>();
//         public static boolean isEmpty(){
//             return list.size()==0;
//         }

//         //push
//         public static void push(int data){
//             list.add(data);
//         }
//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size()-1);
            
//         }
        
//     }
//     public static void main(String args[]){
//             Stack s = new Stack();
//             s.push(1);
//             s.push(2);
//             s.push(3);
//             while(!s.isEmpty()){
//                 System.out.println(s.peek());
//                 s.pop();
//             }
//     }

// }


//--------------------------------------------------------------------


///STACK IMPLEMENTATION USING LINKEDLIST

import java.util.LinkedList;
// public class stackA {

//     public static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static class Stack {

//         static Node head = null;

//         // Check if stack is empty
//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // Push operation
//         public static void push(int data) {
//             Node newNode = new Node(data);

//             if (head == null) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         // Pop operation
//         public static int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         // Peek operation
//         public static int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }

//             return head.data;
//         }
//     }

//     public static void main(String args[]) {
//         Stack s = new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
///------------------------------------

//PUSH AT BOTTOM
// import java.util.*;
// public class stackA{
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s,data);
//         s.push(top);
//     }
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }


// }

//----------------------------------------------------------

// import java.util.*;
// public class stackA{
//     public static String reverseString(String str){
//         Stack<Character> s = new Stack<>();
//         int idx=0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }
//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()){
//             char curr=s.pop();
//             result.append(curr);
//         }
//         return result.toString();
        

//     }

//     public static void main(String args[]){
//         String str = "abc";
//         String result=reverseString(str);
//         System.out.println(result);

        
//     }
// }

///------------------------------------


//REVERSE A STACK


// import java.util.*;
// public class stackA{
//     public static void pushAtBottom(Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s,data);
//         s.push(top);
//     }

//     public static void reverseStack(Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s,top);
//     }

//     public static void printStack(Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String args[]){
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
        
//         reverseStack(s);
//         printStack(s);


//     }
// }


///--------------------------------------------------------------

// import java.util.*;
// public class StackA{
//     public static void stockSpan(int stocks[], int span[]){
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for(int i=1; i<stocks.length; i++){
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 span[i] = i+1;
//             }else {
//                 int prevHigh = s.peek();
//                 span[i]=i-prevHigh;
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String args[]){
//         int stocks[] = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks, span);

//         for(int i=0; i<span.length; i++){
//             System.out.println(span[i]+" ");
//         }
//     }
// }

////----------------------------------------------------------------------------

// import java.util.*;

// public class stackA{
//     public static void main(String args[]){
//         int arr[] = {6, 8, 0, 1, 3};
//         Stack<Integer> s = new Stack<>();
//         int nextGreater[] = new int[arr.length];

//         for(int i=arr.length-1; i>=0; i--){
//             //1while 
//             while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
//                 s.pop();
//             }
//             //2 if-else
//             if(s.isEmpty()){
//                 nextGreater[i]=-1;
//             }else{
//                 nextGreater[i]=arr[s.peek()];
//             }
//             //3 push in stack
//             s.push(i);
//         }
//         for(int i=0; i<nextGreater.length; i++){
//             System.out.print(nextGreater[i]+" ");
//         }
//         System.out.println();
//     }
// }


///---------------------------------------------------------

//VALID PARENTHESIS

// import java.util.*;

// public class stackA{
//     public static boolean isValid(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i=0; i<str.length(); i++){
//             char ch=str.charAt(i);
//             ///opeming
//             if(ch=='(' || ch=='{' || ch=='['){
//                 s.push(ch);
//             }else{
//                 //closing
//                 if(s.isEmpty()){
//                     return false;
//                 }
//                 if( (s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') || (s.peek()=='[' && ch==']') ){
//                     s.pop();
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         if(s.isEmpty()){
//             return true;
//         }else{
//             return false;
//         }
    
//     }
//     public static void main(String args[]){
//         String str = "(({}))[]";
//         System.out.println(isValid(str));
//     }
// }


///-----------------------------------------------------------

//DOUBLE PARENTHESEIS
// import java.util.*;
// public class stackA{
//     public static boolean isDuplicate(String str){
//         Stack<Character> s = new Stack<>();
//         for(int i=0; i<str.length(); i++){
//             char ch= str.charAt(i);            
//             //closing
//             if(ch==')'){
//                 int count=0;
//                 while(s.peek()!='('){
//                     s.pop();
//                     count++;
//                 }
//                 if(count<1){
//                     return true; //duplicate
//                 }else{
//                     s.pop(); //opening pair
//                 }
//             }
//             else{
//                 s.push(ch);
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         String str="((a+b))"; //trur
//         String str1="(a-b)"; //false
//         System.out.println(isDuplicate(str));
//         System.out.println(isDuplicate(str1));


//     }
// }

//----------------------------------------------

//MAXIMUM AREA OF HISTOGRAN

import java.util.*;
public class stackA{
    public static void maxArea(int arr[]){
        int maxArea=0;
        int nsr[]=new int[arr.length];
        int nsl[] = new int[arr.length];
        //Next smaller Right--j
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //Next smaller left==> i
        s = new Stack<>();
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //current area-->j-i-1=nsr-nsl-1
        for(int i=0; i<arr.length ; i++){
            int height = arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea= Math.max(currArea,maxArea);
        }
        System.out.println("maximum histogram area="+ maxArea);

    }

    public static void main(String args[]){
        int arr[] = {2,1,5,6,2,3};  //height in histogram
        maxArea(arr);
    }
}

