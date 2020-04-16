package com.model;

import lombok.Data;

@Data
public class GetSongPoetry {
    private String page;
    private String count;

    @Override
    public String toString() {
        return "GetSongPoetry{" +
                "page='" + page + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
