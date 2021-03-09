package com.example.jpa2;

import com.example.jpa2.dto.Club;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JPARepository extends CrudRepository {
    List<Club> findByClub(String name);
}
