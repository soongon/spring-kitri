package kr.re.kitri.spring2023.exception;

import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice // 모든 컨트롤러에 대한 예외처리를 수행하는 클래스임을 알려줌
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = BadSqlGrammarException.class)
    public String handleBadSqlGrammarException(BadSqlGrammarException e) {
        return "잘못된 SQL 문법입니다.";
    }
}
