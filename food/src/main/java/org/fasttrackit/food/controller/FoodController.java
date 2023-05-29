package org.fasttrackit.food.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.food.model.dto.MealItemDTO;
import org.fasttrackit.food.service.MealItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mealItems")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(value = "http://localhost:4200")
public class FoodController {
    private final MealItemService service;

    @GetMapping
    public List<MealItemDTO> getAllMealItems() {
        log.info("GET all mealItems was called");
        return service.getAllMealItems();
    }

    @GetMapping("{id}")
    public MealItemDTO getMealItemById(@PathVariable String id) {
        log.info("GET mealItem by id was called");
        return service.getMealItemById(id);
    }

    @PostMapping
    public MealItemDTO createNewMealItem(@RequestBody MealItemDTO newMealItem) {
        log.info("POST: Create new mealItem was called");
        return service.createNewMealItem(newMealItem);
    }

    @PutMapping("{id}")
    public MealItemDTO updateMealItem(@PathVariable String id, @RequestBody MealItemDTO updatedMealItem) {
        log.info("PUT: Update mealItem was called");
        return service.updateMealItem(id, updatedMealItem);
    }

    @DeleteMapping("{id}")
    public String deleteMealItemById(@PathVariable String id) {
        log.info("DELETE mealItem by id was called");
        return service.deleteMealItemById(id);
    }
}




