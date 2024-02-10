import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Rectangle r = new Rectangle();
        r.initialiser(10,2,5,4);
        r.deplacer(2, 4);
        System.out.println(r.surface());
        System.out.println(r.perimetre());


        Personne personne1 = new Personne();
        personne1.demenager("1233455");

        Etudiant etudiant1 = new Etudiant();
        etudiant1.initialise();
        etudiant1.create();
        etudiant1.demenager("1ZR45768");
        etudiant1.LectureNotes();
        System.out.println(etudiant1.moyenne());*/

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter a size");
        int size = sc.nextInt();
        int t[] = new int[size];
        System.out.println("enter the array");
        for(int i= 0; i < size; i++)
        {
            t[i] = sc.nextInt();
        }
        System.out.println("enter 1 for bubble sort 2 for insertion sort");
        int choice = sc.nextInt();
        if (choice == 1)
            t = bubble(t, size);
        else
            t = insertion(t, size);
        System.out.println(Arrays.toString(t));*/
        System.out.println("enter n");
        int n = sc.nextInt();
        stars(n);
    }
    public static int[] bubble(int[] t, int size){
        int i, tmp;
        while(size >= 0) {
            for (i = 0; i < size - 1; i++) {
                if (t[i] > t[i + 1]) {
                    tmp = t[i];
                    t[i] = t[i + 1];
                    t[i + 1] = tmp;
                }
            }
            size--;
        }
        return t;
    }
    public static int[] insertion(int[] t, int size)
    {
        int i, j, tmp;
        for (i = 1; i < size; i++) {
            tmp = t[i];
            j = i -1;
            while(j >= 0 && t[j] > tmp){
                t[j+1] = t[j];
                j--;
            }
            t[j+1] = tmp;
        }
        return t;
    }
    public static void stars(int n)
    {
        int i, j, k;
        for (i = 0; i < n; i++)
        {
            for (k = n; k > i; k--)
                System.out.print(" ");
            for (j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}