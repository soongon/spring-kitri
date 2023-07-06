package kr.re.kitri.spring2023.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

@Value // getter, equals, hashCode, toString 자동 생성
@AllArgsConstructor
public class ErrorMessage {
    String errorCode;
    String message;
}
