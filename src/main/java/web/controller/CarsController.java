package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Car;
import web.config.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model){
        List<Car> list = new ArrayList<>();
        list.add(new Car("DUTSUN", "RED",720));
        list.add(new Car("BMW", "GREY", 700));
        list.add(new Car("KIA", "BLACK",900));
        list.add(new Car("NISSAN", "WHITE", 200));
        list.add(new Car("TESLA", "GREEN", 5));
        list = CarService.carsCount(list, allCars);
        model.addAttribute("list",list);
        return "car";
    }

}
