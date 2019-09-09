import java.util.Scanner;

public class Find_Remainder {
    public static void main(String[] args) {
        int t=0;
        Scanner sc= new Scanner(System.in);
        if(sc.hasNextInt()){
            t = sc.nextInt();
            for(int i=0;i<t;i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a%b);
            }
        }
    }
}
