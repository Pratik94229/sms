package repository;

import entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<student, Long> {
}
