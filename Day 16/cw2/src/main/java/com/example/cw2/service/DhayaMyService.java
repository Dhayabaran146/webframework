package com.example.cw2.service;

import org.springframework.stereotype.Service;

@Service
public class DhayaMyService {

    public String process(String input) {
        System.out.println("Processing: " + input);
        return "Processed: " + input;
    }
}
