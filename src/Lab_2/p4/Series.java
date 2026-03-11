package Lab_2.p4;

public class Series extends Circuit{

    private Circuit circuit1;
    private Circuit circuit2;

    public Series(Circuit circuit1 , Circuit circuit2){

        this.circuit1 = circuit1;
        this.circuit2 = circuit2;

    }

    @Override
    public double getResistance() {
        return circuit1.getResistance() + circuit2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return getResistance() * getCurrent();
    }

    @Override
    public void applyPotentialDiff(double V) {

        double totalResistance = getResistance();
        double current = V / totalResistance;

        double V1 = current * circuit1.getResistance();
        double V2 = current * circuit2.getResistance();

        circuit1.applyPotentialDiff(V1);
        circuit2.applyPotentialDiff(V2);

    }
}
