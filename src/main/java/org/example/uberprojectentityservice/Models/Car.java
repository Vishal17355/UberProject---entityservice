package org.example.uberprojectentityservice.Models;

import com.fasterxml.jackson.core.io.CharTypes;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car  extends BaseModel{

    @Column(unique = true , nullable = false )
    private String PlateNumber;

    private String brand;

    @ManyToOne
    private Color color;

    private String Model;

    @Enumerated(value =EnumType.STRING)
    private CarTypes carType;

    @OneToOne
    private Driver driver;
}
