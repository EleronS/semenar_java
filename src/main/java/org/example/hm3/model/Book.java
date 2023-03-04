package org.example.hm3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String author;
    private Integer price;
    private Integer year;
    private Integer page;
}
