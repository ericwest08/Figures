public class Triangle extends Figura {

    private double b;
    private double h;

    public Triangle(double base, double altura)
    {
        this.b=base;
        this.h=altura;
    }

    public void setB(double base)
    {
        this.b=base;
    }

    public double getB()
    {
        return b;
    }

    public void setH(double altura)
    {
        this.h = altura;
    }

    public double getH()
    {
        return h;
    }

    @Override
    public double area() {
        return (b*h)/2;
    }

}
