package qt.practical_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qt.practical_test.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
