package Lab_2.p1.partA;

public class Sphere extends Shade3D {

    private double radius;

    public Sphere(double radius){

        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {

        return (3/4) * PI * Math.pow(radius , 3);

    }

    @Override
    public double surfaceArea() {

        return 4 * PI * Math.pow(radius , 2);

    }
}
