public class Rectangle {
    float X, Y, largeur, longueur;
    public void initialiser(float X, float Y, float larg, float longue)
    {
        this.X = X;
        this.Y = Y;
        this.largeur = larg;
        this.longueur = longue;
    }
    public void deplacer(float dx, float dy)
    {
        this.X = this.X + dx;
        this.Y = this.Y + dy;
    }
    public float surface()
    {
        return this.largeur*this.longueur;
    }
    public float perimetre()
    {
        return (this.longueur + this.largeur) * 2;
    }
}
