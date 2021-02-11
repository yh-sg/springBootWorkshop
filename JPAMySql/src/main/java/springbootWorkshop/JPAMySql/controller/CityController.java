package springbootWorkshop.JPAMySql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value="/{id}")
	public City findCity(@PathVariable Long id) {
		return cityService.getCity(id);
	}
	
	@PostMapping
	public City addCity(@RequestBody City city) {
		return cityService.postCity(city);
	}
	
	@DeleteMapping(value="/{id}")
	public void deleteCity(@PathVariable Long id) {
		cityService.deleteCity(id);
	}
	
	@PutMapping(value="/{id}")
	public City updateCity(@PathVariable Long id,@RequestBody City city) {
		return cityService.updateCity(id, city);
	}
}
