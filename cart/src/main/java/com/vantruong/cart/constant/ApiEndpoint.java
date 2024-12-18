package com.vantruong.cart.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.NONE)
public class ApiEndpoint {

  public static final String PRODUCT_SERVICE_URL = "http://localhost:9002";

  //  params
  public static final String EMAIL_PARAM = "/{email}";
  public static final String ID_PARAM = "/{id}";

  // actions
  public static final String GET = "/get";

  public static final String CART = "/cart";

  public static final String DELETE = "/delete";
  public static final String REMOVE = "/remove";
  public static final String ITEMS = "/items";
  public static final String CART_DELETE_ITEMS = DELETE + ITEMS;
  public static final String INTERNAL = "/internal";
  public static final String CART_COUNT = "/count";
  private static final String UPDATE = "/update";

  public static final String CART_GET_ALL = "/items";
  public static final String CART_GET_BY_PRODUCT_ID = "/items" + "/product-id";
  public static final String ADD_TO_CART = "/add";
  public static final String CART_DELETE = DELETE;

  public static final String CART_UPDATE = UPDATE;
}
