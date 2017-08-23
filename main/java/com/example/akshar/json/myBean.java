package com.example.akshar.json;

import java.io.Serializable;

/**
 * Created by Akshar on 8/23/2017.
 */

public class myBean implements Serializable{
  @Override
  public String toString() {
    return "myBean{" +
      "id='" + id + '\'' +
      ", name='" + name + '\'' +
      ", gender='" + gender + '\'' +
      ", office='" + office + '\'' +
      ", home='" + home + '\'' +
      ", mobile='" + mobile + '\'' +
      ", address='" + address + '\'' +
      ", email='" + email + '\'' +
      '}';
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
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

  String id,name,gender,office,home,mobile,address,email;
}
