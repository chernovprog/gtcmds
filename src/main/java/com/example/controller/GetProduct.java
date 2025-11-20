package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetProduct {

  @GetMapping("/get_product")
  public String getProduct() {
    return "product_1";
  }

  @GetMapping("/get_product_deatil")
  public String getProductDetail() {
    return "product_detail_1";
  }
}
