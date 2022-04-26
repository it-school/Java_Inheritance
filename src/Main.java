import classes.*;

import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
      /*
         Person (name, address, birthday, phone, email)
            UniversityPerson (entrance date)
               Student (specialty, course)
               Employee (department, role)
       */
      Person person1 = new Person("Bill", "Odessa", LocalDate.of(2000, 12, 15), "+380963258741", "email@email.com");
      System.out.println(person1);

      UniversityPerson universityPerson = new UniversityPerson("John", "Odessa", LocalDate.of(1999, 1, 1), "+38097867896581", "univ@email.com", LocalDate.of(2021, 9, 1));
      System.out.println(universityPerson);

      Student student = new Student("Oleg", "Kiev", LocalDate.of(2003, 7, 21), "+38058254465466", "stud@op.edu.ua", LocalDate.of(2021, 9, 1), "151", 1);
      System.out.println(student);

      Employee employee = new Employee("Joe", "London", LocalDate.of(1983, 12, 31), "+38054465466", "staff@op.edu.ua", LocalDate.of(2011, 1, 1), "ICS", Roles.educator);
      System.out.println(employee);

      UniversityPerson[] people = new UniversityPerson[2];
      people[0] = student;
      people[1] = employee;

      System.out.println("\n-----------------\n");
      for (Object person : people) {
         System.out.println(person);
      }
   }
}