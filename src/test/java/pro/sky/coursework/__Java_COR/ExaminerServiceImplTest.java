package pro.sky.coursework.__Java_COR;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.coursework.__Java_COR.entities.Question;
import pro.sky.coursework.__Java_COR.service.ExaminerServiceImpl;
import pro.sky.coursework.__Java_COR.service.QuestionService;

import java.util.Collection;
import java.util.Set;

import static org.mockito.Mockito.when;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;
import static pro.sky.coursework.__Java_COR.Constants.FULL1;
import static pro.sky.coursework.__Java_COR.Constants.QUESTION_SET_2;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    QuestionService mock;
    @InjectMocks
    ExaminerServiceImpl out;

    @Test
    public void getQuestionsTest() {
        when(mock.getSize()).thenReturn(1);
        when(mock.getRandomQuestion()).thenReturn(FULL1);
        assertEquals(QUESTION_SET_2, out.getQuestions(1));
    }

    private void assertEquals(Set<Question> questionSet2, Collection<Question> questions) {
    }

}
