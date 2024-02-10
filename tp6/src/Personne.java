import java.util.Scanner;

public class Personne {
      String nom;
      String prenom;
      int age;
      String address;

      public void initialise()
      {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first name");
          this.nom = sc.next();
          System.out.println("Enter the last name");
          this.prenom = sc.next();
          System.out.println("Enter the age");
          this.age = sc.nextInt();
          System.out.println("Enter the address");
          this.address = sc.next();
      }
      public void demenager(String address)
      {
          this.address = address;
      }
}
