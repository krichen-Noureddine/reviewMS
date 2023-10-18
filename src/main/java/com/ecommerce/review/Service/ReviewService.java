package com.ecommerce.review.Service;

import com.ecommerce.review.repository.ReviewRepo;
import com.ecommerce.review.models.Review;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private final ReviewRepo reviewRepository;

    public ReviewService(ReviewRepo reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review ajouterAvis(Review avis) {
        // Implémentez ici la logique pour ajouter un nouvel avis
        return reviewRepository.save(avis);
    }

    public Review obtenirAvisParId(Long id) {
        // Implémentez ici la logique pour récupérer l'avis par son identifiant en utilisant reviewRepository
        return reviewRepository.findById(id).orElse(null);
    }

    public Review mettreAvisAJour(Long id, Review avis) {
        // Implémentez ici la logique pour mettre à jour l'avis en utilisant reviewRepository
        // Assurez-vous de vérifier si l'avis avec l'identifiant donné existe avant de le mettre à jour
        return reviewRepository.findById(id)
                .map(avisExistant -> {
                    avisExistant.setCommentaire(avis.getCommentaire());
                    avisExistant.setNotation(avis.getNotation());
                    // Mettez à jour d'autres champs si nécessaire
                    return reviewRepository.save(avisExistant);
                })
                .orElse(null);
    }

    public void supprimerAvis(Long id) {
        // Implémentez ici la logique pour supprimer l'avis en utilisant reviewRepository
        reviewRepository.deleteById(id);
    }
}