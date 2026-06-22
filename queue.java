// public class queue{
//     public static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n){
//             arr=new int[n];
//             size=n;
//             rear=-1;
//         }

//         //EMPTY?
//         public static boolean isEmpty(){
//             return rear==-1;
//         }
//         //ADD
//         public static void add(int data){
//             if(rear==size-1){
//                 System.out.println("queue is full");
//                 return;
//             }
//             rear=rear+1;
//             arr[rear] =data;
//         }
//         //rREMOVE
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             int front = arr[0];
//             for(int i=0; i<rear; i++){
//                 arr[i]=arr[i+1];
//             }
//             rear=rear-1;
//             return front;
//         }
//         //PEEK
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }

//             return arr[0];
//         }


//     }

//     public static void main(String args[]){
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }

///----------------------------------------------------
//CIRCULAR QUEUE
// public class queue{
//     public static class Queue{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         Queue(int n){
//             arr = new int[n];
//             size=n;
//             rear=-1;
//             front =-1;    
//         }
//         //EMPTY
//         public static boolean isEmpty(){
//             return rear==-1 && front == -1;
//         }
//         //FULL
//         public static boolean isFull(){
//             return (rear+1)%size==front;
//         }
//         //add
//         public static void add(int data){
//             if(isFull()){
//                 System.out.println("Queue is full");
//                 return;
//             }
//             //add 1st element
//             if(front==-1){
//                 front=0;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;
//         }
//         //remove
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int result=arr[front];
//             //last element  delete
//             if(rear==front){
//                 rear=front=-1;
//             }else{
//                 front=(front+1)%size;
//             }
//             return result;
//         }
//         //PEEK
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Empty Queue");
//                 return -1;
//             }
//             return arr[front];
//         }   
//     }
//     public static void main(String args[]){
//             Queue q= new Queue(3);
//             q.add(1);
//             q.add(2);
//             q.add(3);
//             System.out.println(q.remove());
//             q.add(4);
//             System.out.println(q.remove());
//             q.add(5);
//             while(!q.isEmpty()){
//                 System.out.println(q.peek());
//                 q.remove();
//             }

//      }
// }

///------------------------------------------------------------------

//QUEUE USING LINKEDLIST

// public class queue{
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class Queue{
//         static Node head=null;
//         static Node tail=null;
//         ///EMPTY
//         public static boolean isEmpty(){
//             return head==null && tail==null;
//         }
//         //ADD
//         public static void add(int data){
//             Node newNode=new Node(data);
//             //1st add
//             if(head==null){
//                 head=tail=newNode;
//                 return;
//             }
//             tail.next=newNode;
//             tail=newNode; 
//         }
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue empty");
//                 return -1;
//             }
//             int front = head.data;
//             //single element
//             if(head==tail){
//                 head=tail=null;
//             }else{
//                 head=head.next;
//             }
//             return front;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is Empty");
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();

//         }


//     }
// }

//---------------------------------------------------------------

//QUEUE USIG JAVA COLLECTION FRAMEWORK
// import java.util.*;
// public class queue{
//     public static void main(String args[]){
//         Queue<Integer> q = new LinkedList<>(); //ArrayDeque
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }
///-------------------------------------------

///QUEUE USING 2 STACK
// import java.util.*;
// public class queue{
//     static class Queue{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }

//         ///add
//         public static void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);

//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }
//         //remove'
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("queue is empty");
//                 return -1;
//             }
//             return s1.pop();
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("queue is empty");
//                 return -1;
//             }
//             return s1.peek();
            
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }

// }
///---------------------------------------------------

// QUEUE USING 2 STACKS
// import java.util.*;
// public class queue{
//     static class Stack{
//         static Queue<Integer> q1 = new java.util.LinkedList<Integer>();
//         static Queue<Integer> q2 = new java.util.LinkedList<Integer>();
         
//         //empty
//         public static boolean isEmpty(){
//             return q1.isEmpty() && q2.isEmpty();
//         }
//         //push
//         public static void push(int data){
//             if(!q1.isEmpty()){
//                 q1.add(data);
//             }else{
//                 q2.add(data);
//             }
//         }
//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top=-1;
//             //case1
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top=q1.remove();
//                     if(q1.isEmpty()){
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             }else{//case2
//                 while(!q2.isEmpty()){
//                     top=q2.remove();
//                     if(q2.isEmpty()){
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top=-1;
//             //case1
//             if(!q1.isEmpty()){
//                 while(!q1.isEmpty()){
//                     top=q1.remove();
//                     q2.add(top);
//                 }
//             }else{
//                 while(!q2.isEmpty()){
//                     top=q2.remove();
//                     q1.add(top);
//                 }
//             }
//             return top;

//         }
//     }
//     public static void main(String args[]){
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }


//     }
// }

///--------------------------------------------------------------------

///FIRST NON-REPEATING LETTER IN A STREAM OF CHARACTERS

// import java.util.*;
// public class queue{
//     public static void printNonRepeating(String str){
//         int freq[]=new int[26];  //'a'-'z'
//         Queue<Character> q = new java.util.LinkedList<Character>();

//         for(int i=0; i<str.length(); i++){
//             char ch= str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;
//             while(!q.isEmpty() && freq[q.peek()-'a']>1){
//                 q.remove();
//             }
//             //empty queue print -1
//             if(q.isEmpty()){
//                 System.out.println(-1+" ");
//             }else{
//                 System.out.println(q.peek()+" ");
//             }
//         }
//         System.out.println();

//     }

//     public static void main(String args[]){
//         String str = "aabccxb";
//         printNonRepeating(str);

//     }
// }


////-------------------------------------------------------------

///INTERLEAVED TWO HALF OF QUEUE OF EVEN LENGTH
import java.util.*;
// public class queue{
//     public static void interLeave(Queue<Integer> q){
//         Queue<Integer> firstHalf = new java.util.LinkedList<Integer>();
//         int size = q.size();
//         for(int i=0; i<size/2; i++){
//             firstHalf.add(q.remove());    
//         }
//         while(!firstHalf.isEmpty()){
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//     }



//     public static void main(String args[]){
//         Queue<Integer> q = new java.util.LinkedList<Integer>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);
//         interLeave(q);
//         while(!q.isEmpty()){
//             System.out.println(q.remove()+" ");
//         }

//     }
// }

////-------------------------------------------------------------
///QUEUE REVERSAL
// public class queue{
//     public static void reverse(Queue<Integer> q){
//         Stack<Integer> s = new Stack<>();
//         while(!q.isEmpty()){
//             s.push(q.remove());
//         }
//         while(!s.isEmpty()){
//             q.add(s.pop());
//         }
//     }
//     public static void main(String args[]){
//         Queue<Integer> q = new java.util.LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         reverse(q);
//         while(!q.isEmpty()){
//             System.out.println(q.remove()+" ");
//         }

//     }
// }

///--------------------------------------------------------------------------------
///DEQUE
// public class queue{
//     public static void main(String args[]){
//         Deque<Integer> deque = new java.util.LinkedList<Integer>();
//         deque.addFirst(1);
//         deque.addFirst(2);
//         deque.addLast(3);
//         deque.addLast(4); 
//         System.out.println(deque);
//         deque.removeFirst();
//         System.out.println(deque);
//         System.out.println("first elem = " + deque.getFirst());
//         System.out.println("last elem = " + deque.getLast());





//     }
// }


///--------------------------------------------
//IMPLEMENTATION OF QUEUE USING DEQUE

public class queue{
    static class Queue{
        Deque<Integer> deque = new java.util.LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
         
        System.out.println("peek = "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());


    }
}
