package com.example.demoSQL_NoSQL.Controller;

import com.example.demoSQL_NoSQL.Entity.Product;
import com.example.demoSQL_NoSQL.Entity.ProductsImages;
import com.example.demoSQL_NoSQL.Services.ProductService;
import com.example.demoSQL_NoSQL.Services.ProductsImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductsImagesService productsImagesService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/products-images")
    public List<ProductsImages> getAllImages() {
        return productsImagesService.getAllImages();
    }

    @PostMapping("/products-images")
    public ProductsImages createImage(@RequestBody ProductsImages image) {
        return productsImagesService.saveImage(image);
    }
}
