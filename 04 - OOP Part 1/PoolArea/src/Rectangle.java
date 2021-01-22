public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0) {
            this.width = 0;
        }

        if (length < 0) {
            this.length = 0;
        }
    }
}
