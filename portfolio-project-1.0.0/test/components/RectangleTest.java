import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {

    public final double epsilon = 0.0001;

    protected final Rectangle createFromArgs(double x1, double y1, double x2,
            double y2) {
        Rectangle temp = new Rectangle1();
        temp.setBL(x1, y1);
        temp.setTR(x2, y2);
        return temp;
    }

    @Test
    public final void testHeight1() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(0, 0, 3, 4.5);

        double difference = 4.5 - temp.rectangleHeight();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testHeight2() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(-4, -4.5, 3, 4.5);

        double difference = 9 - temp.rectangleHeight();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testHeight3() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(-4, -4.5, 0, 0.5);

        double difference = 5 - temp.rectangleHeight();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testWidth1() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(-4.5, -4, 3.5, 4);

        double difference = 8 - temp.rectangleWidth();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testWidth2() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(0.5, 0, 3.5, 4);

        double difference = 3 - temp.rectangleWidth();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testWidth3() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(-4.5, -4, 0.5, 0);

        double difference = 5 - temp.rectangleWidth();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testArea1() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(0, 0, 1.5, 1.5);

        double difference = 2.25 - temp.rectangleArea();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testArea2() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(-2.5, -2, 2, 2.5);

        double difference = 20.25 - temp.rectangleArea();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testPerimeter1() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(-2.5, -2, 2, 2.5);

        double difference = 18 - temp.rectanglePerimeter();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testPerimeter2() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = this.createFromArgs(0.5, 0, 1, 1.5);

        double difference = 4 - temp.rectanglePerimeter();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testPointInRectanglePointIn() {
        Rectangle temp = this.createFromArgs(0, 0, 2, 2);

        assertEquals(temp.pointInRectangle(1.5, 1), true);
    }

    @Test
    public final void testPointInRectanglePointOn() {
        Rectangle temp = this.createFromArgs(0, 0, 2, 2);

        assertEquals(temp.pointInRectangle(2, 2), true);
    }

    @Test
    public final void testPointInRectanglePointOut() {
        Rectangle temp = this.createFromArgs(0, 0, 2, 2);

        assertEquals(temp.pointInRectangle(3, 3), false);
    }

    @Test
    public final void testRectangleCentered1() {
        Rectangle temp = this.createFromArgs(0, 0, 2, 2);

        assertEquals(temp.rectangleCentered(1, 1), true);
    }

    @Test
    public final void testRectangleCentered2() {
        Rectangle temp = this.createFromArgs(0, 0, 2, 2);

        assertEquals(temp.rectangleCentered(0, 0), false);
    }

    @Test
    public final void testFindCenter() {
        Rectangle temp = this.createFromArgs(0, 0, 2, 2);
        Double x = 0.0;
        Double y = 0.0;
        x = temp.findCenterx();
        y = temp.findCentery();

        double difference1 = 1 - x;
        if (difference1 < 0) {
            difference1 *= -1;
        }

        double difference2 = 1 - y;
        if (difference2 < 0) {
            difference2 *= -1;
        }

        assertEquals(difference1 < this.epsilon, true);
        assertEquals(difference2 < this.epsilon, true);
    }

    @Test
    public final void testFitInsideFits() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);
        Rectangle temp2 = this.createFromArgs(1.5, 1, 2.5, 2);

        assertEquals(temp1.fitInside(temp2), true);
    }

    @Test
    public final void testFitInsideSameSizeorBigger() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);
        Rectangle temp2 = this.createFromArgs(0, 0, 3, 3);

        assertEquals(temp1.fitInside(temp2), false);
    }

    @Test
    public final void testSetHeight1() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);

        temp1.setHeight(5);

        double difference = 5 - temp1.rectangleHeight();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testSetWidth1() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);

        temp1.setWidth(5);

        double difference = 5 - temp1.rectangleWidth();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testIsValidTrue() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);

        assertEquals(temp1.isValidRectangle(), true);
    }

    @Test
    public final void testIsValidFalse() {
        Rectangle temp1 = this.createFromArgs(0, 0, 0, 3);

        assertEquals(temp1.isValidRectangle(), false);
    }

    @Test
    public final void testEqualsTrueSameValue() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);
        Rectangle temp2 = this.createFromArgs(0, 0, 3, 3);

        assertEquals(temp1.equals(temp2), true);
    }

    @Test
    public final void testEqualsTrueSameObject() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);

        assertEquals(temp1.equals(temp1), true);
    }

    @Test
    public final void testEqualsFalse() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);
        Rectangle temp2 = this.createFromArgs(0, 0, 2, 3);

        assertEquals(temp1.equals(temp2), false);
    }

    @Test
    public final void testToString() {
        Rectangle temp1 = this.createFromArgs(0, 0, 3, 3);

        assertEquals(temp1.toString(), "0.0, 0.0, 3.0, 3.0");
    }
}
