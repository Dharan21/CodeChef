import java.util.Scanner;

public class Reverse_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                StringBuffer number = new StringBuffer(""+n);
                String rev = number.reverse().toString();
                rev.trim();
                n = Integer.parseInt(rev);
                System.out.println(n);
            }
        }
    }
}
