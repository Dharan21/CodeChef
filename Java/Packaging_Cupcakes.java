import java.util.Scanner;

public class Packaging_Cupcakes {
    public static void main(String[] args) {
        int t= 0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            t= sc.nextInt();
            for(int i=0;i<t;i++)
            {
                long a = sc.nextInt();
                if(a%2==0) System.out.println((a/2)+1);
                else System.out.println((a+1)/2);
            }
        }
    }
}
