import java.util.Scanner;

public class Chef_and_An_Ideal_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1");
        if(sc.hasNextInt()){
            int y = sc.nextInt();
            if(y==2) System.out.println("3");
            else if(y==3) System.out.println("2");
        }
    }
}
