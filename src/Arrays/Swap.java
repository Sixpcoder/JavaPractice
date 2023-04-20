package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [ ]arr ={1,2,3,4,5,6};

        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int [ ] arr, int indexi,int index2){
        int temp =arr[indexi];
        arr[indexi]=arr[index2];
        arr[index2]=temp;
    }

}
