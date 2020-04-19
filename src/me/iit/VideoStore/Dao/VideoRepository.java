package me.iit.VideoStore.Dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import me.iit.VideoStore.Models.Video;

@Stateless
public class VideoRepository implements IVideoRepository {

	@PersistenceContext(unitName="video_rental")
	EntityManager manager;
	
	@Override
	public void SaveVideo(Video video) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Video> GetVideos() {
		String sql = "select v from Video v";
		Query query = manager.createQuery(sql);
		List<Video> result = query.getResultList();
		return result;
	}

	@Override
	public Video GetVideoById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void UpdateVideo(Video video) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteVideo(int id) {
		// TODO Auto-generated method stub
		
	}

}
