package labThreeB.JPAResWorkShop.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import labThreeB.JPAResWorkShop.Model.Task;
import labThreeB.JPAResWorkShop.Service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private TaskService service;
	
	@GetMapping({"", "/"})
	public List<Task> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Task> findById(@PathVariable Long id) {
		Optional<Task> task = service.findById(id);
		if (task.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND,
			"Task not found");
		}
		return task;
	}
	
	@GetMapping("/count/{keyword}")
		public Long countByTitleContains(@PathVariable String keyword) {
		return service.countByTitleContaining(keyword);
	}
}
