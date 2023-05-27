package org.fasttrackit.food.model;

import jakarta.persistence.*;
import lombok.*;
import  jakarta.persistence.Entity;
import  jakarta.persistence.GeneratedValue;
@Builder
@With
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Nutrients {
    @Id
    @GeneratedValue

    private Integer id;
    @Column
    private TypeOfNutrient typeOfNutrient;
    @Column
    private double weight;





}
