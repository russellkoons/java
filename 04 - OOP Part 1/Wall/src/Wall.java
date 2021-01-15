public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;

        if (this.width < 0) {
            this.width = 0;
        }

        if (this.height < 0) {
            this.height = 0;
        }
    }
}
