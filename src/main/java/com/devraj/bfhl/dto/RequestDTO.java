package com.devraj.bfhl.dto;

import java.util.List;

import jakarta.validation.constraints.NotNull;

public class RequestDTO {

    @NotNull(message = "Data cannot be null")
    private List<String> data;

    public RequestDTO() {
    }

    public RequestDTO(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}