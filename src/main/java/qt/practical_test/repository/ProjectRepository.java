package qt.practical_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import qt.practical_test.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
