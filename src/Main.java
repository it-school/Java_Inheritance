import classes.example1.*;
import classes.example2.*;

import java.time.LocalDate;

public class Main {
   public static void main(String[] args) {
      // classes.example1();
      example2();
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
      System.out.println(ship1);
      ship1.moveTo(0, 0);

      Truck truck1 = new Truck("MAZ", "Ivanov", new Coordinates(42.63f, 30.92f), FuelType.diesel, 20);
      System.out.println(truck1);
      truck1.moveTo(50, 30);

      Garage garage = new Garage(5);
      garage.addVehicle(ship1);
      garage.addVehicle(truck1);
      garage.addVehicle(truck1);
      garage.addVehicle(truck1);
      garage.addVehicle(new Truck("Tesla", "Ilon Mask", new Coordinates(42.63f, 130.92f), FuelType.electric, 30));

      System.out.println(System.lineSeparator() + garage);

      System.out.println("----------\n");
      Vehicles vehicles = new Vehicles();
      vehicles.add(ship1);
      vehicles.add(truck1);
      vehicles.add(new Truck("BelAZ", "I am", new Coordinates(30f, 30f), FuelType.diesel, 500));
      vehicles.add(truck1);
      System.out.println(vehicles);
/*
      vehicles.remove(truck1);
      vehicles.remove(1);
      System.out.println("----------\n");
      System.out.println(vehicles);
      */
      System.out.println("Ships count: " + vehicles.countOf("ship"));

      System.out.println("All trucks: " + vehicles.getListOf("truck"));
   }

   private static void example1() {
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