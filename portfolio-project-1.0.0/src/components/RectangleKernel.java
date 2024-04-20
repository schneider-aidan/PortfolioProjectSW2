/**
 *
 */
public interface RectangleKernel {
    /**
     * Sets the value of the coordinates of the bottom left point of
     * {@code this}.
     *
     * @param x
     *            x coordinate of the bottom left point of {@code this}
     * @param y
     *            y coordinate of the bottom left point of {@code this}
     *
     * @updates BLx, BLy
     *
     * @requires {@code this.BLx < this.TRx && this.BLy < this.TRy}
     *
     * @ensures this.BLx = x and this.BLy = y
     */
    void setBL(double x, double y);

    /**
     * Sets the value of the coordinates of the top right point of {@code this}.
     *
     * @param x
     *            x coordinate of the top right point of {@code this}
     * @param y
     *            y coordinate of the top right point of {@code this}
     *
     * @updates TRx, TRy
     *
     * @requires {@code this.TRx > this.BLx && this.TRy > this.BLy}
     *
     * @ensures this.TRx = x and this.TRy = y
     */
    void setTR(double x, double y);

    /**
     * @return the value of BLx
     *
     * @requires {@code this.BLx /= null}
     *
     * @ensures getBLx = BLx
     */
    double getBLx();

    /**
     * @return the value of BLy
     *
     * @requires {@code this.BLy /= null}
     *
     * @ensures getBLy = BLy
     */
    double getBLy();

    /**
     * @return the value of TRx
     *
     * @requires {@code this.TRx /= null}
     *
     * @ensures getTRx = TRx
     */
    double getTRx();

    /**
     * @return the value of TRy
     *
     * @requires {@code this.TRy /= null}
     *
     * @ensures getTRy = TRy
     */
    double getTRy();

}
