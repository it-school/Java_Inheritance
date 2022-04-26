package classes.example2;

public class Ship extends Vehicle {
   public static final int MAX_PASSENGERS = 1000;
   public static final int DEFAULT_PASSENGERS = 10;
   private String port;
   private int passengers;

   public Ship(String title, String master, Coordinates coordinates, String port, int passengers) {
      super(title, master, coordinates);
      this.setPort(port);
      this.setPassengers(passengers);
   }

   public String getPort() {
      return port;
   }

   public void setPort(String port) {
      this.port = port.strip();
   }

   public int getPassengers() {
      return passengers;
   }

   private void setPassengers(int passengers) {
      this.passengers = passengers > 0 && passengers < MAX_PASSENGERS ? passengers : DEFAULT_PASSENGERS;
   }

   @Override
   public void moveTo(float longitude, float latitude) {
      super.moveTo(longitude, latitude);
      System.out.println(getClass().getSimpleName() + " is going to " + coordinates);
   }

   @Override
   public String getInfo() {
      return System.lineSeparator() + " " + this;
   }

   @Override
   public String toString() {
      return getClass().getSimpleName() + " " + super.toString().replace("}", "") + ", base port: " + port + ", passengers: " + passengers + "}\n";
   }
}
