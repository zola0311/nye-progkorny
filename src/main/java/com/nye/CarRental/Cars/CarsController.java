package com.nye.CarRental.Cars;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }
}
