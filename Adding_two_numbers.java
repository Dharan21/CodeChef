import java.io.*;
import java.util.*;

public class Adding_two_numbers {

        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int n=0;
            if(sc.hasNextInt())
            {
                n = sc.nextInt();
                for(int i=0;i<n;i++)
                {
                    int num1 = sc.nextInt(),num2 = sc.nextInt();
                    System.out.println(num1+num2);
                }
            }

        }
    }
