package springbootWorkshop.JPAMySql.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springbootWorkshop.JPAMySql.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	
}
