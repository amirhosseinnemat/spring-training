package ir.shaparak.amulator.dto;

import ir.shaparak.amulator.model.PersonalModel;
import ir.shaparak.amulator.model.PostalModel;

import java.util.List;

public class PostalResponse {

    private List<PostalModel> postalModels;

    private String error;
    private Integer status;

    public List<PostalModel> getPostalModels() {
        return postalModels;
    }

    public void setPostalModels(List<PostalModel> postalModels) {
        this.postalModels = postalModels;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
