package org.example.uberprojectentityservice.Models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Random;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OTP  extends BaseModel {

    private String code;

    private String sentToNumber;

    public static OTP make(String phoneNumber){
        Random random = new Random();
        int randomInt = random.nextInt(9000) + 1000;

        String phoneNUmber;
        return OTP.builder().code(builder().code).sentToNumber(phoneNumber).build();
    }
}
