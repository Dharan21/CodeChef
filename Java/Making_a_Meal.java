import java.io.IOException;

import java.util.*;
public class Making_a_Meal {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                long c = 0,o=0,d=0,e=0,h=0,f=0;
                String arr="";
                sc.nextLine();
                for(int j=0;j<n;j++){
                    arr = sc.nextLine();
                    for(int k = 0;k<arr.length();k++){
                        switch(arr.charAt(k)){
                            case 'c':
                                c++;
                                break;
                            case 'o':
                                o++;
                                break;
                            case 'd':
                                d++;
                                break;
                            case 'e':
                                e++;
                                break;
                            case 'h':
                                h++;
                                break;
                            case 'f':
                                f++;
                                break;
                        }
                    }

                }
                c = c/2;
                e = e/2;
                long ans = Math.min(Math.min(Math.min(Math.min(Math.min(c,o),d),e),h),f);
                System.out.println(ans);
            }
        }
    }
}
