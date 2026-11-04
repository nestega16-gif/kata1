package software.ulpgc;

import java.util.Date;

public class Student {
    private final String name;
    private final int id;
    private final Date birthDate;

    public Student(String name, int id, Date birthDate) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
