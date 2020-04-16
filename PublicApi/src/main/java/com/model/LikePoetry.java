package com.model;

import lombok.Data;

@Data
public class LikePoetry {
    private String name;

    @Override
    public String toString() {
        return "LikePoetry{" +
                "name='" + name + '\'' +
                '}';
    }
}
