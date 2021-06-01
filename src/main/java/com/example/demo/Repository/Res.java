package com.example.demo.Repository;

import com.example.demo.model.order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Res extends JpaRepository<order,Integer> {
}
