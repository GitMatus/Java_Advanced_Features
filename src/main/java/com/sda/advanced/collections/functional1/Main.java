package com.sda.advanced.collections.functional1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Video video1 = new Video("Clip 1", "url1", VideoType.CLIP);
        Video video2 = new Video("Preview 1", "url2", VideoType.PREVIEW);
        Video video3 = new Video("Episode 1", "url3", VideoType.EPISODE);
        Episode episode1 = new Episode("Episode 1", 1, Arrays.asList(video1, video2));
        Episode episode2 = new Episode("Episode 2", 2, Arrays.asList(video3));
        Season season1 = new Season("Season 1", 1, Arrays.asList(episode1));
        Season season2 = new Season("Season 2", 2, Arrays.asList(episode2));
        List<Season> seasons = Arrays.asList(season1, season2);

        List<Episode> episodes = seasons.stream()
                .flatMap(season -> season.episodes.stream())
                .toList();

        List<Video> videos = episodes.stream()
                .flatMap(episode -> episode.videos.stream())
                .toList();

        List<String> seasonNames = seasons.stream()
                .map(season -> season.seasonName)
                .toList();

        List<Integer> seasonNumbers = seasons.stream()
                .map(season -> season.seasonNumber)
                .toList();

        List<String> episodeNames = episodes.stream()
                .map(episode -> episode.episodeName)
                .toList();

        List<Integer> episodeNumbers = episodes.stream()
                .map(episode -> episode.episodeNumber)
                .toList();

        List<String> videoNames = videos.stream()
                .map(video -> video.title)
                .toList();

        List<String> videoURL = videos.stream()
                .map(video -> video.url)
                .toList();

        List<Episode> episodesEvenSeasons = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .toList();

        List<Video> videosEvenSeasons = episodesEvenSeasons.stream()
                .flatMap(episode -> episode.videos.stream())
                .toList();

        List<Video> videosEvenSeasons2 = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .flatMap(episode -> episode.videos.stream())
                .toList();

        List<Video> videosClipsEvenEpisodesOddSeasons = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 1)
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 == 0)
                .flatMap(episode -> episode.videos.stream())
                .filter(video -> video.videoType.equals(VideoType.CLIP))
                .toList();

        List<Video> videosPreviewOddEpisodesEvenSeasons = seasons.stream()
                .filter(season -> season.seasonNumber % 2 == 0)
                .flatMap(season -> season.episodes.stream())
                .filter(episode -> episode.episodeNumber % 2 == 1)
                .flatMap(episode -> episode.videos.stream())
                .filter(video -> video.videoType.equals(VideoType.PREVIEW))
                .toList();

    }

}