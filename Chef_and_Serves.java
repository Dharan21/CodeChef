import java.util.Scanner;

public class Chef_and_Serves {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int p1 = sc.nextInt();
                int p2 = sc.nextInt();
                int k = sc.nextInt();
                int x = p1 + p2;
                long ans = x / k;
                if (ans % 2 == 0) {
                    System.out.println("CHEF");
                } else {
                    System.out.println("COOK");
                }
            }
        }
    }
}
