package com.example.demoSQL_NoSQL.Controller;

import com.example.demoSQL_NoSQL.Entity.ProductsImages;
import com.example.demoSQL_NoSQL.Repository.ProductsImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductsImagesController {

    @Autowired
    private ProductsImagesRepository productsImagesRepository;

    @GetMapping("/products/{productId}/images")
    public List<ProductsImages> getImagesByProductId(@PathVariable Long productId) {
        return productsImagesRepository.findByProductId(productId);
    }
}
