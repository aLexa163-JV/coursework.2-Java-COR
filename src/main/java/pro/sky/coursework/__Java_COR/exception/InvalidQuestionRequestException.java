package pro.sky.coursework.__Java_COR.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidQuestionRequestException extends IllegalArgumentException {
    public InvalidQuestionRequestException(int amount, int storageSize) {
        super(String.format("Requested amount " + amount + " more then current size " + storageSize));
    }
}
