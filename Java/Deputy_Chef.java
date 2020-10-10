import java.util.Scanner;

public class Deputy_Chef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int t = sc.nextInt();
            for(int i=0;i<t;i++) {
                int n = sc.nextInt();
                if (n < 3) break;
                else {
                    int a[] = new int[n];
                    int d[] = new int[n];
                    for(int j=0;j<n;j++)
                    {
                        a[j]=sc.nextInt();
                    }
                    for(int j=0;j<n;j++)
                    {
                        d[j]=sc.nextInt();
                    }
                    int max = 0;
                    for (int j = 0; j < n; j++) {
                        if (j == 0) {
                            if ((a[1] + a[n - 1]) < d[0] && max < d[0]) max = d[0];
                        } else if (j == n - 1) {
                            if ((a[0] + a[n - 2]) < d[n - 1] && max < d[n - 1]) max = d[n - 1];
                        } else {
                            if ((a[j - 1] + a[j + 1]) < d[j] && max < d[j]) max = d[j];
                        }
                    }
                    if (max == 0) max = -1;
                    System.out.println(max);
                }
            }
        }
    }
}
