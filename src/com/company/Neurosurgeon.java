package com.company;

public class Neurosurgeon extends Surgeon {
    @Override
    public void toHeal() {
        super.toHeal();
    }

    public Neurosurgeon(String firstName, String lastName, Integer experience, Integer age, Integer salary) {
        super(firstName, lastName, experience, age, salary);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public Integer getExperience() {
        return super.getExperience();
    }

    @Override
    public void setExperience(Integer experience) {
        super.setExperience(experience);
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(Integer age) {
        super.setAge(age);
    }

    @Override
    public Integer getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(Integer salary) {
        super.setSalary(salary);
    }
}
