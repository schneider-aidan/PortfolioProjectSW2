import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public final class RectangleDemo1 {

    /**
     * Counts the number of times the hitbox is hit as a line goes from (0,8) to
     * (10, 8) simulating something like a shooting game where the player is
     * holding to shoot and moving their aim right.
     */
    public static void main(String[] args) {
        Rectangle hitbox = new Rectangle1();
        hitbox.setBL(4, 4);
        hitbox.setWidth(4);
        hitbox.setHeight(8);

        SimpleWriter out = new SimpleWriter1L();

        int numHits = 0;
        for (int i = 0; i < 10; i++) {
            if (hitbox.pointInRectangle(i, 8)) {
                numHits++;
            }
        }

        out.print(numHits);
    }

}
