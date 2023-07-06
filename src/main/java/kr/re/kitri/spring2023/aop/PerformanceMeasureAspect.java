package kr.re.kitri.spring2023.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class PerformanceMeasureAspect {

    @Around("execution(* kr.re.kitri.spring2023.service.PostService.*(..))")
    public Object measurePerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        // before에 실행되는 코드
        long start = System.currentTimeMillis();
        // 타겟메소드를 실제로 실행
        Object obj = joinPoint.proceed();
        // after에 실행되는 코드
        long end = System.currentTimeMillis();
        long measuredTime = end - start;
        log.debug(joinPoint.getSignature().getDeclaringTypeName()
                + "클래스의 " + joinPoint.getSignature().getName()
                + "메소드의 수행시간: " + measuredTime + "ms");
        return obj;
    }
}
