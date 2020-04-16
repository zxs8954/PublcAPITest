package com.model;

import lombok.Data;

@Data
public class SearchPoetry {
    private String name;

    @Override
    public String toString() {
        return "SearchPoetry{" +
                "name='" + name + '\'' +
                '}';
    }
}
