import java.util.Scanner;

public class Maze{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine();
        String two = sc.nextLine();
        String three = sc.nextLine();
        int i;
        one.replace('a','%');
        one.replace('A','%');
        one.replace('e','%');
        one.replace('E','%');
        one.replace('i','%');
        one.replace('I','%');
        one.replace('o','%');
        one.replace('O','%');
        one.replace('u','%');
        one.replace('U','%');

        for(i=0;i<two.length();i++){
            if(two.charAt(i)=='a'||two.charAt(i)=='A'||two.charAt(i)=='E'||two.charAt(i)=='e'||two.charAt(i)=='I'||two.charAt(i)=='i'||two.charAt(i)=='O'||two.charAt(i)=='o'||two.charAt(i)=='U'||two.charAt(i)=='u'){}
            else {
                two.replace(two.charAt(i),'#');
            }
        }

        three = three.toUpperCase();

        one = one+""+two+""+three;
        System.out.print(one);
    }
}
