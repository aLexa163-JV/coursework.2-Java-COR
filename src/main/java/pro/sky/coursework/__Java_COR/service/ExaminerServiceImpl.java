package pro.sky.coursework.__Java_COR.service;

import pro.sky.coursework.__Java_COR.entities.Question;
import pro.sky.coursework.__Java_COR.exception.InvalidQuestionRequestException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExaminerServiceImpl implements ExaminerService {

    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {

        int size = questionService.getSize();
        if (amount <= 0 || size < amount) {
            throw new InvalidQuestionRequestException(amount, size);
        }
        Set<Question> questions = new HashSet<>();
        while (questions.size() < amount) {
            questions.add(questionService.getRandomQuestion());
        }
        System.out.println("Полученные вопросы " + questions);
        return questions;
    }

}
