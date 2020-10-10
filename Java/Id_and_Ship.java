import java.util.Scanner;

public class Id_and_Ship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                char c = sc.next().charAt(0);
                switch(c)
                {
                    case 'B':
                    case 'b':
                        System.out.println("BattleShip");
                        break;
                    case 'C':
                    case 'c':
                        System.out.println("Cruiser");
                        break;
                    case 'D':
                    case 'd':
                        System.out.println("Destroyer");
                        break;
                    case 'F':
                    case 'f':
                        System.out.println("Frigate");
                        break;
                }
            }
        }
    }
}
