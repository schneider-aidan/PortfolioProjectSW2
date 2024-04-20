import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Rectangle1Test {
    public double epsilon = 0.0001;

    @Test
    public final void testSetBLPositive() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(1.5, 1.5);

        double difference1 = 1.5 - temp.getBLx();
        if (difference1 < 0) {
            difference1 *= -1;
        }

        double difference2 = 1.5 - temp.getBLy();
        if (difference2 < 0) {
            difference2 *= -1;
        }

        assertEquals(difference1 < this.epsilon, true);
        assertEquals(difference2 < this.epsilon, true);
    }

    @Test
    public final void testSetBLOrigin() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(0, 0);

        double difference1 = 0 - temp.getBLx();
        if (difference1 < 0) {
            difference1 *= -1;
        }

        double difference2 = 0 - temp.getBLy();
        if (difference2 < 0) {
            difference2 *= -1;
        }

        assertEquals(difference1 < this.epsilon, true);
        assertEquals(difference2 < this.epsilon, true);
    }

    @Test
    public final void testSetBLNegative() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(-1.5, -1.5);

        double difference1 = -1.5 - temp.getBLx();
        if (difference1 < 0) {
            difference1 *= -1;
        }

        double difference2 = -1.5 - temp.getBLy();
        if (difference2 < 0) {
            difference2 *= -1;
        }

        assertEquals(difference1 < this.epsilon, true);
        assertEquals(difference2 < this.epsilon, true);
    }

    @Test
    public final void testSetTRPositive() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(10.5, 10.5);

        double difference1 = 10.5 - temp.getTRx();
        if (difference1 < 0) {
            difference1 *= -1;
        }

        double difference2 = 10.5 - temp.getTRy();
        if (difference2 < 0) {
            difference2 *= -1;
        }

        assertEquals(difference1 < this.epsilon, true);
        assertEquals(difference2 < this.epsilon, true);
    }

    @Test
    public final void testSetTROrigin() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(0, 0);

        double difference1 = 0 - temp.getTRx();
        if (difference1 < 0) {
            difference1 *= -1;
        }

        double difference2 = 0 - temp.getTRy();
        if (difference2 < 0) {
            difference2 *= -1;
        }

        assertEquals(difference1 < this.epsilon, true);
        assertEquals(difference2 < this.epsilon, true);
    }

    @Test
    public final void testSetTRNegative() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(-10.5, -10.5);

        double difference1 = -10.5 - temp.getTRx();
        if (difference1 < 0) {
            difference1 *= -1;
        }

        double difference2 = -10.5 - temp.getTRy();
        if (difference2 < 0) {
            difference2 *= -1;
        }

        assertEquals(difference1 < this.epsilon, true);
        assertEquals(difference2 < this.epsilon, true);
    }

    //The First two technically also test the getters but can't hurt to have too many tests
    @Test
    public final void testGetBLxPositive() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(10.5, 10);

        double difference = 10.5 - temp.getBLx();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetBLxZero() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(0, 10);

        double difference = 0 - temp.getBLx();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetBLxNegative() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(-10.5, 10);

        double difference = -10.5 - temp.getBLx();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetBLyPositive() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(10, 10.5);

        double difference = 10.5 - temp.getBLy();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetBLyZero() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(10, 0);

        double difference = 0 - temp.getBLy();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetBLyNegative() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setBL(10, -10.5);

        double difference = -10.5 - temp.getBLy();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetTRxPositive() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(10.5, 10);

        double difference = 10.5 - temp.getTRx();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetTRxZero() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(0, 0);

        double difference = 0 - temp.getTRx();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetTRxNegative() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(-10.5, 10);

        double difference = -10.5 - temp.getTRx();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetTRyPositive() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(10, 10.5);

        double difference = 10.5 - temp.getTRy();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetTRyZero() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(10, 0);

        double difference = 0 - temp.getTRy();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }

    @Test
    public final void testGetTRyNegative() {
        //doubles so can't use assertEquals on numbers
        Rectangle temp = new Rectangle1();
        temp.setTR(10, -10.5);

        double difference = -10.5 - temp.getTRy();
        if (difference < 0) {
            difference *= -1;
        }

        assertEquals(difference < this.epsilon, true);
    }
}
