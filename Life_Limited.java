import java.util.Scanner;

public class Life_Limited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<t;i++){
                char [][] arr = new char[3][3];
                for(int j=0;j<3;j++){
                    String str = sc.nextLine();
                    arr[j] = str.toCharArray();
                }
                if(arr[1][0]=='l' && arr[1][1]=='l' && arr[0][0]=='l') System.out.println("yes");
                else if(arr[1][2]=='l' && arr[1][1]=='l' && arr[0][1]=='l') System.out.println("yes");
                else if(arr[1][0]=='l' && arr[2][0]=='l' && arr[2][1]=='l') System.out.println("yes");
                else if(arr[1][1]=='l' && arr[2][1]=='l' && arr[2][2]=='l') System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}
