package com.example.demo.Repository;

import com.example.demo.model.Noot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Respond extends JpaRepository<Noot,Integer> {

    Noot getid(Integer h);
}
