package software;

import java.time.LocalDate;

public class Car {
    private final String name;
    private final LocalDate purchaseDate;

    public Car(String name, LocalDate purchaseDate) {
        this.name = name;
        this.purchaseDate = purchaseDate;
    }

    public long yearsFromPurchase(){
        return toYear(purchaseDate.toEpochDay() - purchaseDate.toEpochDay());
    }

    private long toYear(long days) {
        return days/365;
    }


}
