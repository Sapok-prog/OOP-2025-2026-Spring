package Lab_2.p1.partC;

import java.util.Objects;

public class iPad extends Device{

    public enum Version{
        NO_VERSION,
        PRO,
        PRO_MAX;
    }
    private int generation;
    private Version version;

    public iPad(String name , int creationYear , Version version , int generation){
        super(name , creationYear);
        this.generation = generation;
        this.version = version;
    }

    public int getGeneration() {
        return generation;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\n generation : " + generation +
                "\n version : " + version;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        if(o == null || getClass() != o.getClass()){
            return false;
        }

        if(!super.equals(o)) return false;

        iPad toCompare = (iPad) o;
        return (getGeneration() == toCompare.getGeneration() && version == toCompare.version) && (getName().equals(toCompare.getName()) && getCreationYear() == toCompare.getCreationYear());

    }

    @Override
    public int hashCode(){

        return Objects.hash(getCreationYear() ,getName() , getGeneration() , version);

    }

}
