package com.techGeek.moviecatalogservice.controller;


import com.techGeek.moviecatalogservice.entity.MovieCatalogEntity;
import com.techGeek.moviecatalogservice.entity.MovieEntity;
import com.techGeek.moviecatalogservice.uri.MovieCatalogUri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;


/**
 * @author vikas.bhardwaj3
 */


@RestController
@RequestMapping(MovieCatalogUri.MOVIE_CATALOG)
public class MovieCatalogController {

    private static  final Logger LOGGER = LoggerFactory.getLogger(MovieCatalogController.class);
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(MovieCatalogUri.GET_MOVIES)
    public List<MovieCatalogEntity> getAllMovies() {
        System.out.println("entered");
      MovieEntity movieEntity= restTemplate.getForObject("http://movie-info-service/movieInfoService/getMovies", MovieEntity.class);
        System.out.println("ssssssssssssss"+movieEntity);

        LOGGER.info("TO check the trace id");
        return Collections.singletonList(new MovieCatalogEntity("IronMan", "Robot Dwoney Jr i splaying IronMan", 9));

    }
}
