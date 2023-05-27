package org.fasttrackit.food.service;

import org.fasttrackit.food.model.MealItem;
import org.fasttrackit.food.repository.MealItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class MealItemService {
    private final MealItemRepository repository;

public MealItemService(MealItemRepository repository){

    this.repository=repository;
}
    public List<MealItem> getAll(){

        return repository.findAll();
    }

    public MealItem getByFoodItem(String requestedFoodItem){
        return repository.findAll()
                .stream()
                .filter(mealItem -> mealItem.getFoodItem().equals(requestedFoodItem))
                .findFirst()
                .orElse(null);
    }
    public void addAll(List<MealItem> mealItems) {
        repository.saveAll(mealItems);

    }




}
