package com.msi.model;

import java.io.Serializable;

public class Activity implements Serializable {
  public static final long seriaVersionUID = 1L;


  private String name;
  private String age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }
}
