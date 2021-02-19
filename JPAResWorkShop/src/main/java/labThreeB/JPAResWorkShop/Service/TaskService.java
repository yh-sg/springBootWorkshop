package labThreeB.JPAResWorkShop.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import labThreeB.JPAResWorkShop.Model.Task;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;
	
	public List<Task> findAll(){
		return repository.findAll();
	}
	
	public Optional<Task> findById(Long id){
		Optional<Task> task = repository.findById(id);
		return task;
	}
	
	public Long countByTitleContaining(String title) {
		return repository.countByTitleContaining(title);
	}
}
