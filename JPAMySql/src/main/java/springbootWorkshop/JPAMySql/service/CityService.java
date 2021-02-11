package springbootWorkshop.JPAMySql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootWorkshop.JPAMySql.Repository.CityRepository;
import springbootWorkshop.JPAMySql.model.City;

@Service
public class CityService implements ICityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> findAll() {
		return (List<City>) cityRepository.findAll();
	}
	
}
