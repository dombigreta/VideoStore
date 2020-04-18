package me.iit.VideoStore.Controllers;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import me.iit.VideoStore.Models.Video;

@ViewScoped
@ManagedBean
public class DVDController {

	private static List<Video> videos;
	
	public DVDController() {
		Video vid1 = new Video();
		videos = new ArrayList<Video>();
		vid1.setId(1);
		vid1.setTitle("valami");
		vid1.setIsAvaiable(true);
		vid1.setRelaseYear(Date.valueOf("2000-01-01"));
		vid1.setGenreTypeId(1);
		videos.add(vid1);
	}
	

	public List<Video> getVideos(){
		return videos;
	}
}
