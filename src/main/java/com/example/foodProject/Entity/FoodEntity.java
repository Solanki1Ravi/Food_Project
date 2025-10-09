package com.example.foodProject.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "foods")
public class FoodEntity {

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private String category;

}
