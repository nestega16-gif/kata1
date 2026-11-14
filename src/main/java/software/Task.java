package software;

import java.time.LocalDate;

public class Task {
    private final String title;
    private final LocalDate limitDate;

    public Task(String title, LocalDate limitDate) {
        this.title = title;
        this.limitDate = limitDate;
    }

    public boolean isFinished(){
        return limitDate.toEpochDay() < LocalDate.now().toEpochDay();
    }
}
