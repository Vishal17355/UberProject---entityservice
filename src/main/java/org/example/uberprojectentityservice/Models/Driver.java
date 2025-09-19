package org.example.uberprojectentityservice.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "bookings")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler" , "bookings"})
public class Driver extends BaseModel {
    private String name;

    @Column(nullable = false, unique = true)
    private String licenseNumber;


    private String phoneNumber;


    private String aadharCard;

   @OneToOne(mappedBy = "driver" , cascade = CascadeType.ALL)
    private Car car;

@Enumerated(value = EnumType.STRING)
 private DriverApprovalStatus driverApprovalStatus;


@OneToOne
private ExactLocation lastknownlocation;

@OneToOne
private ExactLocation home;


private String activeCity;


@DecimalMin(value="0.01" , message = "Rating must be  greater than or equal to 0.00")
@DecimalMax(value = "5.00" , message = "Rating must be less than or eqaul to 5.00")
private double rating;

    @OneToMany(mappedBy = "driver")
    @Fetch(FetchMode.SUBSELECT)
    @Builder.Default
    private Set<Booking> bookings = new HashSet<>();
}
