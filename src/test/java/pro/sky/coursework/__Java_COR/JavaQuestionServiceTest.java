package pro.sky.coursework.__Java_COR;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.coursework.__Java_COR.service.JavaQuestionService;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static pro.sky.coursework.__Java_COR.Constants.*;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {

    private final JavaQuestionService out = new JavaQuestionService();

    @Test
    void add() {
        out.add(QUESTION1, ANSWER1);
        assertTrue(out.getAll().contains(FULL1));
    }

    @Test
    void remove() {
        out.remove(QUESTION1, ANSWER1);
        assertFalse(out.getAll().contains(FULL1));
    }

    @Test
    void getAll() {
        out.add(QUESTION1, ANSWER1);
        out.add(QUESTION2, ANSWER2);
        out.add(QUESTION3, ANSWER3);
        assertTrue(out.getAll().containsAll(List.of(FULL1, FULL2, FULL3)));
    }

    @Test
    void getRandomQuestion() {
        out.add(QUESTION1, ANSWER1);
        out.add(QUESTION2, ANSWER2);

        Random random = mock(Random.class, withSettings().withoutAnnotations());
        when(random.nextInt(anyInt())).thenReturn(1);

        out.setRandom(random);
        assertEquals(FULL2, out.getRandomQuestion());
    }


}
