package Arrays;

public class Minelement {
    public static void main(String[] args) {

        int []arr ={12,32,13,47,5,66};
        int ans=minelement(arr);

        System.out.println(ans);


    }
    static int minelement(int[]arr){

        int min=arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]<arr[i]){
                min=arr[i+1];
            }

        }
        return min;

    }



}
