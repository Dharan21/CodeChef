import java.util.Scanner;

public class Smallest_Numbers_of_Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int a = sc.nextInt();
                int money[] = new int[]{100,50,10,5,2,1};
                int min = 0;
                while(a>0){
                    for(int j=0;j<money.length;j++) {
                        min = min + a / money[j];
                        a = a % money[j];
                    }
                }
                System.out.println(min);
            }
        }
    }
}
