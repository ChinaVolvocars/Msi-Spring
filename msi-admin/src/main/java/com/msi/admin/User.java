package com.msi.admin;





public class User {

  public User(){
    super();
  }

  private Integer id;

  private String userName;

  //1 stands for built-in, 2 stands for created , 3 stands for ldap
  private Integer userType;

  private String fullName;

  private String password;

  private String email;

  // 1 stands for yes, 0 stands for no
  private Integer can_delete;

  //1 stands for yes, 0 stands for no
  private Integer active;

  //such as yyyy/MM/dd  or dd-MM-yy
  private String dateFormat;

  // such as HH:mm or hh mm z
  private String timeFormat;

  private String timeZone;

  private String language;

  private String data;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return userName;
  }
  public void setUsername(String userName) {
    this.userName = userName;
  }

  public String getFullname() {
    return fullName;
  }
  public void setFullname(String fullName) {
    this.fullName = fullName;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getUserType() {
    return userType;
  }
  public void setUserType(Integer userType) {
    this.userType = userType;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getData() {
    return data;
  }
  public void setdata(String data) {
    this.data = data;
  }

  public String getDateFormat() {
    return dateFormat;
  }
  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public String getTimeFormat() {
    return timeFormat;
  }
  public void setTimeFormat(String timeFormat) {
    this.timeFormat = timeFormat;
  }

  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }
  /*
   *  1 stands for yes, 0 stands for no
   */
  public Integer getCan_delete() {
    return can_delete;
  }

  /*
   *  1 stands for yes, 0 stands for no
   */
  public void setCan_delete(Integer can_delete) {
    this.can_delete = can_delete;
  }

  /*
   * 1 stands for yes, 0 stands for no
   */
  public Integer getActive() {
    return active;
  }
  /*
   * 1 stands for yes, 0 stands for no
   */
  public void setActive(Integer active) {
    this.active = active;
  }
}