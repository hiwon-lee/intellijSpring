package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


// MVC모델 (Manage, View, Controller)
@Controller
public class HelloController {
    @GetMapping("hello") // get형식으로 보낸거랑 마찬가지
    public String hello(Model model) { // 모델이 키값이 data고 값이 hello!!인 객체?가 담기게 됨
        model.addAttribute("data", "hello!!dfsdf");
        return "hello"; // hello.html로 찾아가서 랜더링해라
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // http에서 header,body에서 body에 내용을 직접 넣어주겎다.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;  // "hello spring"
    }

    // json 방식으로 보여짐
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }


    static class Hello {
        private String name;

        // java Bean 표준 방식, 프로퍼티 접근방식
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }



}