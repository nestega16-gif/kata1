package software.ulpgc.katas;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthDay;

    public Person(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String name() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int age() {
        return toYears(LocalDate.now().toEpochDay() - birthDay.toEpochDay());
    }

    private int toYears(long days) {
        return (int) (days/365.25);
    }
}
