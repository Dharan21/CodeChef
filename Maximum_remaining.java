import java.util.Scanner;

public class Maximum_remaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            long a[] = new long[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
            }
            long max = 0;
            for(int i=0;i<n;i++)
            {
                if(a[i]>max) {
                    max = a[i];
                }
            }
            for(int i=0;i<n;i++){
                if(a[i]==max) a[i]=0;
            }
            long max2 = a[0];
            for(int i=0;i<n;i++)
            {
                if(a[i]>max2) {
                    max2 = a[i];
                }
            }
            System.out.println(max2%max);
        }
    }
}
