public class Vehicule {
    private boolean moteur;
    private int vitesseMax;
    public Vehicule(boolean moteur, int vitesseMax)
    {
        this.moteur = moteur;
        this.vitesseMax = vitesseMax;
    }
    public String toString()
    {
        if (moteur)
            return "vehicule avec moteur, la vitesse maximal:"+vitesseMax;
        else
            return "vehicule sans moteur, la vitesse maximal:"+vitesseMax;
    }
    public void Vmax(){
        System.out.println(vitesseMax);
    }
}
