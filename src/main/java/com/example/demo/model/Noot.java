package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="demo")
public class Noot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    private int rating;
   @OneToMany(mappedBy = "No",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   private List<order> or;

    public Noot() {
    }

    public Noot(Integer id, String name, int rating, List<order> or) {
        Id = id;
        this.name = name;
        this.rating = rating;
        this.or = or;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    @JsonManagedReference
    public List<order> getOr() {
        return or;
    }

    public void setOr(List<order> or) {
        this.or = or;
    }
}
