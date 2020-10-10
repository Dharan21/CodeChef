import java.util.Scanner;

public class Is_it_a_Cakewalk_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++)
            {
                int count = 0;
                for(int j=0;j<10;j++){
                    for(int k=0;k<10;k++){
                        if(sc.nextInt() <= 30 ) count++;
                    }
                }
                if( count>=60 ) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}
