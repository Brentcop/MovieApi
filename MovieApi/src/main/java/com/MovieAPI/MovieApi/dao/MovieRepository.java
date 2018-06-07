package com.MovieAPI.MovieApi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MovieAPI.MovieApi.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
	
	List <Movie> findByCategory(String category);
}
