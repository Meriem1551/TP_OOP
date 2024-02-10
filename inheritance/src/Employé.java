public class Employé {
    String nom;
    int age;
    float salaire;
    public Employé()
    {
        this.nom = "";
        this.age = 0;
        this.salaire = 0.0F;
    }
    public Employé(Employé e)
    {
        this.nom = e.nom;
        this.age = e.age;
        this.salaire = e.salaire;
    }
    public Employé(String nom, int age, float salaire)
    {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }
    public void augmentation(float aug)
    {
        this.salaire = this.salaire + aug;
    }
    public String toString(){
        return "Nom:" + nom+ ", Age:" + age + ", Salaire:" + salaire;
    }
    public void afficher()
    {
        String info = toString();
        System.out.println(info);
    }
    public float calculeSalaire()
    {
        return salaire;
    }
}
