package application.model.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

/***********************************************************************
 * Module:  Person.java
 * Author:  W0L1D
 * Purpose: Defines the Class Person
 ***********************************************************************/


public class Person {
   private Long id;
   private String fullName;
   private String cin;
   private String tele;
   private String address;
   private String email;

   public Person(ResultSet person) throws SQLException {
      setId(person.getLong(1));
      setFullName(person.getString(2));
      setCin(person.getString(3));
      setTele(person.getString(4));
      setAddress(person.getString(5));
      setEmail(person.getString(6));

   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFullName() {
      return fullName;
   }

   public void setFullName(String fullName) {
      this.fullName = fullName;
   }

   public String getCin() {
      return cin;
   }

   public void setCin(String cin) {
      this.cin = cin;
   }

   public String getTele() {
      return tele;
   }

   public void setTele(String tele) {
      this.tele = tele;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
}