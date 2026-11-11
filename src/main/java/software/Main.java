package software;

import java.time.LocalDate;

public class Main {
    static void main() {
        Car car = new Car("Toyota", LocalDate.of(2006, 11, 10));
        System.out.println(car.yearsFromPurchase());
    }
}
