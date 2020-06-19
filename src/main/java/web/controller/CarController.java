package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.CarService;
import java.util.Locale;
import java.util.ResourceBundle;

@Controller
@RequestMapping("/")
public class CarController {

@Autowired
CarService carService;

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printWelcome(ModelMap model,Locale locale) {
        carService.clearCars();
        carService.addCars();
        ResourceBundle myRes = ResourceBundle.getBundle("messages",locale);
        model.addAttribute("cars", carService.getAllCars());
        model.addAttribute("resLang", myRes);
        return "cars";
    }

}