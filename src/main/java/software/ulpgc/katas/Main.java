package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {

    public static void main() {
        Person person = new Person("Lucía", LocalDate.of(2005, 10, 7));
        System.out.println(person.age());

    }
}
