package hu.unideb.inf.model;

import java.time.LocalDate;

public class Student {
    private String name;
    private int credts;
    private LocalDate dateOfBirth;

    public Student(String name, int credts, LocalDate dateOfBirth) {
        this.name = name;
        this.credts = credts;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", credts=" + credts +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredts() {
        return credts;
    }

    public void setCredts(int credts) {
        this.credts = credts;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
