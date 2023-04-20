package Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr ={18,9,102,3,34,54};
/*
     int ans=   retindex(arr,54);

        System.out.println(ans);*/


        int ans=retindex(arr,1,4,3);

        System.out.println(ans);

     }

   /*  static int retindex(int[]arr, int n){
        int a=0;

        if (arr.length==0){
            return -1;

        }
         for (int i = 0; i <arr.length ; i++) {
             if (arr[i]==n){
                 a=i;
             }

         }
        return a;}*/
    static int retindex(int arr[],int index1,int index2,int target)
    {

        int ans=-1;

        for (int i = index1;i <index2 ; i++) {
            if (target==arr[i])
            {
                ans=i;
            }

        }
        return ans;

    }



     }




