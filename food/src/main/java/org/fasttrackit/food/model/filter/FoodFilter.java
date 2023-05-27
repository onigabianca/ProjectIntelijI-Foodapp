package org.fasttrackit.food.model.filter;

import lombok.Builder;
import org.fasttrackit.food.model.Categories;

@Builder
public class FoodFilter {
    Integer id;
    String foodItem;
    Categories category;
    Double minCalories;
    Double maxCalories;
}
