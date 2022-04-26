package classes.example2;

public class Coordinates {
   public static final int MAX_LONGITUDE = 180;
   public static final int MAX_LATITUDE = 90;
   private float longitude;
   private float latitude;

   public Coordinates(float longitude, float latitude) {
      this.setLongitude(longitude);
      this.setLatitude(latitude);
   }

   public float getLongitude() {
      return longitude;
   }

   public void setLongitude(float longitude) {
      this.longitude = longitude % MAX_LONGITUDE;
   }

   public float getLatitude() {
      return latitude;
   }

   public void setLatitude(float latitude) {
      this.latitude = latitude % MAX_LATITUDE;
   }

   @Override
   public String toString() {
      return "(" + longitude + ", " + latitude + ")";
   }
}
