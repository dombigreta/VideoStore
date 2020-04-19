package me.iit.VideoStore.Services;

import java.util.List;
import java.util.stream.Collectors;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import me.iit.VideoStore.Dao.IVideoRepository;
import me.iit.VideoStore.Models.Video;
import me.iit.VideoStore.Services.ManagedBeans.VideoBean;

@ManagedBean
@ApplicationScoped
public class VideoService implements IVideoService {

	@Inject
	IVideoRepository repository;
	
	public VideoService() {
		
	}
	
	@Override
	public void SaveVideo(VideoBean video) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<VideoBean> GetVideos() {
		List<Video> videoRecords = repository.GetVideos();
		return videoRecords.stream().map(v -> {
			VideoBean video = new VideoBean();
			video.setId(v.getId());
			video.setTitle(v.getTitle());
			video.setDescription(v.getDescription());
			video.setDirector(v.getDirector());
			video.setReleaseDate(v.getReleaseDate());
			video.setAvaiableCount(v.getAvaiableCount());
			video.setRentedCount(v.getRentedCount());
			return video;
		}).collect(Collectors.toList());
	}

	@Override
	public VideoBean GetVideoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteVideo(int id) {
		// TODO Auto-generated method stub
		
	}

}
