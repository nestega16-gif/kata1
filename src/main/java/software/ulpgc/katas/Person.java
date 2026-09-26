package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate datebirth;

    public Person(String name, LocalDate datebirth) {
        this.name = name;
        this.datebirth = datebirth;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDatebirth() {
        return datebirth;
    }

    public int age() {
        return toYears(LocalDate.now().toEpochDay() - datebirth.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days / 365.25);
    }

}
