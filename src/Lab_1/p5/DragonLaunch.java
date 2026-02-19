package Lab_1.p5;

import java.util.Stack;
import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> line;

    public DragonLaunch(){

        line = new Vector();

    }

    public void kidnap(Person p){

        line.add(p);

    }

    public int willDragonEatOrNot() {
        int stackSize = 0;
        for (Person p : line) {
            if (p.getGender() == Person.Gender.B) {
                stackSize++;
            } else {
                if (stackSize > 0) {
                    stackSize--;
                }
                else {
                    stackSize++;
                }
            }
        }
        return stackSize;
    }

}
