package com.example.foodProject.Repository;

import com.example.foodProject.Entity.FoodEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface FoodRepo extends MongoRepository<FoodEntity,String> {
}
