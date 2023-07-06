package kr.re.kitri.spring2023.exception;

import kr.re.kitri.spring2023.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice // 모든 컨트롤러에 대한 예외처리를 수행하는 클래스임을 알려줌
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BadSqlGrammarException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorMessage handleBadSqlGrammarException(BadSqlGrammarException e) {
        return new ErrorMessage("DB-001", "데이터베이스 오류가 발생했습니다.");
    }
}
