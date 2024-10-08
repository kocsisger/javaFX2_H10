package org.example.model;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private String name;
    private int credits;
    private LocalDate dateOfBirth;

    public Student(String name, int credits, LocalDate dateOfBirth) {
        this.name = name;
        this.credits = credits;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return credits == student.credits && Objects.equals(name, student.name) && Objects.equals(dateOfBirth, student.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, credits, dateOfBirth);
    }
}
