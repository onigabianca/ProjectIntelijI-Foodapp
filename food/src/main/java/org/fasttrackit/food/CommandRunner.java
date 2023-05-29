package org.fasttrackit.food;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.fasttrackit.food.model.MealItem;
import org.fasttrackit.food.model.Nutrients;
import org.fasttrackit.food.service.MealItemService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.fasttrackit.food.model.Categories.*;
import static org.fasttrackit.food.model.TypeOfNutrient.*;

@Component
@RequiredArgsConstructor
@Slf4j
public  class CommandRunner implements CommandLineRunner {
    private final MealItemService service;
    @Override
    public void run(String... args) {
        log.info("Runner is populating with data");
       service.addAllMealItem(
                List.of(
                        MealItem.builder()
                                .foodItem("egg")
                                .calories(155)
                                .quantity(100)
                                .category(OTHERS)
                                .nutrients(Nutrients.builder()
                                        .typeOfNutrient(PROTEIN)
                                        .weight(3.5)
                                        .build())

                                .build(),



                        MealItem.builder()
                                .foodItem("mac&cheese")
                                .calories(165)
                                .quantity(230)
                                .category(FASTFOOD)
                                .nutrients(Nutrients.builder()
                                        .typeOfNutrient(CARBOHYDRATE)
                                        .weight(23.22)
                                        .build())
                                .build(),

                        MealItem.builder()
                                .foodItem("apple")
                                .calories(52)
                                .quantity(75)
                                .category(FRUITS)
                                .nutrients(Nutrients.builder()
                                        .typeOfNutrient(VITAMIN)
                                        .weight(7.8)
                                        .build())
                                        .build(),
                        MealItem.builder()
                                .foodItem("Chicken")
                                .calories(239)
                                .quantity(150)
                                .category(MEAT)
                                .nutrients(Nutrients.builder()
                                        .typeOfNutrient(LIPID)
                                        .weight(6.7)
                                        .build())
                                .build()
                ));



    }
}
