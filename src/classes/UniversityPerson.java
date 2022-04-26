package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UniversityPerson extends Person {
   protected LocalDate entranceDate;

   public UniversityPerson(String name, String address, LocalDate birthday, String phone, String email, LocalDate entranceDate) {
      super(name, address, birthday, phone, email);
      this.setEntranceDate(entranceDate);
   }

   public LocalDate getEntranceDate() {
      return entranceDate;
   }

   public void setEntranceDate(LocalDate entranceDate) {
      this.entranceDate = utilClass.getCorrectDate(entranceDate);
   }

   @Override
   public String toString() {
      return super.toString().replace("}", "") + ", entrance date: " + entranceDate.format(DateTimeFormatter.BASIC_ISO_DATE) + "}";
   }
}