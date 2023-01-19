package cars.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cars.api.dto.CarsDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {
    @PostMapping
    public void createCar(@RequestBody CarsDTO request) {
        System.out.println("Modelo do carro: " + request.modelo());
        System.out.println("Fabricante: " + request.fabricante());
        System.out.println("Data de fabricação: " + request.dataFabricacao());
        System.out.println(String.format("Valor: %.3f", request.valor()));
        System.out.println("Ano do modelo: " + request.anoModelo());
    }
}       
