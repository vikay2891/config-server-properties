package com.techGeek.movieRatingService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author vikas.bhardwaj3
 */
@Data
@AllArgsConstructor
public class RatingEntity {

    private String movieId;
    private int rating;


}
