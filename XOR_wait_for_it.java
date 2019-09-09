import java.util.Scanner;

public class XOR_wait_for_it {

    //        public static String long_to_binary(long no)
//        {
//            String s="";
//            while(no>0)
//            {
//                s = s+(no%2);
//                no/=2;
//            }
//            StringBuffer sb = new StringBuffer(s);
//            s = sb.reverse().toString().trim();
//            // System.out.println(s);
//            return s;
//        }
//
//        public static String pad_with_zero(String small,String large)
//        {
//            int diff = large.length() - small.length();
//            String temp="";
//            for(long i=0;i<diff;i++)
//                temp += "0";
//            temp+=small;
//            //   System.out.println(temp);
//            return temp;
//        }
//
//        public static String XOR(String i1,String i2)
//        {
//            if(i1.length()>i2.length()) i2 = pad_with_zero(i2,i1);
//            else i1 = pad_with_zero(i1,i2);
//            String o="";
//            for(int i=0;i<i1.length();i++)
//            {
//                if(i1.charAt(i)==i2.charAt(i)) o+="0";
//                else o+="1";
//            }
//            //    System.out.println(o);
//            return o;
//        }
//        public static long binary_to_long(String i)
//        {
//            long no=0;
//            StringBuffer sb = new StringBuffer(i);
//            i = sb.reverse().toString().trim();
//            for(int p=0;p<i.length();p++)
//            {
//                if('1' == i.charAt(p)) {
//                    no += Math.pow(2, p);
//                }
//            }
//            //   System.out.println(no);
//            return no;
//        }
//        public static void main (String[] args) throws java.lang.Exception
//        {
//            // your code goes here
//            Scanner sc = new Scanner(System.in);
//            if(sc.hasNextInt())
//            {
//                int t=sc.nextInt();
//                for(int p=0;p<t;p++)
//                {
//                    long l =sc.nextLong();
//                    long r =sc.nextLong();
//                    String op1="";
//                    String op2="";
//                    if(l==r) System.out.println(l%2==0?"Even":"Odd");
//                    else {
//                        for (long i = l; i < r; i++) {
//                            if (i == l) {
//                                op1 = long_to_binary(i);
//                                op2 = long_to_binary(i + 1);
//                                op1 = XOR(op1, op2);
//                            } else {
//                                op2 = long_to_binary(i + 1);
//                                op1 = XOR(op1, op2);
//                            }
//                        }
//                        System.out.println(binary_to_long(op1)%2==0?"Even":"Odd");
//                    }
//                }
//            }
//        }
    // Method to calculate xor
//    static int computeXOR(int n)
//    {
//        // If n is a multiple of 4
//        if (n % 4 == 0)
//            return n;
//
//        // If n%4 gives remainder 1
//        if (n % 4 == 1)
//            return 1;
//
//        // If n%4 gives remainder 2
//        if (n % 4 == 2)
//            return n + 1;
//
//        // If n%4 gives remainder 3
//        return 0;
//    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < t; i++) {
                long l = sc.nextLong();
                long r = sc.nextLong();
                long x;
                if (r % 2 == 0) {
                    x = (r / 2) - (l / 2);
                } else x = (r + 1) / 2 - (l / 2);
                builder.append(x % 2 == 0 ? "Even" : "Odd").append("\n");
            }
            System.out.println(builder.toString());
        }
    }
}