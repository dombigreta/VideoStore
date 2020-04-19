package me.iit.VideoStore.Controllers;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import me.iit.VideoStore.Services.IVideoService;
import me.iit.VideoStore.Services.ManagedBeans.VideoBean;

@ViewScoped
@ManagedBean
public class VideoController {

	@Inject
	IVideoService service;
	
	private static List<VideoBean> videos;
	
	public VideoController() {
	}
	

	public List<VideoBean> getVideos(){
		return service.GetVideos();
	}
}
