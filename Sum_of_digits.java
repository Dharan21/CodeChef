import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                long a = sc.nextLong();
                int sum = 0;
                while(a>0){
                    sum += (a%10);
                    a = a/10;
                }
                System.out.println(sum);
            }
        }
    }
}
