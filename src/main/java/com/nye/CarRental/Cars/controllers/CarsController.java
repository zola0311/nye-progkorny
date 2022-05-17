package com.nye.CarRental.Cars.controllers;

import com.nye.CarRental.Cars.models.CarsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping("/")
    public String showIndex(Model model) {
        List<CarsModel> cars = new ArrayList<>();
        cars.add(new CarsModel(1, "Audi", "A6", "Benzin", "265678", "Fehér", "Nem"));
        cars.add(new CarsModel(2, "Toyota", "Hilux", "Dízel", "476598", "Barna", "Nem"));
        model.addAttribute("cars", cars);
        return "index";
    }

    @GetMapping("/create")
    public String showCreate(@ModelAttribute List<CarsModel> cars, Model model) {
        model.addAttribute("cars", cars);
        return "addNewCar";
    }
}
