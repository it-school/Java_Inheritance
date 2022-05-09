package classes.example2;

import java.util.ArrayList;
import java.util.List;

public class Vehicles {
   private final List<Vehicle> garage;

   public Vehicles() {
      garage = new ArrayList<>();
   }

   @Override
   public String toString() {
      return "Vehicles " + garage;
   }

   public boolean add(Vehicle vehicle) {
      return garage.add(vehicle);
   }

   public void remove(int number) {
      if (number < garage.size())
         garage.remove(number);
   }

   public void remove(Vehicle vehicle) {
      garage.remove(vehicle);
   }

   public Vehicles findByType(String type) {
      Vehicles result = new Vehicles();

      for (Vehicle item : garage) {
         if (item.getClass().getSimpleName().toLowerCase().contains(type.toLowerCase()))
            result.add(item);
      }

      return result;
   }

   public int countByType(String type) {
      return this.findByType(type).garage.size();
   }
}
