import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Figurastest {

    Gestor g = null;
    Figura[] l = null;

    @Before
    public void  setUp(){
        this.g = new Main();
        l = new Figura[4];
        l[0] = new Rectangle(3,5);
        l[1] = new Square(5);
        l[2] = new Cercle(1);
        l[3] = new Triangle(1,2);
    }
    @Test
    public void testSuma(){
        Assert.assertEquals("suma", 45, g.sum(l),1);
    }

    @Test
    public void testSort(){
        Assert.assertEquals("sort", Rectangle.class, l[0].getClass());
        g.sort(l);
        Assert.assertEquals("sort",  Square.class, l[3].getClass());
    }

}
