import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2, i, k, tmp;
        int[] t1, t2, R;
        System.out.println("enter a size for first array");
        s1 = sc.nextInt();
        System.out.println("enter the first array");
        t1 = new int[s1];
        for ( i = 0; i< s1; i++)
            t1[i] = sc.nextInt();
        System.out.println("entre size for second array");
        s2 = sc.nextInt();
        System.out.println("enter the second array");
        t2 = new int[s2];
        for ( i = 0; i< s2; i++)
            t2[i] = sc.nextInt();
        R = new int[s1 + s2];
        k = 0;
        for ( i = 0; i < s1 + s2; i++) {
           if (i < s1)
               R[i] = t1[i];
           else if (i < s1 +s2)
               R[i] = t2[i-s1];
        }
        int i_min;
        for ( i = 0; i < s1 + s2; i++) {
             i_min = i;
            for (int j = i +1; j <s1 + s2; j++){
                if (R[j] < R[i_min])
                    i_min= j;
            }
            tmp = R[i];
            R[i] = R[i_min];
            R[i_min]= tmp;
        }
        for (k = 0; k < s1+s2; k++)
            System.out.println(R[k]);
    }
}