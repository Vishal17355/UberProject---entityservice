package org.example.uberprojectentityservice.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dbconstant extends BaseModel{
    @Column(unique = true , nullable = false)
    private String name;

    private String value;
}
