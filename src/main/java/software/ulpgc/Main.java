package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pepe", 12, LocalDate.of(1970, 1, 1));
        System.out.println(student1.age());
        Student student2 = new Student("Jose", 4, LocalDate.of(2006,LocalDate.now().getMonthValue() , LocalDate.now().getDayOfMonth()) );
        System.out.println(student2.age());

    }
}
