package com.example.demo.controller;
import com.example.demo.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/numbers")
public class NumberController {
    private final NumberService numberService;
    @Autowired
    public NumberController(NumberService numberService){this.numberService=numberService;}
    @PostMapping("/process")
    public List<Integer> processNumbers (@RequestBody List<Integer> numbers){
        return numberService.processNumbers(numbers);
    }
}
