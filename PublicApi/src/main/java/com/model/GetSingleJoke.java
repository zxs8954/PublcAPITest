package com.model;

import lombok.Data;

@Data
public class GetSingleJoke {
    private String sid;

    @Override
    public String toString() {
        return "GetSingleJoke{" +
                "sid='" + sid + '\'' +
                '}';
    }
}
