import java.util.Scanner;

public class Small_Factorial {
    public static long fact(int n){
        if(n==0) return 1;
        else return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                System.out.println(fact(a));
            }
        }
    }
}
