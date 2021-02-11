package springbootWorkshop.JPAMySql.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public City getCity(Long id) {
		Optional<City> result = cityRepository.findById(id);
		if(result.isEmpty()) {
			return null;
		}
		return result.get();
	}

	@Override
	public City postCity(City city) {
		return cityRepository.save(city);
	}

	@Override
	public City updateCity(Long id, City city) {
		Optional<City> result = cityRepository.findById(id);
		if(result.isEmpty()) {
			return null;
		}
		City updateCity = result.get();
		updateCity.setName(city.getName());
		updateCity.setPopulation(city.getPopulation());
		return cityRepository.save(updateCity);
	}

	@Override
	public void deleteCity(Long id) {
		cityRepository.deleteById(id);
	}
	
}
