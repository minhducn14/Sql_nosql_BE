package com.example.demoSQL_NoSQL.Services;

import com.example.demoSQL_NoSQL.Entity.ProductsImages;
import com.example.demoSQL_NoSQL.Repository.ProductsImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsImagesService {

    @Autowired
    private ProductsImagesRepository productsImagesRepository;

    public List<ProductsImages> getAllImages() {
        return productsImagesRepository.findAll();
    }

    public ProductsImages saveImage(ProductsImages image) {
        return productsImagesRepository.save(image);
    }
}
