import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of this array");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter this array");
        for (int i = 0; i < size; i++)
            array[i] = sc.nextInt();
        int max = max(array, array[0], size - 1);
    System.out.println(max);
    }
    public static int max(int array[], int max, int size)
    {
        if (size == 0)
             return max;
        if (array[size] > max)
            return max(array, array[size], size - 1);
        return max(array, max, size - 1);
    }
}