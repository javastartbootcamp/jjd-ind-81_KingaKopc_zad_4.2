package pl.javastart.task;

class Task {
    String name;
    String description;
    boolean priority;
    Person person;

    public Task(String name, String description, boolean priority, Person person) {
        this(name, description);
        this.priority = priority;
        this.person = person;
    }

    public Task(String name, String description, boolean priority) {
        this(name, description);
        this.priority = priority;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
