package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

  public void createProduct() {
    System.out.println("ProductService.createProduct");
  }

  public void updateProduct() {
    System.out.println("ProductService.updateProduct");
  }
}
