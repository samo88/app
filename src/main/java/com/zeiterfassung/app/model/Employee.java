package com.zeiterfassung.app.model;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(generator = "incrementor")
    private Integer id;

    @NotNull
    private String vorName;
    @NotNull
    private String nachName;
    @NotNull
    private String password;
    private LocalTime logInTime;
    private LocalTime logOutTime;
    private boolean isAdmin;

    private boolean isEnabled;

    public Employee(String vorName, String nachName, String password) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.password = password;
        this.isEnabled = true;
    }

    public Employee() {

    }

    public Integer getId() {
        return id;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalTime getLogInTime() {
        return logInTime;
    }

    public void setLogInTime(LocalTime logInTime) {
        this.logInTime = logInTime;
    }

    public LocalTime getLogOutTime() {
        return logOutTime;
    }

    public void setLogOutTime(LocalTime logOutTime) {
        this.logOutTime = logOutTime;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", vorName='" + vorName + '\'' +
                ", nachName='" + nachName + '\'' +
                ", password='" + password + '\'' +
                ", logInTime=" + logInTime +
                ", logOutTime=" + logOutTime +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
