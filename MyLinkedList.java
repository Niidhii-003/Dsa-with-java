// public class LinkedList{
//     public static class Node {
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     //Methods
//     public void addFirst(int data){
//         //step1=create new node
//         Node newNode =new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         //step2-newNode=head
//         newNode.next = head;  ///link
//         //step3-head=newNode
//         head = newNode;
//     }

//     public void addLast(int data){
//         //step1-create new node at last
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         //step2-newNode=tail
//         tail.next = newNode;
//         //step3-tail=newNode;
//         tail = newNode;

//     }
//     public void print(){
//         if (head==null){
//             System.out.println("LL is empty");
//             return ;
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"-> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void addMid(int idx, int data){
//         if(idx==0){
//             addFirst(data);
//             return;
//         }
//         Node newNode= new Node(data);
//         size++;
        
//         Node temp = head;
//         int i=0;

//         while(i<idx-1){
//             temp= temp.next;
//             i++;
//         }
//         //i=idx-1; temp-> prev
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }
//     ///REMOVE--> removeFirst , removeLast
//     public int removeFirst(){
//         if(size==0){
//             System.out.println("LL is Empty");
//             return Integer.MIN_VALUE;
//         }else if(size==1){
//             int val = head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }
//         int val= head.data;
//         head = head.next;
//         size--;
//         return val;
//     }

//     public int removeLast(){
//         if(size==0){
//             System.out.println("ll is empty");
//         }else if(size==1){
//             int val = head.data;
//             head=tail=null;
//             size=0;
//             return val;
//         }
//         Node prev = head;
//         for(int i=0; i<size-2; i++){
//             prev = prev.next;
//         }
//         int val=prev.next.data;
//         prev.next=null;
//         tail=prev;
//         size--;
//         return val;
//     }
//     public int itrSearch(int key){
//         Node temp =head;
//         int i=0;
//         while(temp!=null){
//             if(temp.data==key){
//                 return i;
//             }
//             temp=temp.next;
//             i++;
//         }
//         return -1;
//     }
//     public int helper(Node head, int key){
//         if(head==null){
//             return -1;
//         }
//         if(head.data==key){
//             return 0;
//         }
//         int idx=helper(head.next, key);
//         if(idx==-1){
//             return -1;
//         }
//         return idx+1;
//     }

//     public int recSearch(int key){
//         return helper(head,key);
//     }
//     //reverse
//     public void reverse(){
//         Node prev=null;
//         Node curr=tail=head;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next = prev;
//             prev=curr;
//             curr=next;
//         }
//         head=prev;

//     }
//     public void deleteNthfromEnd(int n){
//         ///calculate size
//         int sz=0;
//         Node temp=head;
//         while(temp!=null){
//             temp=temp.next;
//             sz++;
//         }
//         if(n==sz){
//             head=head.next;   //removeFirst
//             return;    
//         }
//         //size-n
//         int i=1;
//         int iToFind = sz-n;
//         Node prev=head;
//         while(i<iToFind){
//             prev=prev.next;
//             i++;
//         }
//         prev.next=prev.next.next;
//         return;

//     }
//     //palindrome
//     //step 1
//     //slow fast approach
//     public Node findMid(Node head){
//         Node slow = head;
//         Node fast = head;

//         while(fast!=null && fast.next !=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     //step-2 -->reverse second half
//     public boolean checkPalindrome(){
//         if(head==null || head.next==null){
//             return true;
//         }
//         //step1-mid
//         Node midNode=findMid(head);

//         //step2-reverse 2nd half
//         Node prev=null;
//         Node curr=midNode;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next = prev;
//             prev=curr;
//             curr=next;

//         }
//         Node right = prev;  //right half head
//         Node left = head;

//         //step3-=check left half =right half
//         while(right!=null){
//             if(left.data!=right.data){
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }
//         return true;
//     }

//     public static boolean isCycle() { ///floyd cycle 
//         Node slow = head;
//         Node fast = head;

