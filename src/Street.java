public class Street {
    private double length; // Street length
    private int a; // Intersection A
    private int b; // Intersection B

    Street (double length, int a, int b) {
        this.length = length;
        this.a = a;
        this.b = b;
    }

    public double getLength() {
        return length;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
