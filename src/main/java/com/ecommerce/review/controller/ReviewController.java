package com.ecommerce.review.controller;
import com.ecommerce.review.models.Review;
import com.ecommerce.review.Service.ReviewService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/avis")
public class ReviewController {
    private final ReviewService reviewService;
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public Review ajouterAvis(@RequestBody Review avis) {
        return reviewService.ajouterAvis(avis);
    }

    @GetMapping("/{id}")
    public Review obtenirAvisParId(@PathVariable Long id) {
        return reviewService.obtenirAvisParId(id);
    }

    @PutMapping("/{id}")
    public Review mettreAvisAJour(@PathVariable Long id, @RequestBody Review avis) {
        return reviewService.mettreAvisAJour(id, avis);
    }

    @DeleteMapping("/{id}")
    public void supprimerAvis(@PathVariable Long id) {
        reviewService.supprimerAvis(id);
    }
}

