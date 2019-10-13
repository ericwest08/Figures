import java.util.Arrays;

public class Main implements Gestor {
    public double sum(Figura[] l) {
        double r = 0;
        for (Figura f:l) {r += f.area();}
        return r;
    }

    public void sort(Figura[] l) {
        Arrays.sort(l);
    }
    public static void main(String[] args) {
        Figura[] l = new Figura[4];
        l[0] = new Square(3);
        l[1] = new Rectangle(5,8);
        l[2] = new Triangle(3,4);
        l[3] = new Cercle(2);


        Gestor gf = new Main();

        System.out.println("Area cuadrado: " + l[0].area());
        System.out.println("Area rectangulo: " + l[1].area());
        System.out.println("Area triangulo: " + l[2].area());
        System.out.println("Area circulo: " + l[3].area());

        System.out.println("Suma area de las figuras: "+ gf.sum(l));

        gf.sort(l);

        System.out.println("Orden: ");

        for (Figura f: l) {

            System.out.println( " "+f.getClass().getSimpleName()+" "+f.area());
        }


    }
}

