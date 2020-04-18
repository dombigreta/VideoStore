package me.iit.VideoStore.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Video {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	@Column(name="title")
	private String Title;
	@Column(name="release_year")
	private Date RelaseYear;
	@Column(name="is_avaiable")
	private Boolean IsAvaiable;
	@Column(name="genre_type_id")
	private int GenreTypeId;
	
	public Video() {}

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

	public Date getRelaseYear() {
		return RelaseYear;
	}

	public void setRelaseYear(Date relaseYear) {
		RelaseYear = relaseYear;
	}

	public Boolean getIsAvaiable() {
		return IsAvaiable;
	}

	public void setIsAvaiable(Boolean isAvaiable) {
		IsAvaiable = isAvaiable;
	}

	public int getGenreTypeId() {
		return GenreTypeId;
	}

	public void setGenreTypeId(int genreTypeId) {
		GenreTypeId = genreTypeId;
	}
	
}
