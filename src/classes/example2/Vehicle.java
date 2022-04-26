package classes.example2;

public abstract class Vehicle implements IVehicle {
   protected String title;
   protected String master;
   protected Coordinates coordinates;

   protected Vehicle(String title, String master, Coordinates coordinates) {
      this.title = title;
      this.master = master;
      this.coordinates = coordinates;
   }

   @Override
   public String getMaster() {
      return this.master;
   }

   @Override
   public void setMaster(String master) {
      this.master = master.strip();
   }

   @Override
   public void moveTo(float longitude, float latitude) {
      this.setPosition(longitude, latitude);
   }

   @Override
   public String getTitle() {
      return this.title;
   }

   @Override
   public void setTitle(String title) {
      this.title = title.strip();
   }

   @Override
   public Coordinates getPosition() {
      return this.coordinates;
   }

   @Override
   public void setPosition(float longitude, float latitude) {
      this.coordinates = new Coordinates(longitude, latitude);
   }

   @Override
   public String toString() {
      return "Vehicle{" + "title='" + title + '\'' + ", master='" + master + '\'' + ", coordinates=" + coordinates + "}";
   }
}
