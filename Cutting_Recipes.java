import java.util.Scanner;

public class Cutting_Recipes {
    private static int gcd(int a,int b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t= sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                int []ar = new int [n];
                int gcd = 0;
                for(int j=0;j<n;j++){
                    ar[j] = sc.nextInt();
                    if(j==1) gcd = gcd(ar[0],ar[1]);
                    else if(j>1) {
                        gcd = gcd(gcd,ar[j]);
                    }
                }
                for(int j=0;j<n;j++){
                    ar[j] /= gcd;
                    System.out.println(ar[j]);
                }
            }
        }
    }
}
