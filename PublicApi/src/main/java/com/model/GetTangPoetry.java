package com.model;

import lombok.Data;

@Data
public class GetTangPoetry {
    private String page;
    private String count;

    @Override
    public String toString() {
        return "GetTangPoetry{" +
                "page='" + page + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
