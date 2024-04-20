/**
 * @convention <pre>
 * A valid Rectangle has this.BLx < this.TRx and this.BLy < this.TRy
 *
 * The edges of the rectangle will be parallel to the axes meaning that
 * the top and bottom are measured by this.TRx - this.BLx and the same for
 * the left and right with the y coordinates.
 * </pre>
 *
 * @correspondence <pre>
 * this = the rectangle whose bottom left point is (this.BLx, this.BLy)
 * and whose top right point is (this.TRx, this.TRy)
 * </pre>
 */
public class Rectangle1 extends RectangleSecondary {
    /*
     * Private members --------------------------------------------------------
     */
    
    /**
     * Holds value of Bottom Left coordinate's x-value.
     */
    private double BLx = 0;

    /**
     * Holds value of Bottom Left coordinate's y-value.
     */
    private double BLy = 0;

    /**
     * Holds value of Top Right coordinate's x-value.
     */
    private double TRx = 0;

    /**
     * Holds value of Top Right coordinate's y-value.
     */
    private double TRy = 0;

    /**
     * Creates a new rectangle.
     */
    private void createNewRep() {
        this.BLx = 0;
        this.BLy = 0;
        this.TRx = 0;
        this.TRy = 0;
    }

    /**
     * No argument constructor.
     */
    public Rectangle1() {
        this.createNewRep();
    }

    /**
     * Creates and returns an object of the same dynamic type of {@code this}.
     *
     * @return an object of the same dynamic type
     */
    public final Rectangle newInstance() {
        try {
            return this.getClass().getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new AssertionError(
                    "Cannot construct object of type " + this.getClass());
        }
    }

    /**
     * returns {@code this} back to its no argument constructor state.
     */
    public final void clear() {
        this.createNewRep();
    }

    /**
     * Takes data from {@code x} and puts it in {@code this}.
     *
     * @param x
     *            rectangle with data to transfer to {@code this}
     */
    public final void transferFrom(Rectangle x) {
        Rectangle1 localSource = (Rectangle1) x;
        this.BLx = localSource.BLx;
        this.BLy = localSource.BLy;
        this.TRx = localSource.TRx;
        this.TRy = localSource.TRy;
        localSource.createNewRep();

    }

    /*
     * Methods ----------------------------------------------------------------
     */
    @Override
    public void setBL(double x, double y) {
        this.BLx = x;
        this.BLy = y;
    }

    @Override
    public void setTR(double x, double y) {
        this.TRx = x;
        this.TRy = y;
    }

    @Override
    public double getBLx() {
        return this.BLx;
    }

    @Override
    public double getBLy() {
        return this.BLy;
    }

    @Override
    public double getTRx() {
        return this.TRx;
    }

    @Override
    public double getTRy() {
        return this.TRy;
    }
}
