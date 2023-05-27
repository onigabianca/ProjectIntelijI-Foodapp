package org.fasttrackit.food.model;

import jakarta.persistence.*;
import lombok.*;

@Builder(toBuilder = true)
@With
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MealItem{
       @Id
       @GeneratedValue
       private Integer id;
       @Column
       private String foodItem;
       @Column
       private Integer calories;
       @Column
       private Integer quantity;
       @Column
       private Categories category;
       @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
       private Nutrients nutrients;
}
