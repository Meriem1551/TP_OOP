public class Main {
    public static void main(String[] args) {
        Employé employé = new Employé("Meriem", 19, 2000000);
        Technicien technicien = new Technicien("Zineb", 16, 2000, 2);
        employé.afficher();
        employé.augmentation(120.87F);
        employé.afficher();
        technicien.afficher();
        technicien.calculeSalaire();
        technicien.afficher();

        Vehicule v1 = new Vehicule(true, 120);
        Voiture_Composee v2 = new Voiture_Composee(4, v1);
        v2.obtenirVitesse();
        Voiture_Derivee v3 = new Voiture_Derivee(false, 200, 3);
        v3.Vmax();

    }
}