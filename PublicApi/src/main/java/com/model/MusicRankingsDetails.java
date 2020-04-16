package com.model;

import lombok.Data;

@Data
public class MusicRankingsDetails {
    private String type;

    @Override
    public String toString() {
        return "MusicRankingsDetails{" +
                "type='" + type + '\'' +
                '}';
    }
}
