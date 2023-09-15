package dsa.linkedlist;

//singly linked list

import org.w3c.dom.Node;

public class a {

    //linkedlist properties

    private Node head;
    private Node tail;
    private int size;

    public a() {
        this.size=0;
    }


// insert at first position

    public void insertfirst(int val){

        Node node =new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;

    }


    //insert a new value at last position

    public void insertlast(int val){

        if(tail==null){
            insertfirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;

    }

    //deleting the first one
    public int deletefirst(){
        int value = head.val;
        head = head.next;
        if(head==null){
            tail = null;
        }

        size--;
        return value;
    }

    //deleting the last value

    public Node get(int index){
        Node node = head;
        for(int i = 0;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public int deletelast(){
        if(size<=1){
            deletefirst();
        }
        Node secondlast = get(size-2);
        int val  = tail.val;
        tail = secondlast;
        tail.next=null;
        return val;
    }

    //deleting a particular index

    public int delete(int index){
        if(index==0){
            return deletefirst();

        }

        if(index==size-1){
            deletelast();
        }

        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;

    }
    public void insert(int val,int index){

        //if the list is empty or the value is to be assigned at first
        if(index==0){
            insertfirst(val);
            return;
        }

        //if the value is to be assigned at the last
        if(index==size){
            insertlast(val);
            return;
        }

        Node temp = head;
        for (int i = 1;i<index;i++){
            temp = temp.next;

        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }


    //printing the list using a temp variable since head is a part of the format
    //head is only used to point to the first node of the list

    public void display(){

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" -> ");
            temp=temp.next;

        }
        System.out.println("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    //questions
//    to remove dublicate numbers in a sorted linkedlist in leetcode
//    ex 1,1,1,2,3,4 to be printed as 1,2,3 in linkedlist

    public void duplicates(){
        Node node= head;

        while(node.next!=null){
            if(node.val ==node.next.val){
                node.next=node.next.next;
                size--;

            }else{
                node=node.next;

            }

        }
        tail=node;
        tail.next = null;
    }

//    merge two linkedlist
    public static a merge(a first,a second){
        Node f= first.head;
        Node s = second.head;

        a ans = new a();

        while (f !=null && s!=null){
            if(f.val<s.val){
                ans.insertlast(f.val);
                f=f.next;
                
            }else{
                ans.insertlast(s.val);
                s=s.next;

            }
        }

        while(f!=null){
            ans.insertlast(f.val);
            f=f.next;
        }

        while(s!=null){
            ans.insertlast(s.val);
            s=s.next;
        }

        return ans;

    }

    //to check if a cycle linked list is present or not
    //use two pointers in which one is moving two nodes and one is moving one  and since a circle is present in it
    //at some point of time both of them will be at a single node

    public boolean hascycle(Node node){
        Node fast = head;
        Node slow = head;

        while(fast !=null && slow !=null){
            fast= fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
return false;
    }

    //to find the length of the cycle
    public int lengthcycle(Node node){
        Node fast = head;
        Node slow = head;

        while(fast !=null && slow !=null){
            fast= fast.next.next;
            slow=slow.next;
            if(fast==slow){
                int length=0;
                Node temp = slow;
                do {
                    temp=temp.next;
                    length++;
                }while (temp!=slow);
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        a list = new a();
        a slist = new a();


        list.insertlast(1);
        slist.insertlast(1);
        list.insertlast(4);
        list.insertlast(7);
        list.insertlast(9);
        slist.insertlast(4);
        slist.insertlast(8);
        a ans = a.merge(list,slist);


        list.display();
        slist.display();
       ans.display();




    }

}
