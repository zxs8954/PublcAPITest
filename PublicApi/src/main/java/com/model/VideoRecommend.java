package com.model;

import lombok.Data;

@Data
public class VideoRecommend {
    private String id;

    @Override
    public String toString() {
        return "VideoRecommend{" +
                "id='" + id + '\'' +
                '}';
    }
}
