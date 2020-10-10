import java.util.Scanner;

public class Ciel_and_Receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++) {
                int p = sc.nextInt();
                String str = "";
                int count = p / 2048;
                p = p % 2048;
                while (p > 0) {
                    str += (p % 2);
                    p /= 2;
                }
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j)=='1') count++;
                }
                System.out.println(count);
            }
        }
    }
}