//         while(fast!=null && fast.next!=null){
//             slow=slow.next;  //+1
//             fast=fast.next.next; //+2
//             if(slow==fast){
//                 return true; ///cycle exists
//             }
//         }
//         return false;   //cycle does not exist
//     }

//     public static void removeCycle(){
//         //detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle =false;
//         while(fast!= null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//             if(fast==slow){
//                 cycle=true;
//                 break;
//             }
//         }
//         if(cycle==false){
//             return;
//         }
//         //find meeting point
//         slow = head;
//         Node prev = null; //last node
//         while(slow!=fast){
//             prev= fast;
//             slow = slow.next;
//             fast=fast.next;  
//         }
//         //remove cycle -> last.next = null
//         prev.next =null;
//     }





//     public static void main(String args[]){
//         LinkedList ll = new LinkedList();
//         // ll.head=new Node(1);
//         // ll.head.next=new Node(2); 
//         // Methods
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addFirst(2);
//         ll.print();
//         ll.addLast(4);
//         ll.print();
//         ll.addLast(8);
//         ll.print();
//         ll.addMid(2,9);
//         ll.print();
//         System.out.println(ll.size); 
//         ll.removeFirst();
//         ll.print();
//         ll.removeLast();
//         ll.print();
//         System.out.println(ll.itrSearch(4));
//         System.out.println(ll.itrSearch(10));
//         System.out.println(ll.recSearch(4));
//         System.out.println(ll.recSearch(10));
//         ll.reverse();
//         ll.print();
//         ll.deleteNthfromEnd(3);
//         ll.print();
//         System.out.println(ll.checkPalindrome());
//         //cycle detection
//         head=new Node(1);
//         Node temp = new Node(2);
//         head.next =temp;
//         head.next.next= new Node(3);
//         head.next.next.next=temp;
//         /// 1-> 2->3->2
//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());












//     }
// }

//------------------------------------------------------------------------


///LL IN JAVA COLLECTIONS FRAMEWORK

// import java.util.LinkedList;

// public class MyLinkedList{
//     public static void main(String args[]){
//         //create--objects 
//         LinkedList<Integer> ll = new LinkedList<>();



//         //add
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addFirst(0);
//         System.out.println(ll);
//         //remove
//         ll.removeLast();
//         ll.removeFirst();
//         System.out.println(ll);


        
//     }
// }



///-----------------------------------------------------------------------------
///MERGED SORT

// public class MyLinkedList{
//     public static class Node {
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     //Methods
//     public void addFirst(int data){
//         //step1=create new node
//         Node newNode =new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         //step2-newNode=head
//         newNode.next = head;  ///link
//         //step3-head=newNode
//         head = newNode;
//     }

//     public void print(){
//         if (head==null){
//             System.out.println("LL is empty");
//             return ;
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"-> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }

//     public Node getMid(Node head){
//         Node slow = head;
//         Node fast = head.next;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;
//         }
//         return slow;  ///mid node
//     }

//     public Node merge(Node head1, Node head2){
//         Node dummy=new Node(-1);
//         Node temp=dummy;
//         while(head1!=null && head2!=null){
//             if(head1.data<=head2.data){
//                 temp.next=head1;
//                 head1=head1.next;
//                 temp=temp.next;
//             }else{
//                 temp.next=head2;
//                 head2=head2.next;
//                 temp=temp.next;
//             }
//         }
//         while(head1!=null){
//             temp.next = head1;
//             head1=head1.next;
//             temp=temp.next;

//         }
//         while(head2!=null){
//             temp.next = head2;
//             head2=head2.next;
//             temp=temp.next;


//         }
//         return dummy.next;
//     }

//     public Node mergeSort(Node head){
//         if(head==null || head.next==null){
//             return head;
//         }
//         //find mid
//         Node mid = getMid(head);
//        //left & right Merge sort
//         Node rightHead= mid.next;
//         mid.next=null;
//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);
//         //MERGE
//         return merge(newLeft, newRight);

//     }

//     public static void main(String args[]){
//         MyLinkedList ll = new MyLinkedList();

