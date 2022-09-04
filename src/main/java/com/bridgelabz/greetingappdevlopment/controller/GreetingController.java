package com.bridgelabz.greetingappdevlopment.controller;

import java.util.concurrent.atomic.AtomicInteger;


import com.bridgelabz.greetingappdevlopment.model.Greeting;
import com.bridgelabz.greetingappdevlopment.model.User;
import com.bridgelabz.greetingappdevlopment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingController {
    private static final String template="Hello %s";
    private static AtomicInteger counter=new AtomicInteger();

    @Autowired
    GreetingService greetingService;

    @GetMapping("/getGreeting")
    public Greeting greeting(@RequestParam (value="name",defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }
    @PostMapping("/postGreeting")
    public Greeting sayHello(@RequestBody Greeting greeting) {
        return new Greeting(counter.incrementAndGet(),String.format(template, greeting.getContent()));
    }
    @PutMapping("/putMapping/{counter}")
    public Greeting sayHello(@PathVariable Integer counter,@RequestParam (value="content") String content) {
        return new Greeting(counter,String.format(template, content));
    }
    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage(){
        return new ResponseEntity<String>(greetingService.getMessage(),HttpStatus.OK);
    }
    @GetMapping("/getGreetingMessage")
    public ResponseEntity<String>getGreetingMessage(@RequestParam(value="fName",defaultValue="World") String fName,@RequestParam(value="lName",defaultValue="") String lName){
        return new ResponseEntity<String>(greetingService.getGreetingMessage(fName,lName),HttpStatus.OK);
    }
    @PostMapping("/post")
    public ResponseEntity<String> getGreeting(@RequestBody User user){
        return new ResponseEntity<String>(greetingService.postMessage(user),HttpStatus.OK);
    }
    @PostMapping("/saveGreeting")
    public ResponseEntity<Greeting> saveGreeting(@RequestBody Greeting greeting){
        return new ResponseEntity<Greeting>(greetingService.saveMessage(greeting),HttpStatus.OK);
    }
    @GetMapping("/findGreeting")
    public ResponseEntity<String> findGreeting(@RequestParam Integer id){
        return new ResponseEntity<String>(greetingService.getData(id),HttpStatus.OK);
    }
}
