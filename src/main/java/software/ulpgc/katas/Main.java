package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person1 = new Person("Julio", LocalDate.of(2006, 9, 26));
        System.out.println(person1.age());

    }
}
