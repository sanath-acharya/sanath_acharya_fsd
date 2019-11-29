package com.example.demo.service;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Recommendation;


@Repository

public interface RecommendationService  extends MongoRepository<Recommendation, Integer>
{

	
}
