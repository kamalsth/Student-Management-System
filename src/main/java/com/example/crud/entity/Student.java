package com.example.crud.entity;


/**
 * Importing the necessary classes.
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * Entity class representing a student.
 */
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String phone;
    
    /**
     * Default constructor for the Student class.
     */
    public Student() {
        super();
    }

     /**
     * Constructor for the Student class with all fields.
     *
     * @param id      The ID of the student.
     * @param name    The name of the student.
     * @param address The address of the student.
     * @param phone   The phone number of the student.
     */
    public Student(Long id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Get the ID of the student.
     *
     * @return The ID of the student.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the student.
     *
     * @param id The ID of the student.
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Get the name of the student.
     *
     * @return The name of the student.
     */

    public String getName() {
        return name;
    }

    /**
     * Set the name of the student.
     *
     * @param name The name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the address of the student.
     *
     * @return The address of the student.
     */
    public String getAddress() {
        return address;
    }

      /**
     * Set the address of the student.
     *
     * @param address The address of the student.
     */
    public void setAddress(String address) {
        this.address = address;
    }

     /**
     * Get the phone number of the student.
     *
     * @return The phone number of the student.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set the phone number of the student.
     *
     * @param phone The phone number of the student.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
