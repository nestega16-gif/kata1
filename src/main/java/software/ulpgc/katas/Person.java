package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public LocalDate birthdate() {
        return birthdate;
    }

    public String name() {
        return name;
    }

    public int age() {
        return toYears(LocalDate.now().toEpochDay() - this.birthdate.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days / 365.25);
    }
}
