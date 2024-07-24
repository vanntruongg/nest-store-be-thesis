package com.vantruong.order.dto;

import lombok.Getter;

@Getter
public class OrderDetailDto {
  private int productId;
  private String productName;
  private int quantity;
  private float productPrice;
  private String productImage;
}