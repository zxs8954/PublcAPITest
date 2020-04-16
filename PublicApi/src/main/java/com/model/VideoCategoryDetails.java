package com.model;

import lombok.Data;

@Data
public class VideoCategoryDetails {
    private String id;

    @Override
    public String toString() {
        return "VideoCategoryDetails{" +
                "id='" + id + '\'' +
                '}';
    }
}
