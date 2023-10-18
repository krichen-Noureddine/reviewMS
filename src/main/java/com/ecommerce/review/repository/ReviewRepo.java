package com.ecommerce.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.review.models.Review;
public interface ReviewRepo extends JpaRepository <Review,Long> {

}
