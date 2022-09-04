package com.bridgelabz.greetingappdevlopment.repository;
import com.bridgelabz.greetingappdevlopment.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {

}
