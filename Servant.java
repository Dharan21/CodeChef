import java.util.Scanner;

public class Servant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                System.out.println(a<10 ? "What an obedient servant you are!" : -1 );
            }
        }
    }
}
