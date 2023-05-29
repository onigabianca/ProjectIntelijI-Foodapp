package org.fasttrackit.food.service;

import org.fasttrackit.food.ResourceNotFoundException;
import org.fasttrackit.food.model.MealItem;
import org.fasttrackit.food.model.dto.MealItemDTO;
import org.fasttrackit.food.model.dto.MealItemMapper;
import org.fasttrackit.food.repository.MealItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealItemService {
    private final MealItemRepository mealItemRepository;

    public MealItemService(MealItemRepository mealItemRepository) {

        this.mealItemRepository = mealItemRepository;
    }

    public void addAllMealItem(List<MealItem> mealItems) {

        mealItemRepository.saveAll(mealItems);
    }

    public List<MealItemDTO> getAllMealItems() {
        return mealItemRepository.findAll().stream()
                .map(MealItemMapper::toDto)
                .toList();
    }

    public MealItemDTO getMealItemById(String id) {
        return MealItemMapper.toDto(mealItemRepository.findById(Integer.valueOf(id))
                .orElseThrow(() -> new ResourceNotFoundException("Meal Item with id %s was not found".formatted(id))));
    }

    public MealItem findMealItemById(Integer id) {
        return mealItemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Meal Item with id %s was not found".formatted(id)));
    }

    public MealItemDTO createNewMealItem(MealItemDTO newMealItem) {
        return MealItemMapper.toDto(mealItemRepository.save(MealItemMapper.toEntity(newMealItem)));
    }

    public String deleteMealItemById(String id) {
        String response = String.valueOf(getMealItemById(id).foodItem());
        mealItemRepository.deleteById(Integer.valueOf(id));
        return ("Meal Item: " + response + " was deleted!");
    }

    public MealItemDTO updateMealItem(String id, MealItemDTO updatedMealItem) {
        MealItem initialMealItem = MealItemMapper.toEntity(getMealItemById(id));
        initialMealItem.setFoodItem(updatedMealItem.foodItem());
        initialMealItem.setCalories(updatedMealItem.calories());
        initialMealItem.setQuantity(updatedMealItem.quantity());
        initialMealItem.setCategory(updatedMealItem.category());
        initialMealItem.setNutrients(updatedMealItem.nutrients());
        return MealItemMapper.toDto(mealItemRepository.save(initialMealItem));
    }
}