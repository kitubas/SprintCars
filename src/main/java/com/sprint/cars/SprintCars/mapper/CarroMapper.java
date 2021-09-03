package com.sprint.cars.SprintCars.mapper;

import com.sprint.cars.SprintCars.dto.CarroDTO;
import com.sprint.cars.SprintCars.enitity.Carro;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public interface CarroMapper {

    CarroMapper INSTANCE = Mappers.getMapper(CarroMapper.class);

    Carro toModel(CarroDTO carroDTO);
    CarroDTO toDTO(Carro carro);


}

