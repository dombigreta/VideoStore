package me.iit.VideoStore.Dao;

import java.util.List;

import me.iit.VideoStore.Models.Video;


public interface IVideoRepository {

	void SaveVideo(Video video);
	List<Video> GetVideos();
	Video GetVideoById(int id);
	void UpdateVideo(Video video);
	void DeleteVideo(int id);
}
