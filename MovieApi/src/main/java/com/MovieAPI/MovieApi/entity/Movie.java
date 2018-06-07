package com.MovieAPI.MovieApi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")

public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String movietitle;
	private String moviecat;

	
	public Movie() {
		
	}
	

	public Movie(int id, String movietitle, String moviecat) {
		super();
		this.id = id;
		this.movietitle = movietitle;
		this.moviecat = moviecat;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovietitle() {
		return movietitle;
	}

	public void setMovietitle(String movietitle) {
		this.movietitle = movietitle;
	}

	public String getMoviecat() {
		return moviecat;
	}

	public void setMoviecat(String moviecat) {
		this.moviecat = moviecat;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movietitle=" + movietitle + ", moviecat=" + moviecat + "]";
	}
	
}
