package classes.example1;

import java.time.LocalDate;
import java.util.Arrays;

public class Staff {
   UniversityPerson[] people;

   public Staff() {
      this.people = new UniversityPerson[0];
   }

   public void addPerson(UniversityPerson person) {
      UniversityPerson[] temp = Arrays.copyOf(people, people.length + 1);
      temp[people.length] = person;
      people = temp;
   }

   public Staff findYounger(int years)
   {
      Staff temp = new Staff();

      for (UniversityPerson person : people) {
         if (person.birthday.plusYears(years).isAfter(LocalDate.now()))
            temp.addPerson(person);
      }

      return temp;
   }

   public int getQuantity()
   {
      return people.length;
   }

   @Override
   public String toString() {
      return "Staff{" + "people=" + Arrays.toString(people) + '}';
   }
}
