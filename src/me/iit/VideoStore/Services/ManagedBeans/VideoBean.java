package me.iit.VideoStore.Services.ManagedBeans;

import java.sql.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="video")
@RequestScoped
public class VideoBean {
	
	int Id;
	String Title;
	String Description;
	String Director;
	int GenreTypeId;
	Date ReleaseDate;
	int AvaiableCount;
	int RentedCount;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	public int getGenreTypeId() {
		return GenreTypeId;
	}
	public void setGenreTypeId(int genreTypeId) {
		GenreTypeId = genreTypeId;
	}
	public Date getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		ReleaseDate = releaseDate;
	}
	public int getAvaiableCount() {
		return AvaiableCount;
	}
	public void setAvaiableCount(int avaiableCount) {
		AvaiableCount = avaiableCount;
	}
	public int getRentedCount() {
		return RentedCount;
	}
	public void setRentedCount(int rentedCount) {
		RentedCount = rentedCount;
	}
	
	
}
