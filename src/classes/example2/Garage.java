package classes.example2;

import java.util.Arrays;

public class Garage {
   private final Vehicle[] vehicles;
   private int currentNumberOfVehicles = 0;

   public Garage(int number) {
      vehicles = new Vehicle[number > 0 ? number : 1];
   }

   public boolean addVehicle(Vehicle vehicle) {
      boolean result = false;
      if (currentNumberOfVehicles == 0) {
         vehicles[0] = vehicle;
         result = true;
         currentNumberOfVehicles++;
      } else {
         if (currentNumberOfVehicles < vehicles.length - 1) {
            vehicles[currentNumberOfVehicles++] = vehicle;
            // todo add vehicle to garage
            result = true;
         }
      }

      return result;
   }

   @Override
   public String toString() {
      return "Garage{" + Arrays.toString(vehicles) + '}';
   }
}