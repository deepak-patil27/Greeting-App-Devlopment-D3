package com.bridgelabz.greetingappdevlopment.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getMessage() {
        return "Hello World";
    }
    public String getGreetingMessage(String fName, String lName) {
        return "Hello "+fName+""+lName;
    }
    public String postMessage(String fName,String lName) {
        return "Hello "+fName+""+lName;
    }
}
