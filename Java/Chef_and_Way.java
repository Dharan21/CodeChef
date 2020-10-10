import java.util.HashMap;
import java.util.Scanner;

public class Chef_and_Way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            if(sc.hasNextInt()){
                int k = sc.nextInt();
                int []num = new int[n+1];
                HashMap hm  = new HashMap();
                for(int i=1;i<=n;i++){
                    num[i] = sc.nextInt();
                    hm.put(i,0);
                }

                for(int i=1;i<=k;i++){
                    long product=Integer.MAX_VALUE;
                    for(int j=i+1;j<=n;j++){
                        if(i<=k && product>(num[i]*num[j]) && (j<=k || j==n)){
                            product = num[i]*num[j];
                            hm.put(i,j);

                        }
                    }
                }
                int i=1,j=1;
                long product =1;
                while(j!=n){
                    j = Integer.parseInt(hm.get(i).toString());
                    product *= num[j];
                    i = j;
                }
                //System.out.println(hm);
                System.out.println(product%1000000007);
            }
        }
    }
}
