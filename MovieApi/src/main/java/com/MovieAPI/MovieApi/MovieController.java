package com.MovieAPI.MovieApi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MovieAPI.MovieApi.dao.MovieRepository;
import com.MovieAPI.MovieApi.entity.Movie;


@RestController
public class MovieController {

	@Autowired
	MovieRepository m;
	
	@GetMapping("/")
	public List<Movie> listAll(){
		return m.findAll();
}
	@GetMapping("/cat")
	public List<Movie> cat(@RequestParam("category")String category) {
	
			return m.findByCategory(category);
	}
	/*@GetMapping("/movie2")
	public Movie movie2(@RequestParam("moviecat")String moviecat) {
		
		return new Movie(moviecat);
	}*/
}
