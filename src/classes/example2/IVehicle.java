package classes.example2;

public interface IVehicle {
   void moveTo(float longitude, float latitude);

   String getInfo();

   String getMaster();

   void setMaster(String master);

   String getTitle();

   void setTitle(String title);

   Coordinates getPosition();

   void setPosition(float longitude, float latitude);
}
