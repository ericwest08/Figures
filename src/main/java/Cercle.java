public class Cercle extends Figura {
    private double r;

    public Cercle(double rad)
    {
        this.r = rad;
    }

    public void setR(double radio)
    {
        this.r = radio;
    }

    public double getR()
    {
        return r;
    }

    public double area()
    {
        return Math.PI*r*r;
    }
}
