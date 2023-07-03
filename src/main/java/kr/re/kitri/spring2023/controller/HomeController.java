package kr.re.kitri.spring2023.controller;

import kr.re.kitri.spring2023.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private OrderService orderService;

    public HomeController(OrderService orderService) {
        this.orderService = orderService;
    }
    //
//    @Autowired
//    public void setOrderService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    @GetMapping("/order")
    public String order() {
        // 주문기능을 수행..
        // 회원의 포인트를 50포인트 증가
        // 주문 테이블에 주문정보 인서트
        // 배송 테이블에 인서트
        // 상품 테이블에 재고를 감소
        return orderService.doOrder();
    }
    @GetMapping("/")
    public String home() {
        return "홈페이지 입니다.";
    }

    //  "/spring" <-- 이 url 로 요청이 오면 "안녕 스프링"이라고 응답..
    @GetMapping("/spring")
    public String spring() {
        return "안녕 스프링";
    }


}
