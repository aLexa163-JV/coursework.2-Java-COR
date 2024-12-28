package pro.sky.coursework.__Java_COR.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pro.sky.coursework.__Java_COR.entities.Question;
import pro.sky.coursework.__Java_COR.service.ExaminerService;

import java.util.Collection;

public class ExamController {

    private final ExaminerService service;

    public ExamController(ExaminerService service) {
        this.service = service;
    }

    @GetMapping("/exam/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return service.getQuestions(amount);
    }
}
