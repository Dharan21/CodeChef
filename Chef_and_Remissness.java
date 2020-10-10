import java.util.Scanner;

public class Chef_and_Remissness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t= sc.nextInt();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(Math.max(a,b));
                System.out.println(a+b);
            }
        }
    }
}
