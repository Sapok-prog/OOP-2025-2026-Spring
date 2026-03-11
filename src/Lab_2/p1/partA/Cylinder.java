package Lab_2.p1.partA;

public class Cylinder extends Shade3D {

    private double radius , height;

    public Cylinder(double radius, double height){

        this.radius = radius;
        this.height = height;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double volume() {

        return PI * Math.pow(radius , 2) * height;

    }

    @Override
    public double surfaceArea() {

        return (2 * PI * radius * height) + (2 * PI * Math.pow(radius , 2));

    }
}
