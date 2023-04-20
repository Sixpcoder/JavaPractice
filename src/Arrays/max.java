package Arrays;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {6, 24, 54, 12, 2};

//        System.out.println(max(arr));

//        System.out.println(reverse(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static int max(int[] arr) {

        if (arr == null) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = max;
            }


        }
        return max;
    }

static void reverse (int[]arr){
        int start=0;
        int end = arr.length-1;
        while (start<end)
        {
            swap(arr,start,end);
            start++;
            end--;

        }
}
static void swap(int[] arr, int index1, int index2) {


            int temp=arr[index1];
            arr[index1]=arr[index2];
           arr[ index2]=temp;


        }
    }
