package classes.example1;

import java.time.LocalDate;

/**
 * Superclass Person
 */
public class Person {
   protected String name;
   protected String address;
   protected LocalDate birthday;
   protected String phone;
   protected String email;

   public Person(String name, String address, LocalDate birthday, String phone, String email) {
      this.setName(name);
      this.setAddress(address);
      this.setBirthday(birthday);
      this.setPhone(phone);
      this.setEmail(email);
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name.strip();
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address.strip();
   }

   public LocalDate getBirthday() {
      return birthday;
   }

   public void setBirthday(LocalDate birthday) {
      this.birthday = utilClass.getCorrectDate(birthday);
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone.strip();
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email.strip();
   }

   @Override
   public String toString() {
      return System.lineSeparator() + this.getClass().getSimpleName() + "{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", birthday=" + birthday + ", phone='" + phone + '\'' + "," + " " + "email='" + email + '\'' + '}';
   }
}