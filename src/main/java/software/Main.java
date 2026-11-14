package software;

import java.time.LocalDate;

public class Main {
    static void main() {
        Task task1 = new Task("Acabar kata", LocalDate.of(2026, 12, 12));
        Task task2 = new Task("Enviar kata", LocalDate.now());
        Task task3 = new Task("Empezar kata", LocalDate.of(2026,10,1));

        System.out.printf("%b %b %b", task1.isFinished(), task2.isFinished(), task3.isFinished());
    }
}
