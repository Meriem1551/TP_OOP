import java.util.Scanner;

public class Etudiant extends Personne {
    int NNS;
    int num_sec;
    int num_grp;
    float[] note;

    public void create()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the NNS");
        this.NNS = sc.nextInt();
        System.out.println("enter the  section num");
        this.num_sec = sc.nextInt();
        System.out.println("enter the group num");
        this.num_grp = sc.nextInt();
    }
    public void LectureNotes()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        this.note = new float[5];
        for (int i = 0; i < 5; i++)
            this.note[i] = sc.nextFloat();
    }
    public float moyenne()
    {
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += this.note[i];
        }
        return (float) sum /5;
    }
}
