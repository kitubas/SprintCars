package com.sprint.cars.SprintCars.Controller;

import com.sprint.cars.SprintCars.dto.CarroDTO;
import com.sprint.cars.SprintCars.enitity.Carro;
import com.sprint.cars.SprintCars.respository.CarroRepository;
import com.sprint.cars.SprintCars.service.CarroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teste")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CarroController {

       private final CarroService carroService;

        @GetMapping("/findByModelo/{modelo}")
        public String getByModelo(@PathVariable String modelo){
            return carroService.getByModelo(modelo).toString();
        }

        @GetMapping("/findByMarca/{marca}")
        public List<Carro> getByMarca(@PathVariable String marca){
            return carroService.getByMarca(marca);
        }

        @GetMapping
        public List<Carro> getAll(){
            return carroService.getAll();
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public String salvar(@RequestBody CarroDTO carroDTO){

            return carroService.createCarro(carroDTO);

        }



}
