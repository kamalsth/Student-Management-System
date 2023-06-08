package com.example.crud.service;

/**
 * Importing the necessary classes.
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.entity.Student;
import com.example.crud.repository.StudentRepository;

/**
 * Service class for managing student data.
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    /**
     * Retrieve a list of all students.
     *
     * @return A list of all students.
     */
    public List<Student> listAll() {
        return repo.findAll();
    }

     /**
     * Save a student.
     *
     * @param std The student to be saved.
     */
    public void save(Student std) {
        repo.save(std);
    }

    /**
     * Get a student by ID.
     *
     * @param id The ID of the student to retrieve.
     * @return The student with the specified ID.
     */
    public Student get(long id) {
        return repo.findById(id).get();
    }

    /**
     * Delete a student by ID.
     *
     * @param id The ID of the student to delete.
     */
    public void delete(long id) {
        repo.deleteById(id);
    }
}
