package com.techGeek.moviecatalogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author vikas.bhardwaj3
 */
@Data
@AllArgsConstructor
public class MovieCatalogEntity {

    private String name;
    private String desc;
    private int rating;
}
