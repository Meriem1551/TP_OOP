import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        System.out.println("enter a letter");
        char l = sc.next().charAt(0);
        boolean c = tester(s, l, s.length() - 1);
        System.out.println(c);
    }
    public static boolean tester(String s, char l, int i)
    {
        if (i == 0)
            return false;
        if (s.charAt(i) ==  l)
            return true;
        return tester(s, l, i-1);
    }
}