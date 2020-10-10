import java.util.Scanner;

public class Chef_and_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int []arr = new int[n];
                int count = 0;
                for(int j=0;j<n;j++){
                    arr[j]=sc.nextInt();
                    if(arr[j]==1)   count++;
                }
                if((n-k)<=count) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}