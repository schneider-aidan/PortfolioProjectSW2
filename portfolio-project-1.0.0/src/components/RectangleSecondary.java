/**
 *
 */
public abstract class RectangleSecondary implements Rectangle {

    @Override
    public double rectangleHeight() {
        return this.getTRy() - this.getBLy();
    }

    @Override
    public double rectangleWidth() {
        return this.getTRx() - this.getBLx();
    }

    @Override
    public double rectangleArea() {
        return (this.getTRy() - this.getBLy())
                * (this.getTRx() - this.getBLx());
    }

    @Override
    public double rectanglePerimeter() {
        return 2 * (this.getTRy() - this.getBLy())
                + 2 * (this.getTRx() - this.getBLx());
    }

    @Override
    public boolean pointInRectangle(double x, double y) {
        return x >= this.getBLx() && x <= this.getTRx() && y >= this.getBLy()
                && y <= this.getTRy();
    }

    @Override
    public boolean rectangleCentered(double x, double y) {
        double epsilon = 0.0001;
        double centerX = this.getTRx()
                - ((this.getTRx() - this.getBLx()) / 2.0);
        double centerY = this.getTRy()
                - ((this.getTRy() - this.getBLy()) / 2.0);

        double tempX = centerX - x;
        if (tempX < 0) {
            tempX *= -1;
        }

        double tempY = centerY - y;
        if (tempY < 0) {
            tempY *= -1;
        }

        return epsilon > tempX && epsilon > tempY;
    }

    @Override
    public double findCenterx() {
        return this.getBLx() + ((this.getTRx() - this.getBLx()) / 2.0);
    }

    @Override
    public double findCentery() {
        return this.getBLy() + ((this.getTRy() - this.getBLy()) / 2.0);
    }

    @Override
    public boolean fitInside(Rectangle x) {
        double height1 = x.rectangleHeight();
        double width1 = x.rectangleWidth();

        double height2 = this.rectangleHeight();
        double width2 = this.rectangleWidth();

        return height2 > height1 && width2 > width1;
    }

    @Override
    public void setHeight(double length) {
        this.setTR(this.getTRx(), this.getBLy() + length);
    }

    @Override
    public void setWidth(double length) {
        this.setTR(this.getBLx() + length, this.getTRy());
    }

    @Override
    public boolean isValidRectangle() {
        return this.getBLx() < this.getTRx() && this.getBLy() < this.getTRy();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle r = (Rectangle) obj;
        if (this.getBLx() != r.getBLx() || this.getBLy() != r.getBLy()
                || this.getTRx() != r.getTRx() || this.getTRy() != r.getTRy()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return Double.toString(this.getBLx()) + ", "
                + Double.toString(this.getBLy()) + ", "
                + Double.toString(this.getTRx()) + ", "
                + Double.toString(this.getTRy());
    }
}
