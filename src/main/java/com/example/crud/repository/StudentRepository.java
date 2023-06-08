package com.example.crud.repository;

/**
 * Importing the necessary classes.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.domain.Student;


/**
 * Repository interface for accessing and managing student data.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // No additional methods defined in this interface.

}
