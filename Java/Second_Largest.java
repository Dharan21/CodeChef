import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int [] a = new int[3];
                a[0] = (sc.nextInt());
                a[1] = (sc.nextInt());
                a[2]  = (sc.nextInt());
                Arrays.sort(a);
                System.out.println(a[1]);
            }
        }
    }
}
