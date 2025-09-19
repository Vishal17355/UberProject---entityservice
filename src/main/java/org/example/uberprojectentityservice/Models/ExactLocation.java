package org.example.uberprojectentityservice.Models;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExactLocation extends BaseModel {
    private double latitude;
    private double longitude;
}
