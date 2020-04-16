package com.model;

import lombok.Data;

@Data
public class MusicBroadcastingDetailsv {
    private String channelname;

    @Override
    public String toString() {
        return "MusicBroadcastingDetailsv{" +
                "channelname='" + channelname + '\'' +
                '}';
    }
}
