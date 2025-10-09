package com.example.foodProject.Service;

import com.example.foodProject.Entity.FoodEntity;
import com.example.foodProject.Repository.FoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    @Autowired
    private FoodRepo foodRepo;


    public List<FoodEntity> foods(){
        return foodRepo.findAll();
    }

    public void addFoodItem(FoodEntity food){


        foodRepo.save(food);

    }


}
