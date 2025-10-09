package com.example.foodProject.Controller;


import com.example.foodProject.Entity.FoodEntity;
import com.example.foodProject.Service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<FoodEntity> allFoods(){
        return foodService.foods();
    }

    @PostMapping
    public void addFood(@RequestBody FoodEntity food){
        foodService.addFoodItem(food);
    }
}
