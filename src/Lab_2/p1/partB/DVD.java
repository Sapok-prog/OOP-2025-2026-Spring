package Lab_2.p1.partB;

public class DVD extends LibraryItem{

    private int duration;

    public DVD(int duration, String title , String author , int publicationYear){

        super(title , author , publicationYear);
        this.duration = duration;

    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void interact(){
        System.out.println("Play " + getTitle() + " by " + getAuthor() + ", duration is " + getDuration());
    }

    @Override
    public String toString(){
        return toString() + "\n duration : " + getDuration();
    }
}
