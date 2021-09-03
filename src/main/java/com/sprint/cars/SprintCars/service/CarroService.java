package com.sprint.cars.SprintCars.service;

import com.sprint.cars.SprintCars.dto.CarroDTO;
import com.sprint.cars.SprintCars.enitity.Carro;
import com.sprint.cars.SprintCars.mapper.CarroMapper;
import com.sprint.cars.SprintCars.respository.CarroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CarroService {

    private final CarroRepository carroRepository;

    private final CarroMapper carroMapper = CarroMapper.INSTANCE;

    public String createCarro(CarroDTO carroDTO) {
        Carro carroToSave = carroMapper.toModel(carroDTO);
        carroRepository.save(carroToSave);
        return "Carro salvo com sucesso";
    }

    public Carro getByModelo(String modelo) {
       return carroRepository.findByModelo(modelo);
    }

    public List<Carro> getByMarca(String marca) {
        return carroRepository.findByMarca(marca);
    }

    public List<Carro> getAll() {
        return carroRepository.findAll();
    }


}
