import java.util.Scanner;

public class Finding_square_roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                double r = Math.floor(Math.sqrt(n));
                System.out.println((int)r);
            }
        }
    }
}
