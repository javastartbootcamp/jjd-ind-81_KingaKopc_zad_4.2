package pl.javastart.task;

class Task {
    String name;
    String description;
    int priority;
    Person person;

    Task(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }


    Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    Task(String name, String description) {
        this.name = name;
        this.description = description;
    }


    boolean highPriority() {
        return this.priority > 0;
    }

    boolean mediumPriority() {
        return this.priority == 0;
    }

    boolean lowPriority() {
        return this.priority < 0;
    }

}


