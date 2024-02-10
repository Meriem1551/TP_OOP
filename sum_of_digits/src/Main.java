import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("enter a positive number");
            n = sc.nextInt();
        }while(n < 0);
        int sum = sum_digits(n);
        System.out.println(sum);
    }
    public static int sum_digits(int n)
    {
        if (n < 10)
            return n;
        return (n%10)+sum_digits(n/10);
    }
}