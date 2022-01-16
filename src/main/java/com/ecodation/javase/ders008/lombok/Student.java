package com.ecodation.javase.ders008.lombok;

import java.util.Objects;

public class Student {

    //nesne değişkenleri
    private int studentId;
    private String studentName;
    private String studentSurname;
    private String studentMiddName;
    private String studentAddress;
    private String studentEmailAddress;
    private String studentHesCodes;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentSurname, String studentMiddName, String studentAddress, String studentEmailAddress, String studentHesCodes) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentMiddName = studentMiddName;
        this.studentAddress = studentAddress;
        this.studentEmailAddress = studentEmailAddress;
        this.studentHesCodes = studentHesCodes;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName='" + studentName + '\'' + ", studentSurname='" + studentSurname + '\'' + ", studentMiddName='" + studentMiddName + '\'' + ", studentAddress='" + studentAddress + '\'' + ", studentEmailAddress='" + studentEmailAddress + '\'' + ", studentHesCodes='" + studentHesCodes + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && studentName.equals(student.studentName) && studentSurname.equals(student.studentSurname) && studentMiddName.equals(student.studentMiddName) && studentAddress.equals(student.studentAddress) && studentEmailAddress.equals(student.studentEmailAddress) && studentHesCodes.equals(student.studentHesCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentSurname, studentMiddName, studentAddress, studentEmailAddress, studentHesCodes);
    }

    //getter and setter
    public int getStudentId() {
        return studentId;
    }

    public Student setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public String getStudentName() {
        return studentName;
    }

    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public Student setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
        return this;
    }

    public String getStudentMiddName() {
        return studentMiddName;
    }

    public Student setStudentMiddName(String studentMiddName) {
        this.studentMiddName = studentMiddName;
        return this;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public Student setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
        return this;
    }

    public String getStudentEmailAddress() {
        return studentEmailAddress;
    }

    public Student setStudentEmailAddress(String studentEmailAddress) {
        this.studentEmailAddress = studentEmailAddress;
        return this;
    }

    public String getStudentHesCodes() {
        return studentHesCodes;
    }

    public Student setStudentHesCodes(String studentHesCodes) {
        this.studentHesCodes = studentHesCodes;
        return this;
    }
}
