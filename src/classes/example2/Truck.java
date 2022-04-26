package classes.example2;

public class Truck extends Vehicle {
   private static final int DEFAULT_MASS = 10;
   private FuelType fuel;
   private int mass;

   public Truck(String title, String master, Coordinates coordinates, FuelType fuel, int mass) {
      super(title, master, coordinates);
      this.fuel = fuel;
      this.setMass(mass);
   }

   public FuelType getFuel() {
      return fuel;
   }

   public void setFuel(FuelType fuel) {
      this.fuel = fuel;
   }

   public int getMass() {
      return mass;
   }

   public void setMass(int mass) {
      this.mass = mass > 0 ? mass : DEFAULT_MASS;
   }

   @Override
   public void moveTo(float longitude, float latitude) {
      super.moveTo(longitude, latitude);
      System.out.println(getClass().getSimpleName() + " is driving to " + coordinates);
   }

   @Override
   public String getInfo() {
      return System.lineSeparator() + " " + this;
   }

   @Override
   public String toString() {
      return getClass().getSimpleName() + " " + super.toString().replace("}", "") + ", fuel type: " + fuel + ", max mass: " + mass + "}\n";
   }
}
