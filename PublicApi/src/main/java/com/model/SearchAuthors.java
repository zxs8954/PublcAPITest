package com.model;

import lombok.Data;

@Data
public class SearchAuthors {
    private String name;

    @Override
    public String toString() {
        return "SearchAuthors{" +
                "name='" + name + '\'' +
                '}';
    }
}
