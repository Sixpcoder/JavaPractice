package dsa.stack;

public class customstack {
    protected int[] data;
    int ptr = -1;

    private static final int DEFAULT_SIZE=10;

    public customstack(){
        this(DEFAULT_SIZE);
    }

    public customstack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isfull()){
            System.out.println("the stack is full");
        }

        ptr++;
        data[ptr]=item;
        return true;
    }

    private boolean isfull() {
        return ptr== data.length-1;

    }
    private boolean isEmpty(){
        return ptr==-1;

    }
    public int pop()throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack!!");
        }
        int removed =data[ptr];
        ptr--;
        return  removed;
    }


}
