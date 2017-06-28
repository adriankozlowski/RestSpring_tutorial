package com.example.demo.repository;

import com.example.demo.model.Flat;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Adrian on 28.06.2017.
 */
public interface FlatRepository extends JpaRepository<Flat,Integer> {
}
