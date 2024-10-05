package com.boyd.dotcom.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyd.dotcom.product.ProductService;

@RestController
public class ProductController {
  
  ProductService productService;
  
  ProductController() {
    productService = new ProductService();
  }

  @GetMapping("/")
  public String greeting() {
    return this.productService.message();
  }
}
