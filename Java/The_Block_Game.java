import java.util.Scanner;

public class The_Block_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t= sc.nextInt();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                String s = ""+a;
                s.trim();
                StringBuffer sb = new StringBuffer(s);
                String rev = sb.reverse().toString().trim();
                if(rev.equalsIgnoreCase(s)) System.out.println("wins");
                else System.out.println("losses");
            }
        }
    }
}
