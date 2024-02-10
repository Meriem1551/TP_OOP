public class Voiture_Derivee extends Vehicule{
    private int nombreDePortes;

    public Voiture_Derivee(boolean moteur, int vitessMax, int nombreDePortes)
    {
        super(moteur, vitessMax);
        this.nombreDePortes = nombreDePortes;
    }
    public String toString()
    {
        return super.toString()+ ", nombre de portes est:"+nombreDePortes;
    }
}
