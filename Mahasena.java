import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int [] a = new int[n];
            int oddc = 0;
            int evenc = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i]%2==0) evenc++;
                else oddc++;
            }
            if(evenc>oddc) System.out.println("READY FOR BATTLE");
            else System.out.println("NOT READY");
        }
    }
}
