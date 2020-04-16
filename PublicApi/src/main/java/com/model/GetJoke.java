package com.model;

import lombok.Data;

@Data
public class GetJoke {
    private String page;
    private String count;
    private String type;

    @Override
    public String toString() {
        return "GetJoke{" +
                "page='" + page + '\'' +
                ", count='" + count + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
