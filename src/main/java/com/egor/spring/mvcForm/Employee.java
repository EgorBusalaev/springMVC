package com.egor.spring.mvcForm;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 6, message = "must be min 2 symbol and max 6 ")
    private String name;
   // @NotNull(message = "заполни фамилию")
   // @NoEmpty(message = "заполни фамилию")
   @NotBlank(message = "surname incorrect")
    private String surname;
    private int age;
    private String department;
    private Map<String,String> departments;
    private String carBrand;
    private Map<String,String> carBrands;
    private String[] Language;
    private Map<String,String> languageList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("Infirmation tehnologies", "IT");
        departments.put("Human Resourses", "HR");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("Audi", "Audi");
        carBrands.put("BMW", "BMW");
        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("German", "GE");
        languageList.put("French", "FE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }


    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguage() {
        return Language;
    }

    public void setLanguage(String[] language) {
        Language = language;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}
