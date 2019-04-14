package com.techGeek.movieinfoservice.controller;

import com.techGeek.movieinfoservice.entity.MovieEntity;
import com.techGeek.movieinfoservice.uri.MovieInfoServiceUri;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vikas.bhardwaj3
 */

@RestController
@RequestMapping(MovieInfoServiceUri.MOVIE_INFO_SERVICE)
public class MovieInfoServiceController {

    private static  final Logger LOGGER = LoggerFactory.getLogger(MovieInfoServiceController.class);
    @GetMapping(MovieInfoServiceUri.GET_MOVIES)
    public MovieEntity getMoviesInfo(){
        LOGGER.info("to chcekcek");
        return new MovieEntity("121","IronMan");




    }
}
