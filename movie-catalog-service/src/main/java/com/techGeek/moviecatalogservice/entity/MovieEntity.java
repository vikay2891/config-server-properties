package com.techGeek.moviecatalogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vikas.bhardwaj3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {

    private String movieId;

    private String name;
}
