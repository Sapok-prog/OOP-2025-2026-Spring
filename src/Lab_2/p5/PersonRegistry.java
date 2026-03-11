package Lab_2.p5;
import java.util.Vector;

public class PersonRegistry {

    Vector<Person> people = new Vector<>();

    public void addPerson(Person person){
        people.add(person);
    }

    public void removePerson(Person personToRemove){
        for(int i = 0;i < people.size();i++){

            if(people.get(i).equals(personToRemove)){
                people.remove(i);
            }

        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Person person : people){

            result.append(person).append("\n");

        }return result.toString();
    }

}
