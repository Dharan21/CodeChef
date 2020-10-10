import java.util.Scanner;

public class Lucky_four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                long n = sc.nextLong();
                String s = ""+n;
                s.trim();
                int count = 0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)=='4') count++;
                }
                System.out.println(count);
            }
        }
    }
}
