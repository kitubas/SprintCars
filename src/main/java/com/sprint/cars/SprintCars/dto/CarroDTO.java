package com.sprint.cars.SprintCars.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarroDTO {

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
