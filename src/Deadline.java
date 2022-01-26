public class Deadline extends Todo {
    private String by;

    public Deadline(String description, String by){
        super(description);
        setBy(by);
    }

    public String getBy(){
        return by;
    }

    public void setBy(String by){
        this.by = by;
    }
}