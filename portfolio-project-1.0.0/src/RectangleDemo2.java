import components.sequence.Sequence;
import components.sequence.Sequence1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public final class RectangleDemo2 {

    /**
     * Algorithm that searches for the largest of 6 rectangles that will fit
     * inside of the main rectangle.
     */
    public static void main(String[] args) {
        Rectangle recMain = new Rectangle1();
        recMain.setBL(-0.1, -0.1);
        recMain.setWidth(10.2);
        recMain.setHeight(10.2);

        Rectangle rec1 = new Rectangle1();
        rec1.setBL(0, 0);
        rec1.setWidth(4);
        rec1.setHeight(4);

        Rectangle rec2 = new Rectangle1();
        rec2.setBL(0, 0);
        rec2.setWidth(2);
        rec2.setHeight(3);

        Rectangle rec3 = new Rectangle1();
        rec3.setBL(0, 0);
        rec3.setWidth(6);
        rec3.setHeight(7);

        Rectangle rec4 = new Rectangle1();
        rec4.setBL(0, 0);
        rec4.setWidth(9);
        rec4.setHeight(10);

        Rectangle rec5 = new Rectangle1();
        rec5.setBL(0, 0);
        rec5.setWidth(10);
        rec5.setHeight(10);

        Rectangle rec6 = new Rectangle1();
        rec6.setBL(0, 0);
        rec6.setWidth(15);
        rec6.setHeight(15);

        Sequence<Rectangle> n = new Sequence1L<>();
        n.add(0, rec1);
        n.add(0, rec2);
        n.add(0, rec3);
        n.add(0, rec4);
        n.add(0, rec5);
        n.add(0, rec6);

        SimpleWriter out = new SimpleWriter1L();

        Rectangle largestFitting = rec1;

        while (n.length() > 0) {
            Rectangle x = n.remove(0);
            if (recMain.fitInside(x)) {
                if (x.rectangleArea() > largestFitting.rectangleArea()) {
                    largestFitting = x;
                }
            }
        }

        out.println("Bottom Left: (" + largestFitting.getBLx() + ", "
                + largestFitting.getBLy() + ")");

        out.println("Top Right: (" + largestFitting.getTRx() + ", "
                + largestFitting.getTRy() + ")");
        out.println("Area: " + largestFitting.rectangleArea());

        out.println("Original Rectangle Area: " + recMain.rectangleArea());
        out.println("Percentage of Rectangle Filled: "
                + largestFitting.rectangleArea() / recMain.rectangleArea() * 100
                + "%");

        out.close();

    }

}
