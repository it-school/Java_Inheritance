package classes;

import java.time.LocalDate;

public class Student extends UniversityPerson {
   private static final int MAX_COURSE = 7;
   protected String specialty;
   protected int course;

   public Student(String name, String address, LocalDate birthday, String phone, String email, LocalDate entranceDate, String specialty, int course) {
      super(name, address, birthday, phone, email, entranceDate);
      this.setSpecialty(specialty);
      this.setCourse(course);
   }

   public String getSpecialty() {
      return specialty;
   }

   public void setSpecialty(String specialty) {
      this.specialty = specialty.strip();
   }

   public int getCourse() {
      return course;
   }

   public void setCourse(int course) {
      this.course = course > 0 && course <= MAX_COURSE ? course : 0;
   }

   @Override
   public String toString() {
      return super.toString().replace("}", "") + ", specialty: " + this.specialty + ", course: " + this.course + "}";
   }
}