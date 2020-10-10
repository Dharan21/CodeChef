import java.util.Scanner;

public class Primality_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                int temp = 0;
                if(n==1) System.out.println("no");
                else {
                    for (int j = 2; j < n / 2; j++) {
                        if (n % j == 0) {
                            temp = 1;
                            break;
                        }
                    }
                    if (temp == 0) System.out.println("yes");
                    else System.out.println("no");
                }
            }
        }
    }
}
