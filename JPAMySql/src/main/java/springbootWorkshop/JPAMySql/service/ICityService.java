package springbootWorkshop.JPAMySql.service;

import java.util.List;

import springbootWorkshop.JPAMySql.model.City;

public interface ICityService {
	List<City> findAll();
	City getCity(Long id);
	City postCity(City city);
	City updateCity(City city);
	void deleteCity(Long id);
}
