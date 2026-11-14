package software;

import java.time.LocalDate;

public record Task(String title, LocalDate limitDate) {

    public boolean isFinished() {
        return limitDate.toEpochDay() < LocalDate.now().toEpochDay();
    }
}
