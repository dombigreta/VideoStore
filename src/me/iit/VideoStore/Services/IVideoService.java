package me.iit.VideoStore.Services;

import java.util.List;

import me.iit.VideoStore.Services.ManagedBeans.VideoBean;

public interface IVideoService {
	void SaveVideo(VideoBean video);
	List<VideoBean> GetVideos();
	VideoBean GetVideoById(int id);
	void DeleteVideo(int id);
}
