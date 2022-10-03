package classes.example2;

public enum FuelType {
   gas (5),
   diesel(2),
   electric(30) ;

   public final int i;
   FuelType(int i) {
      this.i = i;
   }
}
