package com.company;

public class Surgeon implements Doctor{
    @Override
    public void toHeal() {

    }
    String firstName;
    String lastName;
    Integer experience;
    Integer age;
    Integer salary;

    public Surgeon(String firstName, String lastName, Integer experience, Integer age, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Surgeon{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", experience=" + experience +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
