package classes.example2;

public class Plane extends Vehicle {
   public static final int MAX_PASSENGERS = 300;
   public static final int MAX_HEIGHT = 10000;
   private static final int DEFAULT_HEIGHT = 3000;
   private int passengers;
   private int maxHeight;

   public Plane(String title, String master, Coordinates coordinates, int passengers, int maxHeight) {
      super(title, master, coordinates);
      this.setMaxHeight(maxHeight);
      this.setPassengers(passengers);
   }

   public int getPassengers() {
      return passengers;
   }

   public void setPassengers(int passengers) {
      this.passengers = passengers > 0 && passengers < MAX_PASSENGERS ? passengers : 0;
   }

   public int getMaxHeight() {
      return maxHeight;
   }

   public void setMaxHeight(int maxHeight) {
      this.maxHeight = maxHeight > 0 && maxHeight < MAX_HEIGHT ? maxHeight : DEFAULT_HEIGHT;
   }

   @Override
   public String getInfo() {
      return String.format("Plane: \"%s\", (%s), passengers: %4d, height: %4d", title, this.coordinates, passengers, maxHeight);
   }

   @Override
   public String toString() {
      return System.lineSeparator() + this.getClass().getSimpleName() + " " + super.toString() + "passengers=" + passengers + ", maxHeight=" + maxHeight;
   }
}
