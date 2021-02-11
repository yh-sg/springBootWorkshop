package springbootWorkshop.JPAMySql.service;

import java.util.List;

import springbootWorkshop.JPAMySql.model.City;

public interface ICityService {
	List<City> findAll();
}
