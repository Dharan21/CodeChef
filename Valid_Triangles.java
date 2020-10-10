import java.util.Scanner;

public class Valid_Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if((a+b+c) == 180) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
