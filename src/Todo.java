public class Todo extends Task {
    private boolean isDone;

    public Todo(String description) {
        super(description);
        isDone = false;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}