package pro.sky.coursework.__Java_COR.service;

import pro.sky.coursework.__Java_COR.entities.Question;

import java.util.Collection;
import java.util.Random;

public interface QuestionService {
    boolean add(String question, String answer);

    boolean remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

    int getSize();

    void setRandom(Random random);
}
