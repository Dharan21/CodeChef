import java.util.Scanner;

public class Apply_and_Contest {

    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int t = sc.nextInt();
            for(int i=0;i<t;i++) {
                long n = sc.nextLong();
                long a = sc.nextLong();
                long b = sc.nextLong();
                long k = sc.nextLong();
                long c;
                long c1 = n / a;
                long c2 = n / b;
                long temp = c1+c2;
                if(a%b==0 || b%a ==0){
                    c = temp - ((n/Math.max(a,b))<<1);
                }
                else {
                    c = temp - ((c1 / b)<<1);
                }
                if (c >= k) {
                    System.out.println("Win");
                }
                else
                    System.out.println("Lose");
            }
        }
    }
}
