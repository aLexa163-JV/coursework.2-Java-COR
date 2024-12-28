package pro.sky.coursework.__Java_COR.service;

import pro.sky.coursework.__Java_COR.entities.Question;

import java.util.*;

public class JavaQuestionService implements QuestionService {

    private final Set<Question> questionRepository = new HashSet<>();
    private Random random = new Random();

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public boolean add(String question, String answer) {
        return questionRepository.add(new Question(question, answer));
    }

    @Override
    public boolean remove(String question, String answer) {
        return questionRepository.remove(new Question(question, answer));
    }

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questionRepository);
    }

    @Override
    public Question getRandomQuestion() {
        return List.copyOf(questionRepository).get(random.nextInt(questionRepository.size()));
    }

    @Override
    public int getSize() {
        return questionRepository.size();
    }
}
