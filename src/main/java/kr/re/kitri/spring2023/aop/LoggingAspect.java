package kr.re.kitri.spring2023.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* kr.re.kitri.spring2023.controller.PostController.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String clsName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        log.info(clsName + "." + methodName +  " 실행 전에 로그를 남깁니다.");
    }
}
