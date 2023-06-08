package com.example.crud;


/**
 * Importing the necessary classes.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main class that initializes and runs the CRUD application.
 */
@SpringBootApplication
public class CrudApplication {

    /**
     * The entry point of the application.
     *
     * @param args The command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

}
