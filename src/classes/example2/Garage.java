package classes.example2;

import java.util.Arrays;

public class Garage {
   private Vehicle[] vehicles;
   private int currentNumberOfVehicles;

   public Garage() {
      vehicles = new Vehicle[1];
   }

   public Garage(int number) {
      currentNumberOfVehicles = 0;
      vehicles = new Vehicle[number > 0 ? number : 1];
   }

   public int getCurrentNumberOfVehicles() {
      return currentNumberOfVehicles;
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
         else
         {
            Vehicle[] newGarage = Arrays.copyOf(vehicles, vehicles.length+1);
            newGarage[vehicles.length] = vehicle;
            vehicles = newGarage;
         }
      }

      return result;
   }

   @Override
   public String toString() {
      return "Garage{" + Arrays.toString(vehicles) + '}';
   }

   public String getInfo(int i)
   {
      return vehicles[i].getInfo();
   }
}