package org.fasttrackit.food.model.dto;

import lombok.Builder;
import org.fasttrackit.food.model.Categories;
import org.fasttrackit.food.model.Nutrients;

@Builder
public record MealItemDTO(
         Integer id,
         String foodItem,
         Integer calories,
         Integer quantity,
         Categories category,
         Nutrients nutrients
) {
}
