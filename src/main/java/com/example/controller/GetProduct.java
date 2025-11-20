package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetProduct {

  @GetMapping("/get_product")
  public String getProduct() {
    return "product_1";
  }

  @GetMapping("/get_product_deatil/{id}")
  public String getProductDetail(@PathVariable(required = false) Integer id) {
    return "product_detail_for: " + id;
  }
}
