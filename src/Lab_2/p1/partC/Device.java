package Lab_2.p1.partC;
import java.util.Objects;

public class Device {

    private String name;
    private int creationYear;

    public Device(String name , int creationYear){
        this.name = name;
        this.creationYear = creationYear;
    }

    public String getName() {
        return name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public String toString(){
        return "name : " + getName() +
                "\n creation year : " + getCreationYear();
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(o == null || getClass() != o.getClass()){
            return false;
        }

        Device toCompare = (Device)o;
        return (getName().equals(toCompare.getName()) && getCreationYear() == toCompare.getCreationYear());

    }

    @Override
    public int hashCode(){

        return Objects.hash(getCreationYear() ,getName());

    }
}
