import java.util.Scanner;

public class IPL_and_RCB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) {
            int t = sc.nextInt();
            for(int i=0;i<t;i++)
            {
                int points = sc.nextInt();
                int matches = sc.nextInt();
                int min_win=0;
                if(points<=matches) min_win=0;
                else min_win=(points-matches);
                System.out.println(min_win);
            }
        }
    }
}
