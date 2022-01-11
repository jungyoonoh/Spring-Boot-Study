package org.example.yoonoh.springboot.web;

import org.example.yoonoh.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController : 컨트롤러를 JSON으로 반환하는 컨트롤러로 만들어준다
@RestController
public class HelloController {

    // @RestController : 컨트롤러를 JSON으로 반환하는 컨트롤러로 만들어준다
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // @RequestParam : 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}
