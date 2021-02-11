package springbootWorkshop.JPAMySql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootWorkshop.JPAMySql.model.City;
import springbootWorkshop.JPAMySql.service.CityService;

@RestController
@RequestMapping("/cities")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping
	public List<City> findCities(){
		return cityService.findAll();
	}
}
