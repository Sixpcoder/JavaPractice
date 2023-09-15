package dsa.linkedlist;

public class Main {
    public static void main(String[] args) {

//        a list =new a();
//
//        list.insertfirst(5);
//        list.insertfirst(3);
//        list.insertfirst(4);
//        list.insertfirst(13);
//
//        list.insertlast(15);
//
//        list.insert(49,2);
//        list.display();
//        System.out.println(list.deletefirst());
//        list.display();
//        System.out.println(list.deletelast());//has problem of time complexity of O(n) since we are traversing
//        list.display();
//        list.delete(2);
//        list.display();

        dll list =new dll();

        list.insertfirst(5);
        list.insertfirst(3);
        list.insertfirst(4);
        list.insertfirst(13);
        list.insertlast(84);

        list.insert(4,65);
        list.display();


    }
}
