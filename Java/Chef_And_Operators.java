import java.util.Scanner;

public class Chef_And_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                String s;
                if(a>b) s=">";
                else if(a<b) s="<";
                else s = "=";
                System.out.println(s);
            }
        }
    }
}
