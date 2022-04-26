package classes;

import java.time.LocalDate;

public class utilClass {
   public static LocalDate getCorrectDate(LocalDate date) {
      return (!date.isAfter(LocalDate.now()) ? date : LocalDate.of(0, 0, 0));
   }
}