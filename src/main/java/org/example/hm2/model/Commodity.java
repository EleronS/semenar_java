package org.example.hm2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Commodity {

    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private String variety;
}
