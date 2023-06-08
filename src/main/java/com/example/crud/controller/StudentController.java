package com.example.crud.controller;

/**
 * Importing the necessary classes.
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.crud.domain.Student;
import com.example.crud.service.StudentService;

/**
 * Controller class that handles HTTP requests related to students.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    /**
     * Handles the HTTP GET request for the home page.
     *
     * @param model The Model object that is used to store and pass data from  the controller to the view.
     * @return The view named "index" to render the home page.
     */
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Student> liststudent = service.listAll();
        model.addAttribute("liststudent", liststudent);
        System.out.print("Get / ");
        return "index";
    }

    /**
     * Handles the HTTP GET request to add a new student.
     *
     * @param model The Model object that is used to store and pass data from
     * the controller to the view.
     * @return The view named "new" to render form for adding new students.
     */
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        return "new";
    }

    /**
     * Handles the HTTP GET request to update a student.
     *
     * @param model The Model object that is used to store and pass data from
     * the controller to the view.
     * @return The view named "update" to render form for updating the existing
     * student's data.
     */
    @GetMapping("/update")
    public String update(Model model) {
        model.addAttribute("student", new Student());
        return "update";
    }

    /**
     * Handles the HTTP POST request to save a student's datas.
     *
     * @param std The Student object to be saved.
     * @return A redirect to the home page ("/") after saving the student's datas.
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student std) {
        service.save(std);
        return "redirect:/";
    }

    /**
     * Handles the HTTP GET request to show the edit student page.
     *
     * @param id The ID of the student to be edited.
     * @return A ModelAndView object representing the "update" view with the student data to be edited.
     */
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("update");
        Student std = service.get(id);
        mav.addObject("student", std);
        return mav;

    }

    /**
     * Handles the HTTP GET request to delete a student.
     *
     * @param id The ID of the student to be deleted.
     * @return A redirect to the index page ("/") after deleting the student.
     */
    @RequestMapping("/delete/{id}")
    public String deletestudent(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
}
