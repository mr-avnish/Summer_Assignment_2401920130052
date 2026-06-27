public class Box3D extends Box {

    double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {

        Box3D obj = new Box3D(10, 5, 2);

        System.out.println("Area: " + obj.area());
        System.out.println("Volume: " + obj.volume());
    }
}
