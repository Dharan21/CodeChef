import java.util.HashMap;

import java.util.Scanner;


public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                HashMap hm = new HashMap();
                String [] name = new String[n];
                sc.nextLine();
                for(int j=0;j<n;j++){
                    name[j] = sc.nextLine();
                    String []str = name[j].split(" ");
                    if(!hm.containsKey(str[0])){
                        hm.put(str[0], new Integer(0));
                    }
                    else hm.put(str[0],new Integer(1));
                }

                for(int j=0;j<n;j++){
                    String str = name[j].split(" ")[0];
                    if(hm.get(str).equals(new Integer(0))){
                        System.out.println(str);
                    }
                    else System.out.println(name[j]);
                }
            }
        }
    }
}
