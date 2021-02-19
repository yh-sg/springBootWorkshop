package labThreeB.JPAResWorkShop.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import labThreeB.JPAResWorkShop.Model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	Long countByTitleContaining(String title);
	Page<Task> findByTitleContaining(String title, Pageable pageable);
}
