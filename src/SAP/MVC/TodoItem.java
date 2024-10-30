package SAP.MVC;

public class TodoItem {
    private String task;
    private boolean done;

    public TodoItem(String task) {
        this.task = task;
        this.done = false;
    }

    public String getTask() {
        return task;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
