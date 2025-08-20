public class Task {
    private int id;
    private String name;
    private boolean isDone;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.isDone = false;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public boolean isDone() { return isDone; }

    public void markDone() { this.isDone = true; }

    @Override
    public String toString() {
        return id + ". " + name + " [" + (isDone ? "Done" : "Pending") + "]";
    }
}
