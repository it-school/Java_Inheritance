package classes;

import java.time.LocalDate;

public class Employee extends UniversityPerson {
   protected String department;
   protected Roles role;

   public Employee(String name, String address, LocalDate birthday, String phone, String email, LocalDate entranceDate, String department, Roles role) {
      super(name, address, birthday, phone, email, entranceDate);
      this.setDepartment(department);
      this.role = role;
   }

   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department.strip();
   }

   public Roles getRole() {
      return role;
   }

   public void setRole(Roles role) {
      this.role = role;
   }

   @Override
   public String toString() {
      return super.toString().replace("}", "") + ", department: " + this.department + ", role: " + this.role + "}";
   }
}