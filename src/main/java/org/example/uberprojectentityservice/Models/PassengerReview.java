package org.example.uberprojectentityservice.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PassengerReview extends  Review{

    @Column(nullable = false)
    private String pasengerreviewComment;

    @Column(nullable=false)
    private  String passengerRating;
}
