package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person person = new Person("Javier", LocalDate.of(2006, 4, 16));
        System.out.println(person.age());
    }
}
