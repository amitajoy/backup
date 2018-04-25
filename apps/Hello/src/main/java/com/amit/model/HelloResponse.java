package com.amit.model;

import java.util.List;

public class HelloResponse {
    public List<String> getResponse() {
        return response;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }

    private List<String> response;
}
