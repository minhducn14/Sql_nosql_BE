package com.example.demoSQL_NoSQL.Repository;

import com.example.demoSQL_NoSQL.Entity.ProductsImages;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface ProductsImagesRepository extends MongoRepository<ProductsImages, String> {
    List<ProductsImages> findByProductId(Long productId);
}
