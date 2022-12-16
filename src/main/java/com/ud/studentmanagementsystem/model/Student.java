package com.ud.studentmanagementsystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @Column(name = "enrollment_number")
    private long enrollmentNumber;
    private String name;
    private String email;
    @Column(name = "current_semester")
    private long currentSemester;
    @Column(name = "mobile_number")
    private String mobileNumber;

    public Student(long enrollmentNumber, String name, String email, long currentSemester, String mobileNumber) {
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
        this.email = email;
        this.currentSemester = currentSemester;
        this.mobileNumber = mobileNumber;
    }

    public Student() {
        super();
    }

    public long getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public void setEnrollmentNumber(long enrollmentNumber) {
        this.enrollmentNumber = enrollmentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(long currentSemester) {
        this.currentSemester = currentSemester;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "enrollmentNumber=" + enrollmentNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", currentSemester=" + currentSemester +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
