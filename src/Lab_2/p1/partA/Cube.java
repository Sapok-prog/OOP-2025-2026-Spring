package Lab_2.p1.partA;

public class Cube extends Shade3D {

    private int edge;

    public Cube(int edge){
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public double volume() {
        return Math.pow(edge , 3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(edge , 2);
    }
}
