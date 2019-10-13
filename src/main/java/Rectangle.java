public class Rectangle extends Figura {

    private double l1;
    private double l2;

    public Rectangle(double lado1, double lado2)
    {
        this.l1 = lado1;
        this.l2 = lado2;
    }

    public void setL1(double lado1)
    {
        this.l1 = lado1;
    }

    public double getL1()
    {
        return l1;
    }

    public void setL2(double lado2)
    {
        this.l2 = lado2;
    }

    public double getL2()
    {
        return l2;
    }


    @Override
    public double area()
    {
        return l1* l2;
    }

}
