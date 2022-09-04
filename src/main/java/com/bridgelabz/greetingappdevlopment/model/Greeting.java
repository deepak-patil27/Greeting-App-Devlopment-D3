package com.bridgelabz.greetingappdevlopment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue
    private Integer id;
    private String content;
    public Greeting() {

    }
    public Greeting(String content) {
        this.content =content;
    }
    public Greeting(Greeting greeting) {
        this.id =greeting.id;
        this.content =greeting.content;
    }
    public Greeting(Integer id, String content) {
        super();
        this.id = id;
        this.content = content;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
