package com.sda.advanced.collections.functional1;

import java.util.List;

public class Season {
    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;
    public Season(String seasonName, int seasonNumber,
                  List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonNumber=" + seasonNumber +
                ", episodes=" + episodes +
                '}';
    }
}
