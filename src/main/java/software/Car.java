package software;

import java.time.LocalDate;

public record Car(String branch, LocalDate purchaseDate) {

    public long yearsFromPurchase() {
        return toYear(LocalDate.now().toEpochDay() - purchaseDate.toEpochDay());
    }

    public static final int DAYS_PER_YEAR = 365;

    private long toYear(long days) {
        return days / DAYS_PER_YEAR;
    }


}
