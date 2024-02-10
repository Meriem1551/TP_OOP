import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size");
        int size = sc.nextInt();
        int[] A = new int[size], B = new int[size], R = new int[size];
        System.out.println("enter the first array");
        for (int i = 0; i < size ; i++)
            A[i] = sc.nextInt();
        System.out.println("enter the second array");
        for (int i = 0; i < size ; i++)
            B[i] = sc.nextInt();
        for (int i = 0; i < size; i++) {
            R[i] = A[i] + B[i];
            System.out.println(R[i]);
        }
    }
}