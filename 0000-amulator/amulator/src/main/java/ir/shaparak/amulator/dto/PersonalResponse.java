package ir.shaparak.amulator.dto;

import ir.shaparak.amulator.model.PersonalModel;

import java.util.List;

public class PersonalResponse {
    private List<PersonalModel> personalModels;
    private Integer status;
    private String error;

    public List<PersonalModel> getPersonalModels() {
        return personalModels;
    }

    public void setPersonalModels(List<PersonalModel> personalModels) {
        this.personalModels = personalModels;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "PersonalResponse{" +
                "personalModels=" + personalModels +
                ", status=" + status +
                ", error='" + error + '\'' +
                '}';
    }
}
