import java.util.Scanner;
import java.util.Stack;

public class Testing_robot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                long x = sc.nextLong();
                String s = sc.next();
                Stack st = new Stack();
                int temp = 100;
                int min=100,max=100;
                if (s.length() == n) {
                    for (int k = 0; k < s.length(); k++) {
                        if(s.charAt(k)=='r' || s.charAt(k)=='R') temp++;
                        else if(s.charAt(k)=='l' || s.charAt(k)=='L') temp--;
                        if(temp>max) max = temp;
                        if(temp<min) min = temp;
                    }
                    System.out.println(max-min+1);
                }
            }
        }
    }
}