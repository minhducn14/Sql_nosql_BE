package com.example.demoSQL_NoSQL.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "products_images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsImages {

    @Id
    private String id;
    private String name;
    private String path;
    @Field("product_id")
    private Long productId;
    private Date created_at;
    private Date updated_at;

    // Getters and Setters
}
