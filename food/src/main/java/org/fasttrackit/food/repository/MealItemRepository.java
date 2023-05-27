package org.fasttrackit.food.repository;


import org.fasttrackit.food.model.MealItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MealItemRepository extends JpaRepository<MealItem,Integer> {

}
