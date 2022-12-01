package com.rara.back_office.repository;

import com.rara.back_office.entity.Course;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
	Optional<Course> findById(Long id);
}
