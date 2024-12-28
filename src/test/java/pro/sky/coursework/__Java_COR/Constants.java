package pro.sky.coursework.__Java_COR;

import pro.sky.coursework.__Java_COR.entities.Question;

import java.util.Set;

public class Constants {

    public static final String QUESTION1 = "Вопрос 1";
    public static final String QUESTION2 = "Вопрос 2";
    public static final String QUESTION3 = "Вопрос 3";

    public static final String ANSWER1 = "Ответ 1";
    public static final String ANSWER2 = "Ответ 2";
    public static final String ANSWER3 = "Ответ 3";

    public static final Question FULL1 = new Question(QUESTION1, ANSWER1);
    public static final Question FULL2 = new Question(QUESTION2, ANSWER2);
    public static final Question FULL3 = new Question(QUESTION3, ANSWER3);

    public static final Set<Question> QUESTION_SET_1 = Set.of(FULL1, FULL2, FULL3);
    public static final Set<Question> QUESTION_SET_2 = Set.of(FULL1);

    public static final String EMPTY_ANSWER = null;


}
