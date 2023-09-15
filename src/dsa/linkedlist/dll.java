package dsa.linkedlist;

public class dll {

    //to insert first
   private Node head;
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev= null;
        if(head!=null){
            head.prev= node;
        }
        head=node;
    }

    public Node get(int index){
        Node node = head;
        for(int i = 0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.val==value){
                return node;

            }
            node = node.next;
        }
        return node;
    }

    public void insert(int after, int val){

        Node p =  find(after);

        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);

        node.next=p.next;
        p.next=node;
        node.prev=p;

        if(node.next!=null){
            node.next.prev=node;
        }

    }

    public void insertlast(int val){
        Node node = new Node(val);
        Node last =head;

        node.next=null;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while(last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.prev=last;
    }

    public void display(){
        Node node = head;
        while(node!=null){
            System.out.print(node.val+" - ");
            node = node.next;

        }
        System.out.println("END");
    }


    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}