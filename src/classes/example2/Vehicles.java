package classes.example2;

import java.util.ArrayList;
import java.util.List;

public class Vehicles {
   private final List<Vehicle> garage;

   public Vehicles() {
      garage = new ArrayList<>();
   }

   public void add(Vehicle vehicle) {
      garage.add(vehicle);
   }

   public void remove(Vehicle vehicle) {
      garage.remove(vehicle);
   }

   public void remove(int number) {
      if (number < garage.size())
         garage.remove(number);
   }

   public int getSize() {
      return this.garage.size();
   }

   public int countOf(String type) {
      /*
      int counter = 0;

      for (Vehicle item : garage) {
         if (item.getClass().getSimpleName().equalsIgnoreCase(type))
            counter++;
      }
      return counter;
       */
      return getListOf(type).getSize();
   }

   public Vehicles getListOf(String type) {
      Vehicles result = new Vehicles();

      for (Vehicle item : garage) {
         if (item.getClass().getSimpleName().equalsIgnoreCase(type))
            result.add(item);
      }

      return result;
   }

   @Override
   public String toString() {
      return "Vehicles{" + garage + '}';
   }
}
