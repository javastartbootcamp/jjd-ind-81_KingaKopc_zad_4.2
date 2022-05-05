package pl.javastart.task;

public class ToDoTest {
    public static void main(String[] args) {

        Person person1 = new Person("Jan", "Kowalski");
        Person person2 = new Person("Barbara", "Malina");
        Person person3 = new Person("Anna", "Porządna");

        Task task1 = new Task("Pranie", "Koszule męskie", true,
                person1);
        Task task2 = new Task("Mycie", "Okna i podłogi", true,
                person2);
        Task task3 = new Task("Prasowanie", "Koszule męskie", true,
                person3);


        ToDoTask tasker = new ToDoTask();
        boolean highPriority = tasker.getHighPriority(task1);
        System.out.println(highPriority);

        boolean mediumPriority = tasker.getMediumPriority(task2);
        System.out.println(mediumPriority);

        boolean lowPriority = tasker.getLowPriority(task3);
        System.out.println(lowPriority);
    }
}
//Nie mogę sobie poradzić z końcową cześcią zadania:
//Zadanie ma priorytet wysoki, jeśli do pola priorytet przypisana jest wartość dodatnia,
// normalny oznacza wartość 0,a niski wartość ujemną.
// Utwórz kilka przykładowych obiektów reprezentujących zadania i przetestuj stworzone
// metody wyświetlając wartości ich priorytetów.