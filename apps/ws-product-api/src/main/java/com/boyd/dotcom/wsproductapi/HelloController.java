package com.boyd.dotcom.wsproductapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyd.dotcom.account.model.Account;
import com.boyd.dotcom.product.model.Product;

@RestController
@RequestMapping("products")
public class HelloController {
  
  Product product = new Product();

  @GetMapping("")
  public List<Product> getAllProducts() {
    List<Product> products = new ArrayList<>();
    products.add(product);
    return products;
  }
}
