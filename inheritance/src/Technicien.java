public class Technicien extends Employé{
    int grade;
    public Technicien(String nom, int age, float salaire, int grade)
    {
      this.nom = nom;
      this.age = age;
      this.salaire = salaire;
      this.grade = grade;
    }
    public int prime()
    {
        if (this.grade == 1)
            return 100;
        if (this.grade == 2)
            return 200;
        if (this.grade == 3)
            return 300;
        return 0;
    }
    public String toString()
    {
        return super.toString()+", Grade"+grade;
    }
    public float calculeSalaire()
    {
        salaire = super.calculeSalaire() ;
        salaire = salaire+prime();
        return salaire;
    }
}
