package Long_Challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Chef_and_Interesting_Subsequences {

    static long go(int n, int k, int[] arr){
        int temp[] = arr;
        int count[] = new int[101];
        int fill[] = new int[101];
        Arrays.sort(temp);
        Arrays.fill(count,0);
        Arrays.fill(fill,0);
        for(int element:temp){
            count[element]++;
        }
        if(k==1){
            return count[temp[0]];
        }
        else if(k>1){
            if(k == count[temp[0]] || k==n){
                return 1;
            }
            else if(k < count[temp[0]]){
                return C(count[temp[0]],k);
            }
            else if(k > count[temp[0]]){
                int j=-1;
                while(true){
                    j++;
                    if(fill[temp[j]] == 0) {
                        fill[temp[j]] = 1;
                        k = k - count[temp[j]];
                        if(k==0) return 1;
                        else if(k<0){
                            int last_k = k + count[temp[j]];
                            return C(count[temp[j]],last_k);
                        }
                    }
                }
            }
        }
        return 1;
    }

    static long C(int n, int r) {

        long p = 1, k = 1;
        if (n - r < r) {
            r = n - r;
        }
        if (r != 0) {
            while (r > 0) {
                p *= n;
                k *= r;
                long m = __gcd(p, k);
                p /= m;
                k /= m;
                n--;
                r--;
            }
        } else {
            p = 1;
        }
        return p;
    }

    static long __gcd(long n1, long n2) {
        long gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<t;i++){
                String input[] = sc.nextLine().split(" ");
                int n = Integer.parseInt(input[0]);
                int k = Integer.parseInt(input[1]);
                String arr_input[] = sc.nextLine().split(" ");
                int arr[] = new int[n];
                for(int j=0;j<n;j++){
                    arr[j] = Integer.parseInt(arr_input[j]);
                }
                System.out.println(go(n,k,arr));
            }
        }
    }
}