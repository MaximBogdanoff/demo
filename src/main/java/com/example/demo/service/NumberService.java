package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumberService {
    public List<Integer> processNumbers(List<Integer> numbers) {
        List<Integer> processedList = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                processedList.add(number + 1);
            } else {
                processedList.add(number);
            }
        }
        return processedList.subList(2, Math.min(7, processedList.size()));
    }
}
