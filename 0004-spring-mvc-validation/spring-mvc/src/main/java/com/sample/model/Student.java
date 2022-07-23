package com.sample.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.LinkedHashMap;

public class Student {

    @NotNull(message = "name should not empty")
    @Size(min = 1, message = "name should not empty")
    private String name;

    @NotNull(message = "family should not empty")
    @Size(min = 1, message = "name should not empty")
    @Pattern(regexp = "^[a-zA-z]{5}", message = "family should be just character")
    private String family;

    private String country;

    private String city;
    private String gender;
    private String[] operatingSystem;

    private LinkedHashMap<String, String> cityOptions;

    public Student() {

        cityOptions = new LinkedHashMap<>();
        cityOptions.put("THR", "tehran");
        cityOptions.put("SHZ", "shiraz");
        cityOptions.put("TBZ", "tabriz");

    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCityOptions() {
        return cityOptions;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
