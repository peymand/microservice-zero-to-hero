package com.peyman.microservice.tutorial.repositories;

import com.peyman.microservice.tutorial.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product , String> {
}
