public class Voiture_Composee {
    private Vehicule ve;
    private int nombreDePortes;

    public Voiture_Composee(int nombreDePortes, Vehicule ve)
    {
        this.ve = ve;
        this.nombreDePortes = nombreDePortes;
    }
    public String toString()
    {
        return ve.toString()+ ", noombre de portes:"+nombreDePortes;
    }
    public void obtenirVitesse()
    {
        ve.Vmax();
    }
}
