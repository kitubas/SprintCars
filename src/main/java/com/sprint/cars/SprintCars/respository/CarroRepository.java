package com.sprint.cars.SprintCars.respository;

import com.sprint.cars.SprintCars.enitity.Carro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface CarroRepository extends MongoRepository<Carro, String> {

    public Carro findByModelo(String modelo);
    public List<Carro> findByMarca(String marca);


}
