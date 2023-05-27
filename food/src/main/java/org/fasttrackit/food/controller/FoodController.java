package org.fasttrackit.food.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.food.model.MealItem;
import org.fasttrackit.food.model.dto.MealItemDTO;
import org.fasttrackit.food.model.dto.MealItemMapper;
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
    public List<MealItemDTO> getAll(){

        log.info("GET all menuItems");
        return service.getAll().stream()
                .map(MealItemMapper::toDto)
                .toList();
        }
    }