//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);
//         System.out.println("Original list:");
//         ll.print();
//         ll.head=ll.mergeSort(ll.head);
//         System.out.println("Sorted list:");
//         ll.print();
    

//     }




// }

///-----------------------------------------------------------------------------------------------------


////ZIG ZAG CODE OF LINKEDLIST

// public class MyLinkedList{
//     public static class Node {
//         int data;
//         Node next;
//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addLast(int data){
//         //step1-create new node at last
//         Node newNode = new Node(data);
//         size++;
//         if(head==null){
//             head=tail=newNode;
//             return;
//         }
//         //step2-newNode=tail
//         tail.next = newNode;
//         //step3-tail=newNode;
//         tail = newNode;

//     }
//     public void print(){
//         if (head==null){
//             System.out.println("LL is empty");
//             return ;
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data+"-> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }
//     public void zigZag(){
//         //find mid
//         Node slow = head;
//         Node fast = head.next;
//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast=fast.next.next;         
//         }
//         Node mid = slow;

//         ///reverse 2nd half
//         Node curr=mid.next;
//         mid.next=null;
//         Node prev=null;
//         Node next;
//         while(curr!=null){
//             next = curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }
//         Node left=head;
//         Node right=prev;
//         Node nextL, nextR;

//         //alt merge-zig zag
//         while(left!=null && right!=null){
//             nextL = left.next;
//             left.next=right;
//             nextR = right.next;
//             right.next=nextL;
//             left = nextL;
//             right = nextR;
//         }
//     }
//     public static void main(String args[]){
//         MyLinkedList ll = new MyLinkedList();
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.print();
//         ll.zigZag();
//         ll.print();


//     }

// }

///------------------------------------------------------------------------


///DOUBLY LINKEDLIST
public class MyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public Node head;
    public  Node tail;
    public  int size;

    ///add
    //addFirst();
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;   ///connect new node to old node
        head.prev=newNode;    //connect old head back to new node
        head=newNode;         //move head
    }
    //addlast()
    public void addLast(int data){

    // Step 1: Create a new node
    Node newNode = new Node(data);

    // Step 2: Increase size of DLL
    size++;

    // Step 3: If list is empty,
    // make new node both head and tail
    if(head == null){
        head = tail = newNode;
        return;
    }

    // Step 4: Connect current tail to new node
    tail.next = newNode;

    // Step 5: Connect new node back to current tail
    newNode.prev = tail;

    // Step 6: Move tail to the new node
    tail = newNode;
}

    //print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public int removeLast(){

    // Step 1: Check if list is empty
    if(head == null){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }

    // Step 2: If only one node exists
    if(size == 1){

        // Store value before deleting
        int val = head.data;

        // Remove the only node
        head = tail = null;

        // Update size
        size = 0;

        // Return deleted value
        return val;
    }

    // Step 3: Store tail data
    int val = tail.data;

    // Step 4: Move tail one step backward
    tail = tail.prev;

    // Step 5: Break connection with old tail
    tail.next = null;

    // Step 6: Reduce size
    size--;

    // Step 7: Return removed value
    return val;
}
    public int removeFirst(){

    // Step 1: Check if DLL is empty
    if(head == null){
        System.out.println("DLL is empty");
        return Integer.MIN_VALUE;
    }

    // Step 2: If only one node exists
    if(size == 1){

        // Store value before deleting
        int val = head.data;

        // Remove the only node
        head = tail = null;

        // Update size
        size = 0;

        // Return deleted value
        return val;
    }

    // Step 3: Store head data
    int val = head.data;

    // Step 4: Move head to next node
    head = head.next;

    // Step 5: Remove backward link to old head
    head.prev = null;

    // Step 6: Reduce size
    size--;

    // Step 7: Return removed value
    return val;
}
   
   //reverse
   public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head= prev;
   }



     public static void main(String args[]){
        MyLinkedList dll = new MyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.addLast(5);
        dll.print();
        dll.removeFirst();
        dll.print();

        dll.addLast(4);
        dll.print();
        dll.addFirst(0);
        dll.print();

        dll.reverse();
        dll.print();


    }
}

