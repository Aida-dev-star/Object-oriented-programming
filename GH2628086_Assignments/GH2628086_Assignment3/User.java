public abstract class User {
    protected int id;
    protected String name;
    protected String studentId;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }
}