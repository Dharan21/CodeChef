import java.util.Scanner;

public class Enoromus_input_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr [] = new int[n];
            int count = 0;
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
                if(arr[i]%k==0) count++;
            }
            System.out.println(count);
        }
    }
}
