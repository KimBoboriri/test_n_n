package com.springvue.prectice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/selectlist")
    public ResponseEntity<?> TestMethod() {
        System.out.println("전체조회 컨트롤러 호출");
        return ResponseEntity.ok("");
    }

}
