package software;

import java.time.LocalDate;

public record Car(String branch, LocalDate purchaseDate) {

    public long yearsFromPurchase() {
        return toYear(LocalDate.now().toEpochDay() - purchaseDate.toEpochDay());
    }

    public static final double DAYS_PER_YEAR = 365.25;

    private long toYear(long days) {
        return (long) ((long) days / DAYS_PER_YEAR);
    }


}
