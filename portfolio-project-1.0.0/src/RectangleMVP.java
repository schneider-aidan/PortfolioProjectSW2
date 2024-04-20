
/**
 * Rectangle represented by four points on an x-y plane. The height and width of
 * the rectangle must be parallel to the x and y axis for this implementation in
 * order to be a valid rectangle. The height is the length of the left and right
 * sides or the difference in y of the top and bottom coordinates and the width
 * is the top and bottom lengths or difference in x of the right and left
 * coordinates.
 */
public final class Rectangle {
    public final double epsilon = 0.0001;

    private double BLx = 0;
    private double BLy = 0;
    private double BRx = 0;
    private double BRy = 0;
    private double TLx = 0;
    private double TLy = 0;
    private double TRx = 0;
    private double TRy = 0;

    /*
     * Kernel Methods
     */

    /**
     * Bottom left point of rectangle.
     */
    public void setBL(double x, double y) {
        this.BLx = x;
        this.BLy = y;
    }

    public void setBR(double x, double y) {
        this.BRx = x;
        this.BRy = y;
    }

    public void setTL(double x, double y) {
        this.TLx = x;
        this.TLy = y;
    }

    public void setTR(double x, double y) {
        this.TRx = x;
        this.TRy = y;
    }

    public double getBLx() {
        return this.BLx;
    }

    public double getBLy() {
        return this.BLy;
    }

    public double getBRx() {
        return this.BRx;
    }

    public double getBRy() {
        return this.BRy;
    }

    public double getTLx() {
        return this.TLx;
    }

    public double getTLy() {
        return this.TLy;
    }

    public double getTRx() {
        return this.TRx;
    }

    public double getTRy() {
        return this.TRy;
    }

    /*
     * Secondary Methods
     */
    public double rectangleHeight() {
        return this.getTLy() - this.getBLy();
    }

    public double rectangleWidth() {
        return this.getBRx() - this.getBLx();
    }

    public double rectangleArea() {
        return (this.getTLy() - this.getBLy())
                * (this.getBRx() - this.getBLx());
    }

    public double rectanglePerimeter() {
        return 2 * (this.getTLy() - this.getBLy())
                + 2 * (this.getBRx() - this.getBLx());
    }

    public boolean pointInRectangle(double x, double y) {
        return x >= this.getBLx() && x <= this.getBRx() && y >= this.getBLy()
                && y <= this.getTLy();
    }

    public boolean rectangleCentered(double x, double y) {
        double centerX = this.getBRx() - this.getBLx();
        double centerY = this.getTLy() - this.getBLy();

        double tempX = centerX - x;
        if (tempX < 0) {
            tempX *= -1;
        }

        double tempY = centerY - y;
        if (tempY < 0) {
            tempY *= -1;
        }

        return this.epsilon > tempX && this.epsilon > tempY;
    }

    public void findCenter(Double x, Double y) {
        x = this.getBRx() - this.getBLx();
        y = this.getTLy() - this.getBLy();
    }

    /**
     * Determines if the parameter rectangle fits in this
     */
    public boolean fitInside(Rectangle x) {
        double height1 = x.rectangleHeight();
        double width1 = x.rectangleWidth();

        double height2 = this.rectangleHeight();
        double width2 = this.rectangleWidth();

        return height2 > height1 && width2 > width1;
    }

    /**
     * Changes top coordinates to make height realized
     */
    public void setHeight(double length) {
        this.setTR(this.getTRx(), this.getBRy() + length);
        this.setTL(this.getTLx(), this.getBLy() + length);
    }

    /**
     * Changes right side coordinates to make width realized
     */
    public void setWidth(double length) {
        this.setBR(this.getBLx() + length, this.getBRy());
        this.setTR(this.getTLx() + length, this.getTRy());
    }

}

public static int main(String[] args){
        Rectangle temp = new Rectangle();
        temp.setBL(0,0);
        temp.setTL(0,10);
        temp.setBR(10,0);
        temp.setTR(10,10);

        Rectangle temp2 = new Rectangle();
        temp2.setBL(1,1);
        temp2.setTL(1,9);
        temp2.setBR(9,1);
        temp2.setTR(9,9);

        return 0;
        }