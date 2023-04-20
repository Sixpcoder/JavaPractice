package peprevision;

import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        int temp = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");

        int n = sc.nextInt();
        /*
        //to check if it is a prime number on not

        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                temp = 1;
            }
        }
        if (temp==0){
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number" );
        }
*/

        //to print all the prime numbers in a range
        for (int i = 2; i <=n ; i++) {
            int pin=0;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    pin=1;


                }
            }
            if (pin==0){
                System.out.println(i);
        }

        }
    }
}

