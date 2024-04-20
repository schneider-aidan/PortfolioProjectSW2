/**
 * A valid rectangle in this case is one where it is not a line or a single
 * point and the top right point of the rectangle has a greater x and y value
 * than the bottom left(will probably add a method for this).
 */
public interface Rectangle extends RectangleKernel {

    /**
     * Calculates the height of {@code this}.
     *
     * @return height of {@code this}
     * @requires {@code this} is a valid rectangle
     * @ensures rectangleHeight = TRy - BLy
     */
    double rectangleHeight();

    /**
     * Calculates the width of {@code this}.
     *
     * @return width of {@code this}
     * @requires {@code this} is a valid rectangle
     * @ensures rectangleWidth = TRx - BLx
     */
    double rectangleWidth();

    /**
     * Calculates the area of {@code this}.
     *
     * @return area of {@code this}
     * @requires {@code this} is a valid rectangle
     * @ensures rectangleArea = Width * Height
     */
    double rectangleArea();

    /**
     * Calculates the perimeter of {@code this}.
     *
     * @return perimeter of {@code this}
     * @requires {@code this} is a valid rectangle
     * @ensures rectanglePerimeter = 2*(width) + 2*(height)
     */
    double rectanglePerimeter();

    /**
     * Determines if the point ({@code x}, {@code y}) is contained in or on
     * {@code this}.
     *
     * @param x
     *            x coordinate of some point
     * @param y
     *            y coordinate of some point
     *
     * @return true if ({@code x},{@code y}) is in or on {@code this}
     * @requires {@code this} is a valid rectangle
     * @ensures pointInRectangle = true if point is in or on rectangle
     */
    boolean pointInRectangle(double x, double y);

    /**
     * Determines if {@code this} is centered around the point ({@code x},
     * {@code this}).
     *
     * @param x
     *            x coordinate of center
     * @param y
     *            y coordinate of center
     *
     * @return true if ({@code x},{@code y}) is center
     * @requires {@code this} is a valid rectangle
     * @ensures rectangleCentered = true if (x,y) is center
     */
    boolean rectangleCentered(double x, double y);

    /**
     * Finds the x-coordinate of the center point of {@code this}.
     *
     * @return x-coordinate of {@code this}
     * @requires {@code this} is a valid rectangle
     * @ensures x = center of {@code this}
     */
    double findCenterx();

    /**
     * Finds the y-coordinate of the center point of {@code this}.
     *
     * @return y-coordinate of {@code this}
     * @requires {@code this} is a valid rectangle
     * @ensures y = center of {@code this}
     */
    double findCentery();

    /**
     * Determines if a given rectangle {@code x} fits inside of {@code this}.
     *
     * @param x
     *            Rectangle to fit inside {@code this}
     *
     * @return true if {@code x} fits in {@code this}
     * @requires {@code x} is a valid rectangle
     * @ensures fitInside = this.BL< x.BL && this.TR > x.TR
     */
    boolean fitInside(Rectangle x);

    /**
     * Sets the y value of the top right coordinate based on the given
     * {@code length}.
     *
     * @param length
     *            length from {@code BLy} to {@code TRy}
     *
     * @updates TRy
     * @requires length > 0
     * @ensures this.TRy = this.BLy + length
     */
    void setHeight(double length);

    /**
     * Sets the x value of the top right coordinate based on the given
     * {@code length}.
     *
     * @param length
     *            length from {@code BLx} to {@code TRx}
     *
     * @updates TRx
     * @requires length > 0
     * @ensures this.TRx = this.BLx + length
     */
    void setWidth(double length);

    /**
     * Checks that {@code this} fits within the representation.
     *
     * @return true if {@code this} is a valid rectangle, false otherwise
     * @ensures true if valid, false if not.
     */
    boolean isValidRectangle();
}
