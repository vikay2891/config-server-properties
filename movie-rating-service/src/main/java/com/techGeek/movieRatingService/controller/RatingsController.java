package com.techGeek.movieRatingService.controller;

import com.techGeek.movieRatingService.entity.RatingEntity;
import com.techGeek.movieRatingService.uri.RatingUri;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vikas.bhardwaj3
 */

@RestController
@RequestMapping(RatingUri.RATINGS)
public class RatingsController {

    public RatingEntity getRatings(){

        return new RatingEntity("121",7);
    }
}
