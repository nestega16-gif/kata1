package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    public static void main() {
        Person person = new Person("Ricardo", LocalDate.of(1990, 1, 1));
        System.out.println(person.age());
    }

}
