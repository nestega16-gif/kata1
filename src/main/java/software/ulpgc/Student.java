package software.ulpgc;

import java.time.LocalDate;
import java.util.Date;

public record Student(String name, int id, LocalDate birthDate) {
    public int age() {
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    private static final int DAYS_TO_YEAR = 365;

    private int toYears(long days) {
        return (int) (days / DAYS_TO_YEAR);
    }
}
