import java.util.Scanner;

public class First_and_last_digit {
    public static void main(String[] args) {
        int t=0;
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            t = sc.nextInt();
            for(int i=0;i<t ;i++)
            {
                long a = sc.nextLong();
                String s = ""+a+"";
                s.trim();
                int length = s.length();
                char fd = s.charAt(0);
                char ld = s.charAt(length-1);
                int f = Character.getNumericValue(fd);
                int l = Character.getNumericValue(ld);
                System.out.println(f+l);
            }
        }
    }
}
