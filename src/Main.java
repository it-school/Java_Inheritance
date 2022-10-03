import classes.example1.*;
import classes.example2.*;

import java.time.LocalDate;

public class Main {
   private static void example1() {
    /*
       Person (name, address, birthday, phone, email)
          UniversityPerson (entrance date)
             Student (specialty, course)
             Employee (department, role)
     */

      Person person1 = new Person("Bill", "EngName", "Odessa", LocalDate.of(2000, 12, 15), "+380963258741", "email@email.com");
      System.out.println(person1);

      UniversityPerson universityPerson = new UniversityPerson("John", "EngName", "Odessa", LocalDate.of(1999, 1, 1), "+38097867896581", "univ@email.com", LocalDate.of(2021, 9, 1));
      System.out.println(universityPerson);

      Student student = new Student("Oleg", "EngName", "Kiev", LocalDate.of(2003, 7, 21), "+38058254465466", "stud@op.edu.ua", LocalDate.of(2021, 9, 1), "151", 1);
      System.out.println(student);

      Employee employee = new Employee("Joe", "EngName", "London", LocalDate.of(1983, 12, 31), "+38054465466", "staff@op.edu.ua", LocalDate.of(2011, 1, 1), "ICS", Roles.EDUCATOR);
      System.out.println(employee);

      UniversityPerson[] people = new UniversityPerson[2];
      people[0] = student;
      people[1] = employee;

      System.out.println("\n-----------------\n");
      for (Object person : people) {
         System.out.println(person);
      }

      Employee[] employees = new Employee[3];
      employees[0] = employee;
/*
      employees[1] = (Employee) universityPerson;
      employees[2] = (Employee) person1;
*/
      employees[2] = new Employee("asgdhfxj", "EngName", "dzhfxjghck", LocalDate.of(1983, 12, 31), "3456789", "dsfghcjk@sdfghxj", LocalDate.of(1983, 12, 31), "IIBRT", Roles.STAFF);
      System.out.println("\n-----------------\n");
      for (Object person : employees) {
         System.out.println(person);
      }

      System.out.println("\n\n\n-----------------\n");
      Staff staff = new Staff();
      staff.addPerson(employee);
      staff.addPerson(student);
      staff.addPerson(universityPerson);

      System.out.println(staff);
      System.out.println(staff.findYounger(42).getQuantity());
      System.out.println(staff.findYounger(42));
   }

   private static void example2() {
      /*
      Vehicle (title, master, position)
         moveTo(coordinates)
         getInfo()
            Ship (port, passengers)
            Truck (fuel, mass)
            Plane (type, height)

            Vehicles[]
       */
      Ship ship1 = new Ship("Odessa", "ShipMaster", new Coordinates(42.33f, 30.42f), "Odessa", 30);
//      System.out.println(ship1);
//      ship1.moveTo(0, 0);

      Truck truck1 = new Truck("MAZ", "Ivanov", new Coordinates(42.63f, 30.92f), FuelType.diesel, 20);
//      System.out.println(truck1);
//      truck1.moveTo(50, 30);

      Plane plane = new Plane("AH-123", "QQQQ", new Coordinates(30, 43), 200, 5000);

      Garage garage = new Garage(6);
      garage.addVehicle(ship1);
      garage.addVehicle(truck1);
      garage.addVehicle(plane);
      garage.addVehicle(truck1);
      garage.addVehicle(new Truck("Tesla", "Ilon Mask", new Coordinates(42.63f, 130.92f), FuelType.electric, 30));

      System.out.println(System.lineSeparator() + garage);


      System.out.println("-------------------\n");

      garage.addVehicle(new Truck("Tesla2", "Ilon Mask", new Coordinates(42.63f, 130.92f), FuelType.electric, 30));
      garage.addVehicle(new Truck("Tesla3", "Ilon Mask", new Coordinates(42.63f, 130.92f), FuelType.electric, 30));
      garage.addVehicle(new Truck("Tesla4", "Ilon Mask", new Coordinates(42.63f, 130.92f), FuelType.electric, 30));
      System.out.println(System.lineSeparator() + garage);

/*
      Vehicles vehicles = new Vehicles();
      vehicles.add(ship1);
      vehicles.add(truck1);
      vehicles.add(new Truck("Tesla", "Ilon Mask", new Coordinates(42.63f, 130.92f), FuelType.electric, 30));
      vehicles.add(ship1);
      vehicles.add(new Truck("BelAZ", "Nobody", new Coordinates(30f, 30f), FuelType.diesel, 500));

      System.out.println(vehicles);

      vehicles.remove(3);
      System.out.println(vehicles);

      vehicles.remove(truck1);
      vehicles.remove(truck1);
      System.out.println(vehicles);

      System.out.println("\nAll trucks:\n" + vehicles.findByType("truck"));
      System.out.println("Quantity:\t" + vehicles.countByType("truck"));

      System.out.println("\nAll ships:\n" + vehicles.findByType("ship"));
      System.out.println("Quantity:\t" + vehicles.countByType("ship"));

 */
   }

   public static void main(String[] args) {
//      example1();
//      example2();
   }
}