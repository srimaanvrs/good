package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="dime")
public class order {
    @Id
    public Integer i;
    public String name;
    public int no;
    @ManyToOne
    @JoinColumn(name="Id")
    public Noot Not;

    public order() {
    }
    public order(Integer i, String name, int no, Noot not) {
        this.i = i;
        this.name = name;
        this.no = no;
        Not = not;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
   @JsonBackReference
    public Noot getNot() {
        return Not;
    }

    public void setNot(Noot not) {
        Not = not;
    }
}
