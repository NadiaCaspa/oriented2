public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 1;
        this.length = 2;

    }

    public Rectangle(double width, double length) {
        setLW(width, length);
    }

    public Rectangle(double width, double length, boolean isFilled, String color) {
        super(isFilled, color);
        // gets values for x and passes it into width and length.
        setLW( width, length);
    }

    public void setLW(double x, double y) {
        // check to see if x is greater than y and assigns variables to each
        if (x < y) {
            this.width = x;
            this.length = y;
        } else {
            this.length = x;
            this.width = y;

        }
    }
    public double getArea(){
      return this.length * this.width;
    }
    @Override
    public String toString(){
        return "Width: " + this. width + "\nLength:" + this.length + "\nArea: " + getArea() + "\n" + super.toString();
    }
}