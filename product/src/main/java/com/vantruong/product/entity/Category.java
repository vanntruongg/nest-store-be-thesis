package com.vantruong.product.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class Category extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cat_id")
  private Long id;

  @Column(name = "cat_name")
  private String name;

  @Column(name = "cat_image")
  private String image;

  @ManyToOne
  @JoinColumn(name = "parent_cat_id")
  @JsonIgnore
  private Category parentCategory;

}
