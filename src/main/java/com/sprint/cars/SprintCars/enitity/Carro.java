package com.sprint.cars.SprintCars.enitity;

import com.sprint.cars.SprintCars.dto.CarroDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.math.BigInteger;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carro {

    @Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @NotEmpty
    private String modelo;

    @NotEmpty
    private String kmRodados;

    @NotEmpty
    private String marca;

    @NotEmpty
    private String autonomia;



}
