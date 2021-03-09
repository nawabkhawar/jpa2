package com.example.jpa2;

import com.example.jpa2.dto.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    JPARepository jpaRepository;

    /*@GetMapping("getClubs")
    public List<Club> getName(String name){
        List<Club> clubs = jpaRepository.findByClub(name);
        return clubs;
    }*/

    @GetMapping("getClubs")
    public String getName(String name){
        //List<Club> clubs = jpaRepository.findByClub(name);
        return "nawab";
    }
}
