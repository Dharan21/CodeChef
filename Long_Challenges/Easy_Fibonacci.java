package Long_Challenges;

import java.util.Scanner;

public class Easy_Fibonacci {

    static int result = 0;
    static double phi = (1 + Math.sqrt(5)) / 2;
    static void go(long number,long multiple){
        if( number == 1 || number == 2 ){
            result =  (fibo((int)((number*multiple)%60)));
            return;

        }
        else if( number == 3 ){
            result =  (fibo((int)((2*multiple)%60)));
            return;
        }
        else{
            go(number / 4, multiple * 4);
        }
    }

    static int fibo(int n){
        n = n-1;
        return  (int)((Math.round(Math.pow(phi, n) / Math.sqrt(5)))%10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                long number = sc.nextLong();
                go(number,1);
                System.out.println(result);
            }
        }
    }
}
