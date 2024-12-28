package pro.sky.coursework.__Java_COR.service;

import pro.sky.coursework.__Java_COR.entities.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
