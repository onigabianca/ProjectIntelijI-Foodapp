package org.fasttrackit.food.model.dto;


import org.fasttrackit.food.model.MealItem;
import org.springframework.stereotype.Component;

@Component
public class MealItemMapper {
    public static MealItemDTO toDto(MealItem entity){
        return MealItemDTO.builder()
                .id(entity.getId())
                .foodItem(entity.getFoodItem())
                .calories(entity.getCalories())
                .category(entity.getCategory())
                .quantity(entity.getQuantity())
                .nutrients(entity.getNutrients())
                .build();
    }

    public static MealItem toEntity(MealItemDTO mealItemDTO) {
        return MealItem.builder()
                .id(mealItemDTO.id())
                .foodItem(mealItemDTO.foodItem())
                .calories(mealItemDTO.calories())
                .category(mealItemDTO.category())
                .quantity(mealItemDTO.quantity())
                .nutrients(mealItemDTO.nutrients())
                .build();
    }


}
