package pl.javastart.task;

public class ToDoTest {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Barbara", "Malina");
        Person person3 = new Person("Anna", "Porządna");

        Task task1 = new Task("Pranie", "Koszule męskie", 1,
                person1);
        Task task2 = new Task("Mycie", "Okna i podłogi", -1,
                person2);


        boolean highPriority = task1.highPriority();
        System.out.println(highPriority);

        boolean mediumPriority = task1.mediumPriority();
        System.out.println(mediumPriority);

        boolean lowPriority = task2.lowPriority();
        System.out.println(lowPriority);
    }
}
