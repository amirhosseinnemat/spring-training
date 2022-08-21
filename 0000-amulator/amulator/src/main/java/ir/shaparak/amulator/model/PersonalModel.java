package ir.shaparak.amulator.model;

import java.sql.Timestamp;

public class PersonalModel {
    private Integer nationalCode;
    private String name;
    private String family;
    private String father;
    private Timestamp birthDate;

    public Integer getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(Integer nationalCode) {
        this.nationalCode = nationalCode;
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

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }
}
